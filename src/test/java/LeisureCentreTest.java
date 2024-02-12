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
        assertThat(leisureCentre.numberOfShowers).isEqualTo(29);
    }


}
