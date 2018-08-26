public class Cat implements Pet {
    private final Pet pet;
    
    public Dog(Pet pet) {
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