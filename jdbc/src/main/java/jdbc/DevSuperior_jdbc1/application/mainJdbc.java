package jdbc.DevSuperior_jdbc1.application;

import jdbc.DevSuperior_jdbc1.db.DB;

import java.sql.Connection;


public class mainJdbc {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        DB.closeConnection();

    }
}


