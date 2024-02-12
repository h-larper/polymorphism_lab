import java.util.ArrayList;

public class LeisureCentre extends Building {


    private String typeOfPool;
    private int numberOfShowers;
//    private ArrayList<String> equipment;

    public LeisureCentre(int numberOfRooms, int yearOfConstruction, boolean doubleGlazed,String typeOfPool,int numberOfShowers) {
        super(numberOfRooms, yearOfConstruction, doubleGlazed);
        this.typeOfPool = typeOfPool;
        this.numberOfShowers = numberOfShowers;
//        this.equipment = new ArrayList<>();                 // typically initialised empty
    }

//    public void addEquipment(String equipment) {
//        this.equipment.add(equipment);
//    }

//    public ArrayList<String> getEquipment(int i) {
//        return equipment;
//    }

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
