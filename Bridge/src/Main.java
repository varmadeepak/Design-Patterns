// ABSTRACT IMPLEMENTOR
interface NavigationImplementor{
    void navigateTo();
}

// CONCRETE IMPLEMENTORS
class GoogleMaps implements NavigationImplementor{

    @Override
    public void navigateTo() {
        System.out.println("Using Google Maps");
    }
}

class OLAMaps implements NavigationImplementor{

    @Override
    public void navigateTo() {
        System.out.println("Using Ola Maps");
    }
}

// ABSTRACTION
interface NavigationSystem{
    void navigate(String destination);
}

// CONCRETE ABSTRACTIONS

class UberRides implements NavigationSystem{
    private String driverName;
    private NavigationImplementor navigationImplementor;

    UberRides(String driverName){
        this.driverName = driverName;
    }
    public void setNavigationSystem(NavigationImplementor navigationImplementor){
        this.navigationImplementor = navigationImplementor;
    }


    @Override
    public void navigate(String destination) {
        System.out.print("Uber ride with " + driverName + " to " + destination + " using ");
        navigationImplementor.navigateTo();
    }
}

class UberEats implements NavigationSystem{
    private String driverName;
    private NavigationImplementor navigationImplementor;

    UberEats(String driverName){
        this.driverName = driverName;
    }

    public void setNavigationSystem(NavigationImplementor navigationImplementor){
        this.navigationImplementor = navigationImplementor;
    }

    @Override
    public void navigate(String destination) {
        System.out.print("Uber Eats with " + driverName + " to " + destination + " using ");
        navigationImplementor.navigateTo();
    }
}

public class Main {
    public static void main(String[] args) {

        GoogleMaps googleMaps = new GoogleMaps();
        OLAMaps olaMaps = new OLAMaps();

        UberRides uberRides = new UberRides("Deepak");
        uberRides.setNavigationSystem(googleMaps);
        uberRides.navigate("Begum Bazar");
        uberRides.setNavigationSystem(olaMaps);
        uberRides.navigate("Gowliguda");
    }
}