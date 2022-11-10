import Transport.Cars;
public class DriverB extends Driver<Cars> {
    public DriverB(String name, String drivingLicense, double experience,  Cars car) throws WrongDriverException {
        super(name, drivingLicense, experience,  car);
    }
}
