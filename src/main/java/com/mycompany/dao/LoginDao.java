package com.mycompany.dao;

import com.mycompany.entity.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class LoginDao {

    public static boolean validate(String username, String userpass) throws ClassNotFoundException, SQLException {
        boolean status;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db_carsoft;user=root;password=vertrigo")) {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario=? and senha=?");
            stmt.setString(1, username);
            stmt.setString(2, userpass);

            ResultSet rs = stmt.executeQuery();
            status = rs.next();
        }
        return status;
    }

    public static Usuario getPessoa(String username) throws SQLException, ClassNotFoundException {
        Usuario usuario = new Usuario();
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db_carsoft;user=root;password=vertrigo")) {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM USUARIO WHERE USUARIO=?");
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    usuario.setUsuario(rs.getString("USUARIO"));
                }
            }
        }
        return usuario;
    }
}
