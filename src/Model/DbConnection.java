package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static DbConnection db = null;

    private DbConnection() {

    }

    public static DbConnection getInstance() {
        if (db == null) {
            db = new DbConnection();
            return db;
        } else {
            return db;
        }
    }
    
    // Add jar/folder < libraries < propertiesفي المشروع من خلال ال jarمع الداتا بيز الخاصة بالمشروع من خلال اضافة ملف الmySQL Connectorبعد هذه الخطوة لازم تسجل ال
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_appointments", "root", ""); 
        return c;
    }
}
