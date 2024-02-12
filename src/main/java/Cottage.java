public class Cottage extends Building {

    private int sizeOfGarden;
    private boolean listedStatus;
    private int numberOfLogsOnFire;

    public Cottage(int numberOfRooms, int yearOfConstruction, boolean doubleGlazed) {
        super(numberOfRooms, yearOfConstruction, doubleGlazed);
        this.sizeOfGarden = sizeOfGarden;
        this.numberOfLogsOnFire = numberOfLogsOnFire;
    }

    public int increaseSizeOfGarden() {
        return this.sizeOfGarden * 2;
    }

    

}
