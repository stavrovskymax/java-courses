public class Clinic {
    final Client[] clients;
    
    public Clinic(final int size) {
        this.clients = new Client[size];
    }
    
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }
    
    public void showClient() {
        for (int i=0; i < clients.length; i++) {
            if (this.clients[i] != null) {
                 System.out.println(i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.getName());
            }
        }
    }
    
    public void findClientByPetName(final String name) {
        int count = 0;
        for (int i=0; i < this.clients.length; i++) {
            if (this.clients[i] != null) {
                if (name.equals(this.clients[i].pet.getName())) {
                     System.out.println(i + ": Client: " + this.clients[i].id + ", Pet: " + this.clients[i].pet.getName());
                     count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Not found");
        }
    }
    
    public void findPetByClientName(final String name) {
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
            System.out.println("Not found");
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