package Transport;

public class Trucks extends Transport implements Competing {
    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Сядь в кабину грузового автомобиля, пристегнись ремнем безопасности");
        System.out.println("Вставь и поверни ключ зажигания");
        System.out.println("Поехали!");
    }
    @Override
    public void finishtMoving() {
        System.out.println("Останови грузовой автомобиль в предназначенном для парковки месте");
        System.out.println("Поверни ключ зажигания и газлуши мотор автомобиля");
        System.out.println("Покинь  грузовой автомобиль");
    }
    @Override
    public String toString() {
        return "trucks{" +
                "brand='" + getBrand() + ", " +
                "model=" + getModel() + ", " +
                "engineVolume" + getEngineVolume() + ", " +
                '}';
    }
    @Override
    public void pitStop() {
        System.out.println("Чувак! Пора сменить колесо автомобиля!");

    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга в гонке грузовых автомобилей:");

    }
    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля составляет");
    }
}
