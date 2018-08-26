class ClinicRunner {
    public static void main(String args[]) {
        Clinic clinic = new Clinic(3);
        String find;
    
        clinic.addClient(0, new Client("Max", new Dog.setName("Dog")));
//        clinic.addClient(1, new Client("Max", new Dog(new Pet("Dog"))));
//        clinic.addClient(2, new Client("Slava", new Cat(new Cat("Cat"))));
        clinic.petByClient();
        
//        System.out.println(clinic.findClientByPetName("Dog"));
        
/*        clinic.findPetByClientName("Max");
        
        clinic.editClientName(1, "Bob");
        System.out.println(1 + ": Client: " + clinic.clients[1].id + ", Pet: " + clinic.clients[1].pet.getName);
        
        clinic.deleteClient(1);
        System.out.println(1 + ": Client: " + clinic.clients[1].id + ", Pet: " + clinic.clients[1].pet.getName); */
    }
}
    