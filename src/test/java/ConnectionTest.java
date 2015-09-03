import connection.Connection;
import connection.impl.MysqlConnection;
import connection.impl.OracleConnection;
import org.junit.Test;

public class ConnectionTest {

    private Connection connection;

    @Test
    public void testMysqlConnect() {
        connection = new MysqlConnection();
        connection.connect();
    }

    @Test
    public void testOracleConnection() {
        connection = new OracleConnection();
        connection.connect();
        ((OracleConnection)connection).save();
    }
}
