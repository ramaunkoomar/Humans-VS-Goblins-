import model.RandomNumbers;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumbersTest {
    RandomNumbers randNum;

    @BeforeEach
    void setUp() {
         randNum = new RandomNumbers(100, 110);
         randNum.Int();
         randNum.Double();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setFrom() {
    }

    @Test
    void setTo() {
    }

    @Test
    void setNumberInt() {
    }

    @Test
    void setNumberDouble() {
    }

    @Test
    void getNumberInt() {
    }

    @Test
    void getNumberDouble_higher() {
        assertTrue(randNum.getNumberDouble() >= randNum.getFrom());
    }

    @Test
    void getNumberDouble_lower() {
        assertTrue(randNum.getNumberDouble() <= randNum.getNumberDouble());
    }

    @Test
    void Int() {
    }

    @Test
    void testInt() {
    }

    @Test
    void testInt1() {
    }

    @Test
    void Double() {
    }

    @Test
    void testDouble() {
    }

    @Test
    void testDouble1() {
    }

    @Test
    void randI() {
    }

    @Test
    void randD() {
    }
}