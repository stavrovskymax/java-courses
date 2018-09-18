package ru.lesson.lessions.ClinicAnimals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicTest {

    @Test
    public void testFindClientByPetName() throws Exception {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(1, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(2, new Client("Slava", new Cat(new Pet("Cat"))));
        assertEquals("0: Client: Max, Pet: Dog", clinic.findClientByPetName("Dog"));
    }

    @Test
    public void testEditClientName() throws Exception {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(1, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(2, new Client("Slava", new Cat(new Pet("Cat"))));
        clinic.editClientName(1, "Bob");
        assertEquals("Bob", clinic.clients[1].id);
    }

    @Test
    public void testDeleteClient() throws Exception {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(1, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(2, new Client("Slava", new Cat(new Pet("Cat"))));
        clinic.deleteClient(1);
        assertNull(clinic.clients[1]);
    }

    @Test (expected = UserExceptionClinic.class)
    public void testAddClient() throws Exception {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(1, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(2, new Client("Slava", new Cat(new Pet("Cat"))));
        clinic.addClient(3, new Client("Slava", new Cat(new Pet("Cat"))));
    }

    @Test (expected = UserExceptionClinic.class)
    public void testFindPetByClientName() throws Exception {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(1, new Client("Max", new Dog(new Pet("Dog"))));
        clinic.addClient(2, new Client("Slava", new Cat(new Pet("Cat"))));
        clinic.findPetByClientName("Sergey");
    }
}
