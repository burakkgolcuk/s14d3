package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize; // kWh
    private int cylinders;

    // Not: Hibrit için 5 parametreli ctor kullandım (name, description + 3 alan)
    public HybridCar(String name, String description,
                     double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getBatterySize() { return batterySize; }
    public int getCylinders() { return cylinders; }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() +
                ": hybrid system primed (" + cylinders + " cyl, " + batterySize + " kWh)");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() +
                ": driving with optimal blend, ~" + avgKmPerLitre + " km/L");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": ICE + electric motor in sync");
    }
}
