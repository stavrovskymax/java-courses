package ru.lesson.ClinicAnimals;

class Pet {
    String animal;
    
    Pet(String animal) {
        this.animal = animal;
    }
}

class Client {
    String id;
    Pet pet;
    
    Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }
}

class Clinic {
    final Client[] clients;
    
    Clinic(final int size) {
        this.clients = new Client[size];
    }
    
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }
    
    public void petByClient() {
        for (int i=0; i < clients.length; i++) {
            System.out.println(i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.animal);
        }
    }
    
    public Client[] findClientByPetName(final String name) {
        for (int i=0; i < this.clients.length; i++) {
            if (name.equals(this.clients[i].pet.animal)) {
                return clients;
            }
        }
        return null;
    }
    
    public void findPetByClientName(final String name) {
        int count = 0;
        for (int i=0; i < this.clients.length; i++) {
            if (name.equals(this.clients[i].id)) {
                System.out.println(i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.animal);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found");
        }
    }
    
    public void editClientName(final int position, final String rename) {
        this.clients[position].id = rename;
    }
    
    public void editPetName(final int position, final String rename) {
        this.clients[position].pet.animal = rename;
    }
    
    public void deleteClient(final int position) {
        this.clients[position] = null;
    }
    
    public void deletePet(final int position) {
        this.clients[position].pet = null;
    }
}

class Clinic123 {
    public static void main(String args[]) {
        Clinic clinic = new Clinic(3);
        String find;
    
        clinic.addClient(0, new Client("Max", new Pet("Dog")));
        clinic.addClient(1, new Client("Max", new Pet("Dog")));
        clinic.addClient(2, new Client("Slava", new Pet("Cat")));
        clinic.petByClient();
        
        System.out.println(clinic.findClientByPetName("Dog"));
        
        clinic.findPetByClientName("Max");
        
        clinic.editClientName(1, "Bob");
        System.out.println(1 + ": Client: " + clinic.clients[1].id + ", Pet: " + clinic.clients[1].pet.animal);
        
        clinic.deleteClient(1);
        System.out.println(1 + ": Client: " + clinic.clients[1].id + ", Pet: " + clinic.clients[1].pet.animal);
    }
}