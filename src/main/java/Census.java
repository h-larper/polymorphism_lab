import java.util.ArrayList;

public class Census {

    private ArrayList<Building> buildings;                  // declaring ArrayList from Building
    public Census(){
        this.buildings = new ArrayList<>();                     // initialising ArrayList
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public int countBuildings() {
        return buildings.size();
    }

    public void addBuilding(Building building) {
      this.buildings.add(building);
    }

    public void removeBuilding(Building building) {
        this.buildings.remove(building);
    }

}
