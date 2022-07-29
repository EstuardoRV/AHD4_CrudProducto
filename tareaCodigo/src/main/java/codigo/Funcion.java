
package codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Funcion {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void insertar(int cod, String nom, String produc, String lugar){
        String sql = "insert into producto(Codigo,Nombre_producto,Cantidad_de_producto,Lugar_fabricacion) values (?,?,?,?)";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, nom);
            ps.setString(3, produc);
            ps.setString(4, lugar);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
}
