import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LeisureCentreTest {

    LeisureCentre leisureCentre;

    @BeforeEach
    public void setUp() {
        leisureCentre = new LeisureCentre(15, 1995, true, "infinity", 30);
    }

    @Test
    public void showBrokenShower(){
        leisureCentre.getNumberOfShowers();
        assertThat(leisureCentre.brokenShower()).isEqualTo(29);
    }

    @Test
    public void showFixedShower(){
        leisureCentre.getNumberOfShowers();
        assertThat(leisureCentre.fixShower()).isEqualTo(30);
    }

//    @Test
//    public void canAddGymEquipment() {
//        leisureCentre.addEquipment("bat");
//        leisureCentre.addEquipment("ball");
//        assertThat(leisureCentre.getEquipment(0)).isEqualTo("bat");
//    }

}
