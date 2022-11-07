package Transport;

public class Bus extends Transport implements Competing {

    public CapacityType capacityType;

    public Bus(String brand, String model, double engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    @Override
    public void startMoving() {
        System.out.println("Сядь в кабину автобуса, пристегнись ремнем безопасности");
        System.out.println("Вставь и поверни ключ зажигания");
        System.out.println("Поехали!");
    }

    @Override
    public void finishtMoving() {
        System.out.println("Останови автобус в предназначенном для парковки месте");
        System.out.println("Поверни ключ зажигания и газлуши мотор автомобиля");
        System.out.println("Покинь  салон автобуса");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + ", " +
                "model=" + getModel() + ", " +
                "engineVolume" + getEngineVolume() + ", " +
                "capacityType " + getCapacityType() +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(" Пора сменить колесо автобуса! А то как-бы чего не вышло!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга в гонке автобусов:");

    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость автобуса составляет");
    }

}

