package Transport;

public enum LiftingCapacityType {
    N1( "с полной массой до 3,5 тонн"),
    N2 ("с полной массой от 3,5 до 12 тонн"),
    N3("с полной массой свыше 12 тонн");
    private String capacity;
    LiftingCapacityType(String capacity) {
        if (capacity == null || capacity.isBlank() || capacity.isEmpty()) {
            this.capacity = "NO INFO";
        } else {
            this.capacity = capacity;
        }
    }
    public String getLiftingCapacity() {
        return capacity;
    }

    public void setLiftingCapacity(String capacit) {
        this.capacity = capacit;
    }

}
