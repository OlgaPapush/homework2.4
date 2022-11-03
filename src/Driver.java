
import Transport.Competing;
import Transport.Transport;


public class Driver <D extends Transport & Competing>  {

    private String name;
    private String drivingLicense;
    private double experience;
    private D bus;

    public Driver(String name, String drivingLicense, double experience, D bus) {
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
        this.bus = bus;
    }

    public D getBus() {
        return bus;
    }

    public void setBus(D bus) {
        this.bus = bus;
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
        System.out.println(name  + " заводит автобус " + bus.getBrand() + " " + bus.getModel());
    }
    public void finishTheMove(){
        System.out.println(name + " глушит автобус " + bus.getBrand() + " " + bus.getModel());
    }
    public void refuelTheCar(){
        System.out.println(" Пора заправить мою ласточку! " + bus.getBrand() + " " + bus.getModel());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", experience=" + experience +
                ", bus=" + bus +
                '}';
    }

    public void inform(){
        System.out.println("Водитель " + name + "управляет автомобилем " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в зезде");
        startMoving();
        finishTheMove();
        refuelTheCar();
    }
}
