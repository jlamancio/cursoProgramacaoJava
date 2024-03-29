package jdbc.DevSuperior_jdbc2.application;

import jdbc.DevSuperior_jdbc2.db.DB;
import jdbc.DevSuperior_jdbc2.db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class mainJdbcCRUD_U {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "UPDATE coursejdbc.seller "
                            + "SET BaseSalary = BaseSalary + ? "
                            + "WHERE "
                            + "(DepartmentId = ?)");

            st.setDouble(1, 200.00);
            st.setInt(2, 4);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done ! Rows Affected = " + rowsAffected);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}

