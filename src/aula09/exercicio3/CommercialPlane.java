package aula09.exercicio3;
public class CommercialPlane extends Plane {
    private int numOfCrewMembers;

    public CommercialPlane(int maxPassengers, int year, String model, String manufacturer, String id, int maxSpeed, int numOfCrewMembers) {
        super(maxPassengers, year, model, manufacturer, id, maxSpeed);
        this.numOfCrewMembers = numOfCrewMembers;
    }
        
    public int getNumOfCrewMembers() {
        return numOfCrewMembers;
    }

    public void setNumOfCrewMembers(int numOfCrewMembers) {
        this.numOfCrewMembers = numOfCrewMembers;
    }

    @Override
    public String toString() {
        return "MilitaryPlane [Number of Crew Members: " + numOfCrewMembers + ']' + "[Max Passengers: " + getMaxPassengers() + ']' + "[Year: " + getYear() + ']' + "[Model: " + getModel() + ']' + "[Manufacturer: " + getManufacturer() + ']' + "[ID: " + getId() + ']' + "[Max Speed: " + getMaxSpeed() + ']';
    }
    
    @Override  
    public String getPlaneType() {
        return "Commercial";
    }
}

