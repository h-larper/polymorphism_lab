public abstract class Building {

    private String name;
    private int numberOfRooms;
    private int yearOfConstruction;
    private boolean doubleGlazed;

    public Building(String name, int numberOfRooms, int yearOfConstruction, boolean doubleGlazed) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.yearOfConstruction = yearOfConstruction;
        this.doubleGlazed = doubleGlazed;
    }

    public int calculateAge() {
        return 2024-this.yearOfConstruction;
    }

    public abstract String welcome();

}
