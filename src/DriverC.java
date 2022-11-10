import Transport.Trucks;
public class DriverC extends Driver<Trucks> {
    public DriverC(String name, String drivingLicense, double experience,  Trucks car) throws WrongDriverException {
        super(name, drivingLicense, experience,  car);
    }
}

