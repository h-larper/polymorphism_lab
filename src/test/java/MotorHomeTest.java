import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorHomeTest {

    MotorHome motorhome;

    @BeforeEach
    public void setUp() {
        motorhome = new MotorHome("Happy Camper", 1993, "GR8 FUN");
    }

    @Test
    public void canCalculateDevaluation() {
        assertThat(motorhome.calculateDevaluation(1500, 2000)).isEqualTo(500);
    }

    @Test
    public void canCalculateAge(){
        assertThat(motorhome.calculateAge(1993)).isEqualTo(31);
    }

}
