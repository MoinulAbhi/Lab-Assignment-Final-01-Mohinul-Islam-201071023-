import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLeapYear {
    
   
    @Test
    public void TestLeapYear02(){

        App app = new App();
        assertEquals(App.leapYear(2010, true), false);

    }
    @Test
    public void TestLeapYear03(){

        App app = new App();
        assertEquals(App.leapYear(2010, false), false);

    }
    @Test
    public void TestLeapYear05(){

        App app = new App();
        assertEquals(App.leapYear(1900, false), false);

    }



}
