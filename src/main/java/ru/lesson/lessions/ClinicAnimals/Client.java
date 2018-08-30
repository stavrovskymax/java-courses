package ru.lesson.lessions.ClinicAnimals;

public class Client {
    String id;
    IPet pet;
    
    public Client(String id, IPet pet) {
        this.id = id;
        this.pet = pet;
    }
}