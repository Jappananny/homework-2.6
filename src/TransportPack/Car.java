package TransportPack;


import lombok.Getter;

@Getter
public class Car extends Transport implements Competing{
    private TypeOfBody typeOfBody;
    public Car(String brand, String model, double engineVolume,TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }
    @Override
    public void startDriving() {
        System.out.printf("Автомобиль " + this.getBrand() + this.getModel() + " начал движение");
    }
    @Override
    public void endDriving() {
        System.out.printf("Автомобиль " + this.getBrand() + this.getModel() + " закончил движение");
    }

    @Override
    public void allInfoTransport() {

    }

    @Override
    public boolean diagnistic() {
        return false;
    }

    public void info() {
        System.out.println("Автомобиль  " + this.getBrand() + " " + this.getModel()
                + " " + this.getEngineVolume());
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
