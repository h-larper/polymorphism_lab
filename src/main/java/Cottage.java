public class Cottage extends Building {

    private int sizeOfGarden;
    private boolean listedStatus;
    private int numberOfLogsOnFire;

    public Cottage(int numberOfRooms, int yearOfConstruction, boolean doubleGlazed, int sizeOfGarden, boolean listedStatus, int numberOfLogsOnFire) {
        super(numberOfRooms, yearOfConstruction, doubleGlazed);
        this.sizeOfGarden = sizeOfGarden;
        this.numberOfLogsOnFire = numberOfLogsOnFire;
    }

    public int increaseSizeOfGarden() {
        return this.sizeOfGarden * 2;
    }

    public int getSizeOfGarden() {
        return this.sizeOfGarden;
    }

    public int getNumberOfLogsOnFire(){
        return this.numberOfLogsOnFire;
    }

    public int burnLogsOnFire(int numberOfLogsOnFire) {
        numberOfLogsOnFire = 0;
        return this.numberOfLogsOnFire = numberOfLogsOnFire;
    }


}
