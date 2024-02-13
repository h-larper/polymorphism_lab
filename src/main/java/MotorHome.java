import interfaces.ICalculate;

public class MotorHome implements ICalculate {

    private String name;
    private int yearOfManufacture;
    private String licensePlate;

    public MotorHome(String name, int yearOfManufacture, String licensePlate) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
        this.licensePlate = licensePlate;
    }

    public int calculateAge(int age) {
        age = 2024 - yearOfManufacture;
        return age;
    }

    public int calculateDevaluation(int current, int original) {
        return original - current;
    }

    public double calculateDevaluation(double current, double original) {
        return original - current;
    }




}
