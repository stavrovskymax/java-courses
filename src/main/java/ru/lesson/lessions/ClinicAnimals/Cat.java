package ru.lesson.lessions.ClinicAnimals;

public class Cat implements IPet {
 
    private final IPet pet;
    
    public Cat(Pet pet) {
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