package TransportPack;

import lombok.Getter;

@Getter
public enum LoadCapacity {
    N1(null, 3.5),
    N2(3.5, 12.0),
    N3(12.0, null);
    private final Double capacityFrom;
    private final Double capacityTo;

    LoadCapacity(Double capacityFrom, Double capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String loadFromToString = " от: " + this.capacityFrom;
        String loadToToString = " до: " + this.capacityTo;
        return "Грузаподьемность"  + loadFromToString + loadToToString;
    }
}
