package Transport;

public class Cars extends Transport implements Competing {
    public Cars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Сядь в автомобиль, пристегнись ремнем безопасности");
        System.out.println("Вставь и поверни ключ зажигания");
        System.out.println("Поехали!");
    }

    @Override
    public void finishtMoving() {
        System.out.println("Останови автомобиль в предназначенном для парковки месте");
        System.out.println("Поверни ключ зажигания и заглуши мотор автомобиля");
        System.out.println("Покинь автомобиль");
    }
    @Override
    public String toString() {
        return " cars{" +
                " brand='" + getBrand() + ", " +
                " model=" + getModel() + ", " +
                " engineVolume" + getEngineVolume() + ", " +
                '}';
    }
    @Override
    public void pitStop() {
        System.out.println("Приятель! Пора сменить колесо автомобиля!");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга в гонке легковых автомобилей:");
    }
    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость автомобиля составляет");
    }
}
