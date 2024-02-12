import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CensusTest {

    Census census;

    @BeforeEach
    public void setUp() {
        census = new Census();
    }

    @Test
    public void canCountBuildings() {
        Building building = new Cottage (4, 1880, false, 20, true, 5);
        census.addBuilding(building);
        assertThat(census.countBuildings()).isEqualTo(1);
    }

    @Test
    public void canAddBuilding() {
        Building building = new Cottage (4, 1880, false, 20, true, 5);
        Building building1 = new LeisureCentre (15, 1995, true, "infinity", 30);
        census.addBuilding(building);
        census.addBuilding(building1);
        assertThat(census.countBuildings()).isEqualTo(2);
    }

    @Test
    public void canRemoveBuilding() {
        Building building = new Cottage (4, 1880, false, 20, true, 5);
        Building building1 = new LeisureCentre (15, 1995, true, "infinity", 30);
        census.addBuilding(building);
        census.addBuilding(building1);
        assertThat(census.countBuildings()).isEqualTo(2);
        census.removeBuilding(building);
        assertThat(census.countBuildings()).isEqualTo(1);
    }

}
