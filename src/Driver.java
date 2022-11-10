import Transport.Competing;
import Transport.Transport;

public abstract class Driver<T extends Transport & Competing> {
    private String name;
    private String drivingLicense;
    private double experience;
    private T car;

    public Driver(String name, String drivingLicense, double experience, T car) throws WrongDriverException {
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
        this.car = car;
        setDrivingLicense(drivingLicense);
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
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

    public void setDrivingLicense(String drivingLicense) throws WrongDriverException {
        if (drivingLicense == null || drivingLicense.isBlank()) {
            System.err.println("Необходимо указать тип прав");
            throw new WrongDriverException("Необходимо указать тип прав");
        } else {
            this.drivingLicense = drivingLicense;
        }

    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println(name + " заводит " + car.getBrand() + " " + car.getModel());
    }

    public void finishTheMove() {
        System.out.println(name + " глушит  " + car.getBrand() + " " + car.getModel());
    }

    public void refuelTheCar() {
        System.out.println(" Пора заправить мою ласточку! " + car.getBrand() + " " + car.getModel());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", experience=" + experience +
                ", cars=" + car +
                '}';
    }

    public void inform() {
        System.out.println("Водитель " + name + "управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в зезде");
        startMoving();
        finishTheMove();
        refuelTheCar();
    }
}
