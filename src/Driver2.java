
import Transport.Competing;
import Transport.Transport;


public class Driver2  < C extends Transport & Competing>  {

    private String name;
    private String drivingLicense;
    private double experience;
    private C trucks;

    public Driver2(String name, String drivingLicense, double experience, C trucks) {
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
        this.trucks = trucks;
    }

    public C getTrucks() {
        return trucks;
    }

    public void setTrucks(C trucks) {
        this.trucks = trucks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println(name + " заводит грузовик " + trucks.getBrand() + " " + trucks.getModel());
    }
    public void finishTheMove(){
        System.out.println(name + " глушит грузовик " + trucks.getBrand() + " " + trucks.getModel());
    }
    public void refuelTheCar(){
        System.out.println(" Пора заправить мою ласточку! " + trucks.getBrand() + " " + trucks.getModel());

    }

    @Override
    public String toString() {
        return "Driver2{" +
                "name='" + name + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", experience=" + experience +
                ", trucks=" + trucks +
                '}';
    }

    public void inform(){
        System.out.println("Водитель " + name + "управляет автомобилем " + trucks.getBrand() + " " + trucks.getModel() + " и будет участвовать в зезде");
        startMoving();
        finishTheMove();
        refuelTheCar();
    }
}

