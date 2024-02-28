package jdbc.DevSuperior_jdbc2.application;

import jdbc.DevSuperior_jdbc2.db.DB;
import jdbc.DevSuperior_jdbc2.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class mainJdbcCRUD_U {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");

            while (rs.next()){
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        }
        catch(SQLException e){
            throw new DbException(e.getMessage());
        }
        finally {

            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConnection();
        }

    }
}


