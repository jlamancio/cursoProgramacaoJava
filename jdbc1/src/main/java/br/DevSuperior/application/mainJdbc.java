package br.DevSuperior.application;

import br.DevSuperior.db.DB;

import java.sql.Connection;


public class mainJdbc {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        DB.closeConnection();

    }
}


