
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PersonaDao implements Validar {
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
   
    
    @Override
    public int Validar(Persona per) {
         int r=0;
       String sql="Select * from persona where Nombres=? and Correo=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getCorreo());
            rs=ps.executeQuery();
            while (rs.next()){
                r=r+1;
                per.setNombre(rs.getString("Nombres"));
                per.setCorreo(rs.getString("Correo"));
            }
            if(r==1){
                return 1;
            }else{
                return 0;
            }    
        } catch (Exception e) {
            return 0;
        }
    
    }
    
   
    
    
    
    
}
