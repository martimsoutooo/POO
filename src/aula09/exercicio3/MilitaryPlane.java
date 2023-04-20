package aula09.exercicio3;
public class MilitaryPlane extends Plane {
    private int numMissiles;

    public MilitaryPlane(int maxPassengers, int year, String model, String manufacturer, String id, int maxSpeed, int numMissiles) {
        super(maxPassengers, year, model, manufacturer, id, maxSpeed);
        this.numMissiles = numMissiles;
    }

    public int getNumMissiles() {
        return numMissiles;
    }

    public void setNumMissiles(int numMissiles) {
        this.numMissiles = numMissiles;
    }

    @Override
    public String toString() {
        return "MilitaryPlane [Number of Missiles: " + numMissiles + ']' + "[Max Passengers: " + getMaxPassengers() + ']' + "[Year: " + getYear() + ']' + "[Model: " + getModel() + ']' + "[Manufacturer: " + getManufacturer() + ']' + "[ID: " + getId() + ']' + "[Max Speed: " + getMaxSpeed() + ']';
    }

    @Override
    public String getPlaneType() {
        return "Military";
    }
}