/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MBD;

import Controladora.Main;
import java.sql.*;
/**
 *
 * @author v6222
 */
public class ZConexion {
    
    String bd = Main.getBd();
    String usuario = Main.getUsuario();
    String contraseña = Main.getContraseña();
    String url = Main.getUrl();
    
    Connection connection;
 
    /** Constructor de DbConnection
     * @throws java.lang.Exception */
    public ZConexion() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("oracle.jdbc.Driver");
            try {
		connection = DriverManager.getConnection(url+bd, usuario, contraseña);
                
		} catch (SQLException e) {
                    throw new Exception("Usted no está conectado a la BBDD");
		}
        } catch (ClassNotFoundException e) {
            throw new Exception("Ha habido un fallo con la conexión a la BBDD");
	}
   }
  
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar() throws Exception{
        connection.close();
   }
    
}
