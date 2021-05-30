package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LaboratoriosDao {
    
    Connection conexion;
    
    public LaboratoriosDao(){
        Conexion con = new Conexion();
        conexion = con.getConexion();
        
                
    }
    
   
    public List<Laboratorios> listaLaboratorios(){
        PreparedStatement ps;
        ResultSet rs;
        
        List<Laboratorios> lista = new ArrayList<>();
        
        try{
            ps = conexion.prepareStatement("SELECT id, Codigo,Ruc, Empresa,Ciudad,Direccion,Telefono,Correo,Celular FROM Laboratorios");
            rs=ps.executeQuery();
            
            while (rs.next()){
                
                int id= rs.getInt("id");
                String Codigo=rs.getString("Codigo");
                String Ruc=rs.getString("Ruc");
                String Empresa=rs.getString("Empresa");
                String Ciudad=rs.getString("Ciudad");
                String Direccion=rs.getString("Direccion");
                String Telefono=rs.getString("Telefono");
                String Correo=rs.getString("Correo");
                String Celular=rs.getString("Celular");
                
                
                
                Laboratorios laboratorio = new Laboratorios( id, Codigo,Ruc, Empresa,Ciudad,Direccion,Telefono, Correo, Celular);
                
                
                lista.add(laboratorio);
            }
                
                return lista;
            
        
        
    } catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    
}

    

public Laboratorios MostrarLaboratorios(int _id){
        PreparedStatement ps;
        ResultSet rs;
        
        Laboratorios laboratorio= null;
        
        
       try{
            ps = conexion.prepareStatement("SELECT id, Codigo,Ruc, Empresa,Ciudad, Direccion, Telefono,Correo,Celular FROM Laboratorios WHERE id=?");
           ps.setInt(1,_id);
            rs=ps.executeQuery();
            
            while (rs.next()){
                
                int id= rs.getInt("id");
                String Codigo=rs.getString("Codigo");
                String Ruc=rs.getString("Ruc");
                String Empresa=rs.getString("Empresa");
                String Ciudad=rs.getString("Ciudad");
                String Direccion=rs.getString("Direccion");
                String Telefono=rs.getString("Telefono");
                String Correo=rs.getString("Correo");
                String Celular=rs.getString("Celular");
                
                
                  laboratorio = new Laboratorios( id, Codigo,Ruc, Empresa,Ciudad,Direccion,Telefono, Correo, Celular);
                
                
               
            }
                
                return laboratorio;
            
        
        
    } catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    
}

public boolean InsertarLaboratorios(Laboratorios laboratorio){
        PreparedStatement ps;
       
        
              
        try{
            ps = conexion.prepareStatement("INSERT INTO laboratorios ( id, Codigo,Ruc, Empresa,Ciudad, Direccion, Telefono,Correo,Celular)  values (?,?,?,?,?,?,?,?,?)");
            
                         ps.setString(1,laboratorio.getCodigo());
                         ps.setString(2,laboratorio.getRuc());
                         ps.setString(3,laboratorio.getEmpresa());
                         ps.setString(4,laboratorio.getCiudad());
                         ps.setString(5,laboratorio.getDireccion());
                         ps.setString(6,laboratorio.getTelefono());
                         ps.setString(7,laboratorio.getCorreo());
                         ps.setString(8,laboratorio.getCelular());
                         
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return false;
    }
    
}

public boolean ActualizarLaboratorios(Laboratorios laboratorio){
        PreparedStatement ps;
       
        
        try{
            ps = conexion.prepareStatement("UPDATE Laboratorios SET Codigo=?, Ruc=?, Empresa=?,Ciudad=?, Direccion=?, Telefono=?, Correo=?, Celular=? WHERE id=?");
            
                         ps.setString(1,laboratorio.getCodigo());
                         ps.setString(2,laboratorio.getRuc());
                         ps.setString(3,laboratorio.getEmpresa());
                         ps.setString(4,laboratorio.getCiudad());
                         ps.setString(5,laboratorio.getDireccion());
                         ps.setString(6,laboratorio.getTelefono());
                         ps.setString(7,laboratorio.getCorreo());
                         ps.setString(8,laboratorio.getCelular());
                          ps.setInt(9,laboratorio.getId());
                         
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return false;
    }
    
}

public boolean EliminarLaboratorios(int _id){
        PreparedStatement ps;
       
        
              
        try{
            ps = conexion.prepareStatement("DELETE FROM laboratorios WHERE id=?");
            
                         ps.setInt(1, _id);
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return false;
    }
    





}
}


