import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.Helper.square;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelper {
    @Test
    @DisplayName("2 ^ 2 = 4")
    void testSquareOfTwo() {
        assertEquals(4, square(2));
    }
}
