import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void plus() throws Exception {
        assertEquals(6, new Main().plus(3, 3));
    }

//    @Test
//    public void plusNeg() throws Exception {
//        assertEquals(5, new Main().plus(3, 3));
////        assertTrue();
//    }
}