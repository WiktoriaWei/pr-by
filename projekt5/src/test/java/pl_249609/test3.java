package pl_249609;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test3 {
    private zad3 test3 = new zad3();
    @Test
    void t1()
    {
        assertNotEquals(0,test3.qwe("fgd"));
    }
    @Test
    void t2()
    {
        assertEquals("mam",test3.qwe("takmam"));
    }
}
