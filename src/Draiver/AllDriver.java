package Draiver;
import TransportPack.Transport;
import lombok.Getter;

@Getter
public abstract class AllDriver <T extends Transport>{
    private final String fullName;
    private String categoryLicenses;
    private final int experience;
    private final T car;

    protected AllDriver(String fullName, String categoryLicenses, int experience, T car) {
        this.fullName = fullName;
        this.categoryLicenses = categoryLicenses;
        this.experience = experience;
        this.car = car;
    }
    public String getCategoryLicenses() {
        return this.categoryLicenses;
    }
    public void setCategoryLicenses(String categoryLicenses) {
        if (categoryLicenses == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.categoryLicenses = categoryLicenses;
    }
    public void start() {
        System.out.println("Водитель " + this.fullName + " начал двигаться");
        this.car.startDriving();
    }
    public void stoped() {
        System.out.println("Водитель " + this.fullName + " закончил движение ");
        this.car.endDriving();
    }
    public void refill() {
        System.out.println("Водитель " + this.fullName + " заправляет "
    + this.car.getBrand() + " " + this.car.getModel());
    }
    @Override
    public String toString() {
        return "Водитель " + this.fullName + " управляет автомобилем " + this.car.getBrand()
                + " " + this.car.getModel() + ", " +
                "\nимееет водительские права: " + getCategoryLicenses() + ", и будет участвовать в заезде";
    }
}
