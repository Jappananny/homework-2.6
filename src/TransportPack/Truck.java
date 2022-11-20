package TransportPack;


import lombok.Getter;

@Getter
public class Truck extends Transport implements Competing{
    private final LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume,LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void startDriving() {
        System.out.printf("Грузовик " + this.getBrand() + this.getModel() + " начал движение");
    }
    @Override
    public void endDriving() {
        System.out.printf("Грузовик " + this.getBrand() + this.getModel() + " закончил движение");
    }

    @Override
    public void allInfoTransport() {

    }

    @Override
    public boolean diagnistic() {
        return false;
    }


    public void info() {
        System.out.println("Грузовик  " + this.getBrand() + " " + this.getModel() + " " + this.getEngineVolume());
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
