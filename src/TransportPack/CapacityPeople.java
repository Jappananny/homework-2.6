package TransportPack;

import lombok.Getter;

@Getter
public enum CapacityPeople {
    ESPECIALLY_SMALL(null, 10),
    SMALL(null, 25),
    AVERAGE(40,50),
    BIG(60,80),
    ESPECIALLY_BIG(100,120);

    private final Integer capacityFrom;
    private final Integer capacityTo;

    CapacityPeople(Integer capacityFrom, Integer capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String capacityFromToString = " от: " + this.capacityFrom;
        String capacityToToString = " до: " + this.capacityTo;
        return "Пассажировместимость "  + capacityFromToString + capacityToToString;
    }
}
