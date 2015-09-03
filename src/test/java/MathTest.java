import exception.MyException;
import math.Math;
import org.junit.Assert;
import org.junit.Test;

public class MathTest {

    private math.Math firtMath = new Math();
    private Math math = new Math("dilek");

    @Test
    public void testAdd() throws Exception {
        // 4
        Integer result = math.add(2, 2);
        Assert.assertEquals(new Integer(4), result);
    }

    @Test(expected = MyException.class)
    public void testNullValue() throws MyException {
        math.add(null, 1);
    }

    @Test
    public void testAddBy3Values() {
        Integer result = math.add(1, 2, 3);
        Assert.assertEquals(new Integer(6), result);
    }

    @Test
    public void testAddBy4Values() {
        Integer result = math.add(1, 2, 3, 4);
        Assert.assertEquals(new Integer(10), result);
    }

    @Test
    public void castTest() {
        Integer i = 5;
        System.out.println(new Float(i));
    }
}
