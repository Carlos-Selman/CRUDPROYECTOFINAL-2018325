package configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoIN5BM?useSSL=false","root","root");
            System.out.println("Conexion Establecida ...");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("La conexion no se realizo correctamente");
        }
    }
    public Connection getConection(){
        return conexion;
    }
}
