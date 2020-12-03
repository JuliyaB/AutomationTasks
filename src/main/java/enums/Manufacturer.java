package enums;

public enum Manufacturer {

    HUAWEI("HUAWEI"),
    Samsung("Samsung"),
    HP("HP"),
    Lenovo("Lenovo");

    private final String manufacturer;

    Manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
