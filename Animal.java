public class Animal {
	private String species;
    private Enclosure enclosure;
    private int areaNeeded;
    
    // constructor
    public Animal(String species, Enclosure enclosure, int areaNeeded){
        this.species = species;
        this.enclosure = enclosure;
        this.areaNeeded = areaNeeded;
    }
    
    // setters and getters
    public String getSpecies(){
        return species;
    }

    public int getAreaNeeded(){
        return areaNeeded;
    }

    public void setSpecises(String specises){
	this.specises = specises;
    }

    public void setAreaNeeded(int areaNeeded){
         this.areaNeeded = areaNeeded;
    }
    
    // method
    public boolean hasCompanion() {
        for (Animal animal : enclosure.getAnimals()) {
            if (animal != this && animal.getSpecies().equals(species)) {
                return true;
            }
        }
        return false;
    }
    
}
