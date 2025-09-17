package org.example.arge;

public class ArgeMain {
    public static void main(String[] args) {
        CarSkeleton gas = new GasPoweredCar("Vento", "1.6L",
                15.2, 4);
        CarSkeleton ev = new ElectricCar("VoltX", "Long range",
                420.0, 82);
        CarSkeleton hybrid = new HybridCar("Fusion-H", "Eco hybrid",
                24.0, 35, 4);

        // Polimorfik çağrılar
        test(gas);
        test(ev);
        test(hybrid);

        // Sınıf tipini yazdıran örnek metod
        printType(gas);
        printType(ev);
        printType(hybrid);
    }

    private static void test(CarSkeleton car) {
        car.startEngine();
        car.drive(); // drive içinde runEngine çağrılır
        System.out.println("---");
    }

    private static void printType(CarSkeleton car) {
        System.out.println("Type: " + car.getClass().getSimpleName());
    }
}
