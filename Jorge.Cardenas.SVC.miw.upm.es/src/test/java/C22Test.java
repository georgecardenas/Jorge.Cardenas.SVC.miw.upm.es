import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {
    
    private C22 c21;
    
    @Before
    public void before() {
        c21 = new C22();
    }
    
    @Test
    public void testMA() {
        assertEquals("mA", c21.mA());
    }
}
