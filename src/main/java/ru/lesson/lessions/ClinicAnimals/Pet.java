package ru.lesson.lessions.ClinicAnimals;

public class Pet implements IPet {

    private String name;
    
    public Pet(final String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
	
    @Override
    public void setName(final String name) {
        this.name = name;
    }
}