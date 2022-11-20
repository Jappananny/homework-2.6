package TransportPack;

import lombok.Getter;

@Getter
public enum TypeOfBody {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    JEEP("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");
    private final String name;
    TypeOfBody(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
