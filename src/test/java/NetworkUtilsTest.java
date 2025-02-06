import org.example.testjunit.NetworkUtils;
import org.junit.Test;

public class NetworkUtilsTest {

    @Test(timeout = 1000)
    public void getConnectionShouldBeFasterThenOneSecond(){
        NetworkUtils.getConnection();
    }


}
