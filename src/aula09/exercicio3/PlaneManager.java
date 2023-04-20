package aula09.exercicio3;

import java.util.ArrayList;
import java.util.List;
public class PlaneManager {

    private List<Plane> planes;

    public PlaneManager() {
        planes = new ArrayList<>();
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void removePlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                planes.remove(plane);
                break;
            }
        }
    }

    public Plane searchPlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    public List<Plane> getCommercialPlanes(){
        List<Plane> commercialPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof CommercialPlane) {
                commercialPlanes.add(plane);
            }
        }
        return commercialPlanes;
    }

    public List<Plane> getMilitaryPlanes(){
        List<Plane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if(plane instanceof MilitaryPlane) {
                militaryPlanes.add(plane);
            }
        }
        return militaryPlanes;
    }

    public void printAllPlanes(){
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    public Plane getFastestPlane(){
        Plane fastest = null;
        double maxSpeed = Double.MIN_VALUE;
        for (Plane plane : planes) {
            if (plane.getMaxSpeed() > maxSpeed) {
                maxSpeed = plane.getMaxSpeed();
                fastest = plane;
            }
        }
        return fastest;
    }
    
    @Override
    public String toString() {
        return "Plane Fleet= " + planes;
    }
}
