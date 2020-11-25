import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalcTest {
    Calc calc;
    @BeforeClass
    public static  void startTesting(){
        System.out.println("Start testing Methods \n");
    }
    @Before
    public void beforeEveryMethod(){
        calc = new Calc();
        System.out.print("Start Testing Method \n");
    }
    @After
    public void afterEveryMethod(){
        System.out.println("End Testing Method \n");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("End Testing");
    }
    @Test
    public void plusTest(){
        int result = calc.plus(1,2);
        Assert.assertEquals(result,3);
        System.out.println("Testing method 'plusTest'.");
    }

    @Test
    public void minusTest(){
        int result = calc.minus(10,2);
        Assert.assertEquals(result, 8);
        System.out.println("Testing method 'minusTest'.");
    }
    @Test
    public void divTest(){
        int result = calc.div(10,2);
        Assert.assertEquals(result,5);
        System.out.println("Testing method 'divTest'.");
    }
    @Test
    public void multiTest(){
        int result = calc.multi(4,6);
        Assert.assertEquals(result,24);
        System.out.println("Testing method 'multiTest'.");
    }
    @Ignore
    @Test
    public void zeroDiv(){
        System.out.println("Not ready");
    }
}
