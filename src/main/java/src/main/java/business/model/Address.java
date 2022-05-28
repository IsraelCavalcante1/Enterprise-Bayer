package src.main.java.business.model;

public class Address {

    private int id;
    private String city;
    private String neighborhood;
    private String street;
    private int number;
    private UnionState state;

    public Address(int id, String city, String neighborhood, String street, int number, UnionState state) {
        this.id = id;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.state = state;
    }

    public String getFullAddress() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(street).append(" ")
                .append(", ").append(number)
                .append(neighborhood).append(" ")
                .append(city).append(" ")
                .append(state.getShortName());

        return sb.toString();
    }
}
