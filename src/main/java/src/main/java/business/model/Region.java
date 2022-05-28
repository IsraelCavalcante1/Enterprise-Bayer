package src.main.java.business.model;

public enum Region {

    NORTH(1, "Norte"),
    NORTH_EAST(2, "Nordeste"),
    SOUTH(3, "Sul"),
    SOUTH_EAST(4, "Sudeste"),
    CENTER_WEST(5, "Centro-Oeste");


    private int id;
    private String name;

    Region(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
