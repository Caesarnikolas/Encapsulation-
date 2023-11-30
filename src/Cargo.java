public class Cargo {
    private final Dimensions dimensions;  //    габариты;
    private final String mass; //    масса;
    private final String address; //    адрес доставки;
    private final boolean turnOver; //    свойство — можно ли переворачивать;
    private final String id; //    регистрационный номер (может содержать буквы);
    private final boolean fragile; //    является ли груз хрупким.


    public Cargo(Dimensions dimensions, String mass, String address,String id, boolean turnOver,  boolean fragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.address = address;
        this.turnOver = turnOver;
        this.id = id;
        this.fragile = fragile;
    }


    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, mass, address, id, turnOver, fragile);
    }

    public Cargo setMass(String mass) {
        return new Cargo(dimensions, mass, address,  id, turnOver,fragile);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, mass, address,  id,turnOver, fragile);
    }

    public Cargo setTurnOver(boolean turnOver) {
        return new Cargo(dimensions, mass, address,  id, turnOver, fragile);
    }

    public Cargo setId(String id) {
        return new Cargo(dimensions, mass, address, id, turnOver,  fragile);
    }

    public Cargo setFragile(boolean fragile) {
        return new Cargo(dimensions, mass, address, id, turnOver,  fragile);
    }


    public Cargo() {
        dimensions = new Dimensions(1,2,3);
        mass = "N/A";
        address = "N/A";
        turnOver = false;
        id = "N/A";
        fragile = false;
    }

}
