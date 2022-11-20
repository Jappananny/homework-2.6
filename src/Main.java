import Draiver.DriverLicensesC;
import TransportPack.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Вводные данные 1
        System.out.println("===============================================================================");
        boolean pass = Data.validate("Kr1", "K10000o1+", "K10000o1+");
        //Вводные данные 1
        Car lada = new Car("Lada", "Vesta", 2.0, TypeOfBody.SEDAN);
        Car kia = new Car("KIA", "Cerato", 2.5, TypeOfBody.COUPE);
        Car skoda = new Car("Skoda", "Octavia", 3.0, TypeOfBody.CROSSOVER);
        Car audi = new Car("Audi", "A3", 3.0, TypeOfBody.JEEP);
        Bus man = new Bus("MAN", "Lion’s Coach", 5.0, CapacityPeople.SMALL);
        Bus gaz = new Bus("GAZ", "Вектор Next", 3.3, CapacityPeople.ESPECIALLY_SMALL);
        Bus maz = new Bus("MAZ", "232", 3.5, CapacityPeople.ESPECIALLY_BIG);
        Bus setra = new Bus("Setra", "Provate", 3.8, CapacityPeople.AVERAGE);
        Truck iveco = new Truck("Iveco", "MP 260E38 6x6", 12.0, LoadCapacity.N3);
        Truck mon = new Truck("MON", "41.410 8x4", 10.0, LoadCapacity.N2);
        Truck volvo = new Truck("VOLVO", "FMX-500-10X4", 13.0, LoadCapacity.N3);
        Truck mercedes = new Truck("Mercedes-Benz", "Atego 815", 4.2, LoadCapacity.N1);
        //Вводные данные 3
        DriverLicensesC driverC = new DriverLicensesC("Евпатий Коловрат",
                "Лицензия выданная боженькой по управлению грузавиком", 13, volvo);
        //Вывод результата
        System.out.println("===============================================================================");
        lada.info();
        man.info();
        iveco.info();
        System.out.println("===============================================================================");
        System.out.println(driverC);
        gaz.info();
        gaz.allInfoTransport();
        System.out.println("===============================================================================");
        System.out.println(driverC);
        driverC.setCategoryLicenses("null");
        System.out.println("===============================================================================");
        diagnistic(lada, volvo, man);


    }

    private static void diagnistic(Transport...transports) {
        for (Transport transport : transports) {
            diagnisticTransport(transport);
        }
    }

    private static void diagnisticTransport(Transport transport) {
        try {
            if (!transport.diagnistic()) {
                throw new RuntimeException("Автомобиль " +
                        transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }

    }

