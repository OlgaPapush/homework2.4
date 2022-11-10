package Transport;

public class Cars extends Transport implements Competing {
    private BodyType bodyType;

    public Cars(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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
    public boolean getDiagnosed() {
        return Math.random() > 0.5;
    }

    @Override
    public String toString() {
        return " cars{" +
                " brand='" + getBrand() + ", " +
                " model=" + getModel() + ", " +
                " engineVolume" + getEngineVolume() + ", " +
                " bodyType " + getBodyType() +
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
