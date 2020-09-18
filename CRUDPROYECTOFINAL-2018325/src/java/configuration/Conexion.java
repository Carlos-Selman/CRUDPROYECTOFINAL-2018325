package configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    // Variables de conexion
    private Connection conexion;
    private static Conexion instance;

    // Creamos la conexion para la base de datos
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoIN5BM?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false", "root","admin");            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    // Aplicamos el patron singelton para la conexion
    public Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    // Creamos el get para conexion.
    public Connection getConexion() {
        return conexion;
    }

    // Creamos el set para conexion.
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}