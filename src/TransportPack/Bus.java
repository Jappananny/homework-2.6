package TransportPack;

public class Bus extends Transport implements Competing{
    private CapacityPeople capacityPeople;
    public Bus(String brand, String model, double engineVolume, CapacityPeople capacityPeople) {
        super(brand, model, engineVolume);
        this.capacityPeople = capacityPeople;
    }
    @Override
    public void startDriving() {
        System.out.printf("Автобус " + this.getBrand() + this.getModel() + " начал движение");
    }
    @Override
    public void endDriving() {
        System.out.printf("Автобус " + this.getBrand() + this.getModel() + " закончил движение");
    }

    @Override
    public void allInfoTransport() {
        System.out.println(this.capacityPeople);
    }

    @Override
    public boolean diagnistic() {
        System.out.println("Автобус " +this.getBrand() + " " + this.getModel() +
                " в диагностике не требуется");
        return true ;
    }

    public void info() {
        System.out.println("Автобус " + this.getBrand() + " " + this.getModel() + " " + this.getEngineVolume());
    }


    @Override
    public void pitStop() {

    }

    @Override
    public int bestLapTime() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }
}
