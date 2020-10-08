package modelDAO;

import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login {
    
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
      
    public boolean auth(String usuario, String contra, int rols ) {
        try {
            String consultaAuth = "select * from Usuario where users = ? and passwords = ? and rols = ?";
            ps = conect.getConection().prepareStatement(consultaAuth);
            ps.setString(1, usuario);
            ps.setString(2, contra);
            ps.setInt   (3, rols);
            rs = ps.executeQuery();
            
            if( rs.absolute(1) ) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
