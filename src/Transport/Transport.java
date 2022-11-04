package Transport;
public abstract class Transport {
    protected String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {

        if (brand == null) {
            this.brand = "указать наименование брэнда";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "указать наименование модели";
        } else {
            this.model = model;
        }

        if (engineVolume == 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public abstract void startMoving();
    public abstract void finishtMoving();

}
