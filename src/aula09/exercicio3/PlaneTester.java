package aula09.exercicio3;
public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();

        planeManager.addPlane(new CommercialPlane(100, 2010, "A380", "Airbus", "CP1", 900, 10));
        planeManager.addPlane(new CommercialPlane(200, 2015, "A350", "Airbus", "CP2", 950, 15));
        planeManager.addPlane(new CommercialPlane(150, 2012, "A330", "Airbus", "CP3", 850, 12));
        planeManager.addPlane(new MilitaryPlane(25, 2010, "Cargo", "Mercedes", "ML1", 1000, 3));
        planeManager.addPlane(new MilitaryPlane(20, 2015, "M4", "BMW", "ML2", 1100, 4));

        System.out.println(planeManager);

        planeManager.removePlane("CP1");

        System.out.println("\n" + planeManager);

        System.out.println("\n" + planeManager.searchPlane("CP2"));

        System.out.println("\n" + planeManager.getCommercialPlanes());

        System.out.println("\n" + planeManager.getMilitaryPlanes());

        System.out.println("\n" + planeManager.getFastestPlane());
        

    }
}