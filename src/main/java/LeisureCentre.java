import java.util.ArrayList;

public class LeisureCentre extends Building {

    Equipment equipment;

    private String typeOfPool;
    private int numberOfShowers;
    private ArrayList<equipment>;

    public LeisureCentre(int numberOfRooms, int yearOfConstruction, boolean doubleGlazed,String typeOfPool,int numberOfShowers) {
        super(numberOfRooms, yearOfConstruction, doubleGlazed);
        this.typeOfPool = typeOfPool;
        this.numberOfShowers = numberOfShowers;
    }

    public int brokenShower() {
        return this.numberOfShowers -= 1;
    }

    public int fixShower() {
        return this.numberOfShowers += 1;
    }

}
