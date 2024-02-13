public class MotorHome {

    private String name;
    private int yearOfManufacture;
    private String licensePlate;

    public MotorHome(String name, int yearOfManufacture, String licensePlate) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
        this.licensePlate = licensePlate;
    }

    public int calculateDevaluation(int current, int original) {
        return original - current;
    }

    public double calculateDevaluation(double current, double original) {
        return original - current;
    }




}
