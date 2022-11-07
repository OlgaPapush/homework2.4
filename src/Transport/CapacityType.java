package Transport;

public enum CapacityType {
    EXTRA_SMALL("до 10 мест"),
    SMALL("до 25"),
    MEDIUM("40-50"),
    LARGE("60-80"),
    ESPECIALLY_LARGE("100-120 мест");
    private String capacity;

    CapacityType(String capacity) {
        if (capacity == null || capacity.isBlank() || capacity.isEmpty()) {
            this.capacity = "NO INFO";
        } else {
            this.capacity = capacity;
        }
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
