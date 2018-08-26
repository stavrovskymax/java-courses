public class Clinic {
    final Client[] clients;
    
    public Clinic(final int size) {
        this.clients = new Client[size];
    }
    
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }
    
    public void petByClient() {
        for (int i=0; i < clients.length; i++) {
            System.out.println(i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.getName);
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
                System.out.println(i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.getName);
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
        this.clients[position].pet.setName = rename;
    }
    
    public void deleteClient(final int position) {
        this.clients[position] = null;
    }
    
    public void deletePet(final int position) {
        this.clients[position].pet = null;
    }
}