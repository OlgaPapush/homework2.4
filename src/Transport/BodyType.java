package Transport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хечбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивен");
    private String types;
    BodyType(String types) {

        if (types == null || types.isBlank() || types.isEmpty()) {
            this.types = "NO INFO";
        } else {
            this.types = types;
        }
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }
}



