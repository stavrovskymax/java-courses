class ClinicRunner {
    public static void main(String args[]) {
        Clinic clinic = new Clinic(3);
    
        System.out.println("Added clients");
        clinic.addClient(0, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(1, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(2, new Client("Slava", new Cat(new Pet("Cat"))));
        clinic.showClient();

        System.out.println();

        System.out.println("Find client(s) by pet name");        
        clinic.findClientByPetName("Dog");

        System.out.println();

        System.out.println("Find pet(s) by client name");        
        clinic.findPetByClientName("Max");

        System.out.println();

        System.out.println("Edit client name");        
        clinic.editClientName(1, "Bob");
        System.out.println(1 + ": Client: " + clinic.clients[1].id + ", Pet: " + clinic.clients[1].pet.getName());
        
        System.out.println();

        System.out.println("Delete client");
        clinic.deleteClient(1);
    }
}
    