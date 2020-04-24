package pl_249609;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test2 {
    private zad2 test2 = new zad2(new int[]{4, 6, 4, 1, 2, 3},7);
    @Test
    void t1() {
        assertTrue(test2.abc(new int[]{1, 2, 3,5,2},0));
    }
    @Test
    void t2() {
        assertFalse(test2.abc(new int[]{1, 2, 6,2},0));
    }
    @Test
    void t3() {
        assertFalse(test2.abc(new int[]{0,0,0,0},0));
    }
}
