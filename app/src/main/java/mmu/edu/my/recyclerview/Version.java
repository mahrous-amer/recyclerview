package mmu.edu.my.recyclerview;

public class Version {
    // including 3 member variables
    private String name;
    private String description;
    private int icon;

    public Version(String name, String description, int icon) {
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getIcon() {
        return icon;
    }
}