package aula09.exercicio3;
public class Plane {
    private int maxPassengers;
    private int year;
    private String model;
    private String manufacturer;
    private String id;
    private int maxSpeed;

    public Plane(int maxPassengers, int year, String model, String manufacturer, String id, int maxSpeed) {
        this.maxPassengers = maxPassengers;
        this.year = year;
        this.model = model;
        this.manufacturer = manufacturer;
        this.id = id;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getPlaneType() {
        return "";
    }

    @Override
    public String toString() {
        return "Plane [id=" + id + ", manufacturer=" + manufacturer + ", maxSpeed=" + maxSpeed
                + ", model=" + model + ", maxPassengers=" + maxPassengers + ", year=" + year
                + "]";
    }
}
