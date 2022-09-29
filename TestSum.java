
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSum {
    @Test
    public void TestSum01(){
        App app = new App();
        double actual = 2.2679331;
        assertEquals(app.calculate(10, 10),actual,actual);


    }
}
