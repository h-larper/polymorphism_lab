import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CottageTest {

    Cottage cottage;

    @BeforeEach
    public void setUp() {
        cottage = new Cottage(4, 1880, false, 20, true, 5);
    }

    @Test
    public void canIncreaseSizeOfGarden(){
       assertThat(cottage.increaseSizeOfGarden()).isEqualTo(40);
  }

    @Test
    public void canGetNumberOfLogsOnFire(){
        assertThat(cottage.getNumberOfLogsOnFire()).isEqualTo(5);
    }

    @Test
    public void hasBurntLogsOnFire() {
        assertThat(cottage.burnLogsOnFire(cottage.getNumberOfLogsOnFire())).isEqualTo(0);
    }

}
