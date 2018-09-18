package ru.lesson.lessions.ClinicAnimals;

public class Clinic {
    private static final String ERROR_CLIENT_NOT_FOUND = "Error! Client not found";
    private static final String ERROR_CLINIC_IS_FULL = "Error! Clinic is full";

    final Client[] clients;
    final int size;

    public Clinic(final int size) {
        this.clients = new Client[size];
        this.size = size;
    }
    
    public void addClient(final int position, final Client client) throws UserExceptionClinic {
        if (position < this.size) {
            this.clients[position] = client;
        } else {
            throw new UserExceptionClinic(ERROR_CLINIC_IS_FULL);
        }
    }

    public void showClient() {
        for (int i=0; i < clients.length; i++) {
            if (this.clients[i] != null) {
                 System.out.println(i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.getName());
            }
        }
    }
    
    public String findClientByPetName(final String name) {
        for (int i=0; i < this.clients.length; i++) {
            if (this.clients[i] != null) {
                if (name.equals(this.clients[i].pet.getName())) {
                    return i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.getName();
                }
            }
        }
        return ERROR_CLIENT_NOT_FOUND;
    }
    
    public void findPetByClientName(final String name) throws UserExceptionClinic {
        int count = 0;
        for (int i=0; i < this.clients.length; i++) {
            if (this.clients[i] != null) {
                if (name.equals(this.clients[i].id)) {
                     System.out.println(i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.getName());
                     count++;
                }
            }
        }
        if (count == 0) {
            throw new UserExceptionClinic("Error! Pet not found");
        }
    }
    
    public void editClientName(final int position, final String rename) {
        this.clients[position].id = rename;
    }
    
    public void editPetName(final int position, final String rename) {
        this.clients[position].pet.setName(rename);
    }
    
    public void deleteClient(final int position) {
        this.clients[position] = null;

        if (this.clients[position] == null) {
            System.out.println("Client[" + position + "] is delete");
        }
    }
    
    public void deletePet(final int position) {
        this.clients[position].pet = null;
    }
}