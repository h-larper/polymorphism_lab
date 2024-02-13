import java.util.ArrayList;

public class LeisureCentre extends Building {


    private String typeOfPool;
    private int numberOfShowers;
//    private ArrayList<String> equipment;

    public LeisureCentre(String name, int numberOfRooms, int yearOfConstruction, boolean doubleGlazed,String typeOfPool,int numberOfShowers) {
        super(name, numberOfRooms, yearOfConstruction, doubleGlazed);
        this.typeOfPool = typeOfPool;
        this.numberOfShowers = numberOfShowers;
    }

    public String welcome() {
        return "Welcome to " + name;
    }


    public int getNumberOfShowers() {
        return this.numberOfShowers;
    }

    public int brokenShower() {
        return this.numberOfShowers -= 1;
    }

    public int fixShower() {
        return this.numberOfShowers;
    }


}
