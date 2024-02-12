public abstract class Building {

    private int numberOfRooms;
    private int yearOfConstruction;
    private boolean doubleGlazed;

    public Building(int numberOfRooms, int yearOfConstruction, boolean doubleGlazed) {
        this.numberOfRooms = numberOfRooms;
        this.yearOfConstruction = yearOfConstruction;
        this.doubleGlazed = doubleGlazed;
    }

    public int buildingAge() {
        return 2024-this.yearOfConstruction;
    }

}
