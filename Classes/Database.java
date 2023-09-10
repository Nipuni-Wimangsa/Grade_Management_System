package gradebook.application.logic;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    private String url = "jdbc:mysql://localhost:3306/gradebook";
    private String user = "root";
    private String password = "nipuni";

    public void updateData(String sql) {
        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

            statement.executeUpdate(sql);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public String[] getData(String sql, String[] columnNames) {
        String[] array = new String[columnNames.length];

        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                for(int i = 0; i < columnNames.length; i++)
                    array[i] = result.getString(columnNames[i]);
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return array;
    }
    
    
    public String[] getMultipleData(String sql, String columnName) {
        ArrayList<String> list = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                list.add(result.getString(columnName));
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] array = new String[list.size()];
        array = list.toArray(array);
        
        return array;
    }
    
}
