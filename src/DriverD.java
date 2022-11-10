import Transport.Bus;
public class DriverD extends Driver<Bus> {
    public DriverD(String name, String drivingLicense, double experience, Bus car) throws WrongDriverException {
        super(name, drivingLicense, experience, car);
    }
}