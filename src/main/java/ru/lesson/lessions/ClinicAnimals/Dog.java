package ru.lesson.lessions.ClinicAnimals;

public class Dog implements IPet {

    private final IPet pet;
    
    public Dog(final Pet pet) {
        this.pet = pet;
    }
    
    @Override
    public String getName(){
        return this.pet.getName();
    }
	
    @Override
    public void setName(final String name) {
        this.pet.setName(name);
    }
}