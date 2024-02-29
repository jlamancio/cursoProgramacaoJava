package jdbc.DevSuperior_jdbc2.application;

import jdbc.DevSuperior_jdbc2.db.DB;
import jdbc.DevSuperior_jdbc2.db.DBIntegrityException;
import jdbc.DevSuperior_jdbc2.db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class mainJdbcCRUD_D {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "DELETE FROM coursejdbc.department "
                            + "WHERE "
                            + "(Id = ?)");

            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done ! Rows Affected = " + rowsAffected);
        } catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}

