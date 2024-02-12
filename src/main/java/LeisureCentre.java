import java.util.ArrayList;

public class LeisureCentre extends Building {

    private String typeOfPool;
    private int numberOfShowers;
    private ArrayList<Equipment>;

    public LeisureCentre(int numberOfRooms, int yearOfConstruction, boolean doubleGlazed,String typeOfPool,int numberOfShowers) {
        super(numberOfRooms, yearOfConstruction, doubleGlazed);
        this.typeOfPool = typeOfPool;
        this.numberOfShowers = numberOfShowers;
    }

}
