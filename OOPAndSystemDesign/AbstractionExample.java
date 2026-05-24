// ABSTRACTION EXAMPLE
// Demonstrates hiding implementation details and showing only the interface

public abstract class AbstractionExample {

    public abstract class DatabaseConnection {
        // Abstract methods
        public abstract void connect();

        public abstract void disconnect();

        public abstract void executeQuery(String query);

        // Concrete method
        public void showStatus() {
            System.out.println("Database connection status: Active");
        }
    }

    public class MySQLConnection extends DatabaseConnection {
        @Override
        public void connect() {
            System.out.println("Connecting to MySQL database...");
        }

        @Override
        public void disconnect() {
            System.out.println("Disconnecting from MySQL database...");
        }

        @Override
        public void executeQuery(String query) {
            System.out.println("Executing MySQL Query: " + query);
        }
    }

    public class OracleConnection extends DatabaseConnection {
        @Override
        public void connect() {
            System.out.println("Connecting to Oracle database...");
        }

        @Override
        public void disconnect() {
            System.out.println("Disconnecting from Oracle database...");
        }

        @Override
        public void executeQuery(String query) {
            System.out.println("Executing Oracle Query: " + query);
        }
    }

    public static void main(String[] args) {
        AbstractionExample example = new AbstractionExample();

        DatabaseConnection mySQLConn = example.new MySQLConnection();
        mySQLConn.connect();
        mySQLConn.executeQuery("SELECT * FROM users");
        mySQLConn.showStatus();
        mySQLConn.disconnect();

        System.out.println();

        DatabaseConnection oracleConn = example.new OracleConnection();
        oracleConn.connect();
        oracleConn.executeQuery("SELECT * FROM employees");
        oracleConn.showStatus();
        oracleConn.disconnect();
    }
}
