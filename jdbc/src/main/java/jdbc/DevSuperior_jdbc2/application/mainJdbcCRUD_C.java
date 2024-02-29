package jdbc.DevSuperior_jdbc2.application;


import jdbc.DevSuperior_jdbc2.db.DB;
import jdbc.DevSuperior_jdbc2.db.DbException;

import java.sql.*;
import java.text.SimpleDateFormat;


public class mainJdbcCRUD_C {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = DB.getConnection();
        PreparedStatement st = null;

        try {
        /*
            st = conn.prepareStatement(
                    "INSERT INTO coursejdbc.seller"
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                            + "VALUES "
                            + "(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "José Luis Amancio");
            st.setString(2, "joseluisamancio@meuEmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("01/01/1960").getTime()));
            st.setDouble(4, 1200.00);
            st.setInt(5, 4);INTO
        */
            st = conn.prepareStatement(
                    "INSERT INTO coursejdbc.department (Name) values ('Compliance'), ('O&M')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done ! Id = " + id);
                }
            }
            else{
                System.out.println("No Rows Affected !!");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
//        } catch (ParseException e) {
//            throw new RuntimeException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}


