import org.example.testjunit.Vector2D;
import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength(){
        Vector2D v1 = new Vector2D(); //action

        //assertion
        Assert.assertEquals(0, v1.length(), 1e-9);
    }

    @Test
    public void newVectorShouldZeroX(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), 1e-9);
    }

    @Test
    public void newVectorShouldZeroY(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), 1e-9);
    }

}
