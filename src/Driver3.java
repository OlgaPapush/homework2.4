
import Transport.Competing;
import Transport.Transport;


public class Driver3  < B extends Transport & Competing>  {

    private String name;
    private String drivingLicense;
    private double experience;
    private B cars;

    public Driver3(String name, String drivingLicense, double experience, B cars) {
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
        this.cars = cars;
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

    public B getCars() {
        return cars;
    }

    public void setCars(B cars) {
        this.cars = cars;
    }

    public void startMoving() {
        System.out.println(name + " заводит автомобиль " + cars.getBrand() + " " + cars.getModel());
    }
    public void finishTheMove(){
        System.out.println(name + " глушит автомобиль " + cars.getBrand() + " " + cars.getModel());
    }
    public void refuelTheCar(){
        System.out.println(" Пора заправить мою ласточку! " + cars.getBrand() + " " + cars.getModel());
    }

    @Override
    public String toString() {
        return "Driver3{" +
                "name='" + name + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", experience=" + experience +
                ", cars=" + cars +
                '}';
    }

    public void inform(){
        System.out.println("Водитель " + name + "управляет автомобилем " + cars.getBrand() + " " + cars.getModel() + " и будет участвовать в зезде");
        startMoving();
        finishTheMove();
        refuelTheCar();
    }

}
