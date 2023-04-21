package Start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class DataIngest {
    public static void main(String[] args) {

        Properties props = getDbProps();
        StringBuilder sb = new StringBuilder();
        sb.append("jdbc:mysql://");
        sb.append(props.getProperty("database.endpoint"));
        sb.append(":");
        sb.append(props.getProperty("database.port"));
        sb.append("/");
        sb.append("mysql");
        String username = props.getProperty("database.username");
        String password = props.getProperty("database.password");
        String port = props.getProperty("database.port");

        try{
            Connection conn = DriverManager.getConnection(sb.toString(), username, password);
            System.out.println(conn);
        }catch(SQLException e){
            System.out.println("Failed: " + e);
        }
    }

    private static Properties getDbProps(){
        Properties props = new Properties();
        try (InputStream input = new FileInputStream("\\Users\\brock\\IEDR\\DataIngestion\\src\\Start\\database.properties")) {
            props.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return props;
    }
}