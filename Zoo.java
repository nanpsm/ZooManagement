import java.util.ArrayList;

public class Zoo {
    private String name;
    private String description;
    private ArrayList <Enclosure> enclosures;

    // constructor
    public Zoo (String name, String description, ArrayList<Enclosure> enclosures)
    {
        this.name = name;
        this.description = description;
        this.enclosures = enclosures;
    }

    // setters and getters
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public ArrayList<Enclosure> getEnclosures()
    {
        return enclosures;
    }
    
    // methods
    public int getTotalEnclosureArea() {
    	return 0;
    }
    
    public int countEnclosures() {
    	return 0;
    }
}
