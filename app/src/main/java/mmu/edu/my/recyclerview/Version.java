package mmu.edu.my.recyclerview;

public class Version {
    // including 3 member variables
    private String name;
    private String description;
    private String icon;

    public Version(String name, String description, String icon) {
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

    public String getIcon() {
        return icon;
    }
}