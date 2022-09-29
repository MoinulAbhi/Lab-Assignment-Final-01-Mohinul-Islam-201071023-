import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrime {
    
    @Test
   public void testCase01 () {

        App app = new App();
        assertEquals(app.isPrime(3), true);
    }
    @Test
    public void testCase02 () {
 
         App app = new App();
         assertEquals(app.isPrime(0), false);
     }
     @Test
     public void testCase03 () {
  
          App app = new App();
          assertEquals(app.isPrime(-1), false);
      }
      @Test
      public void testCase04 () {
   
           App app = new App();
           assertEquals(app.isPrime(10), false);
       }
       @Test
       public void testCase05 () {
    
            App app = new App();
            assertEquals(app.isPrime(11), true);
        }
        @Test
        public void testCase06 () {
     
             App app = new App();
             assertEquals(app.isPrime(9), false);
         }
         @Test
         public void testCase07 () {
      
              App app = new App();
              assertEquals(app.isPrime(1), false);
          }
}
