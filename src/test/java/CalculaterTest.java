import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class CalculaterTest{
    @Test
    public void sumTest(){
        Calculater c = new Calculater();
        int b = c.sum(2, 2);
        assertEquals(4, b);
    }
    @Test
    public void subTest(){
        Calculater c = new Calculater();
        int b = c.sub(2, 2);
        assertEquals(0, b);
    }
    @Test
    public void multiplTest(){
        Calculater c = new Calculater();
        int b = c.multipl(2, 2);
        assertEquals(4, b);
    }
    @Test
    public void divTest(){
        Calculater c = new Calculater();
        int b = c.div(4, 2);
        assertEquals(2, b);
    }
    @Test
    public void PerTest(){
        Calculater c = new Calculater();
        int b = c.Per(2, 2);
        assertEquals(8, b);
    }
}