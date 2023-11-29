public class Cargo {
    private final String dimensions;  //    габариты;
    private final String mass; //    масса;
    private final String address; //    адрес доставки;
    private final String turnOver; //    свойство — можно ли переворачивать;
    private final String id; //    регистрационный номер (может содержать буквы);
    private final boolean fragile; //    является ли груз хрупким.


    public Cargo(String dimensions, String mass, String address, String turnOver, String id, boolean fragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.address = address;
        this.turnOver = turnOver;
        this.id = id;
        this.fragile = fragile;
    }


    public Cargo setDimensions(String dimensions) {
        return new Cargo(dimensions, mass, address, turnOver, id, fragile);
    }

    public Cargo setMass(String mass) {
        return new Cargo(dimensions, mass, address, turnOver, id, fragile);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, mass, address, turnOver, id, fragile);
    }

    public Cargo setTurnOver(String turnOver) {
        return new Cargo(dimensions, mass, address, turnOver, id, fragile);
    }

    public Cargo setId(String id) {
        return new Cargo(dimensions, mass, address, turnOver, id, fragile);
    }

    public Cargo setFragile(boolean fragile) {
        return new Cargo(dimensions, mass, address, turnOver, id, fragile);
    }


    public Cargo() {
        dimensions = "N/A";
        mass = "N/A";
        address = "N/A";
        turnOver = "N/A";
        id = "N/A";
        fragile = false;
    }


}
