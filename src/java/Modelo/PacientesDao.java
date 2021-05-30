package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacientesDao {
    
    Connection conexion;
    
    public PacientesDao(){
        Conexion con = new Conexion();
        conexion = con.getConexion();
        
                
    }
    
   
    public List<Pacientes> listaPacientes(){
        PreparedStatement ps;
        ResultSet rs;
        
        List<Pacientes> lista = new ArrayList<>();
        
        try{
            ps = conexion.prepareStatement("SELECT id, Codigo,cedula, Nombre, Apellido,Ciudad, Direccion, Telefono,Correo,Celular FROM Laboratorios");
            rs=ps.executeQuery();
            
            while (rs.next()){
                
                int id= rs.getInt("id");
                String Codigo=rs.getString("Codigo");
                String Cedula=rs.getString("Cedula");
                String Nombre=rs.getString("Nombre");
                String Apellido=rs.getString("Apellido");
                String Ciudad=rs.getString("Ciudad");
                String Direccion=rs.getString("Direccion");
                String Telefono=rs.getString("Telefono");
                String Correo=rs.getString("Correo");
                String Celular=rs.getString("Celular");
                
                
                
                Pacientes paciente = new Pacientes( id, Codigo, Cedula, Nombre, Apellido,Ciudad,Direccion,Telefono, Correo, Celular);
                
                
                lista.add(paciente);
            }
                
                return lista;
            
        
        
    } catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    
}

    

public Pacientes MostrarPacientes(int _id){
        PreparedStatement ps;
        ResultSet rs;
        
        Pacientes paciente= null;
        
        
       try{
            ps = conexion.prepareStatement("SELECT id, Codigo,Cedula, Nombre, Apellido ,Ciudad, Direccion, Telefono,Correo,Celular FROM Laboratorios WHERE id=?");
           ps.setInt(1,_id);
            rs=ps.executeQuery();
            
            while (rs.next()){
                
                int id= rs.getInt("id");
                String Codigo=rs.getString("Codigo");
                String Cedula=rs.getString("Cedula");
                String Nombre=rs.getString("Nombre");
                String Apellido=rs.getString("Apellido");
                String Ciudad=rs.getString("Ciudad");
                String Direccion=rs.getString("Direccion");
                String Telefono=rs.getString("Telefono");
                String Correo=rs.getString("Correo");
                String Celular=rs.getString("Celular");
                
                
                  paciente = new Pacientes( id, Codigo,Cedula,Nombre, Apellido,Ciudad,Direccion,Telefono, Correo, Celular);
                
                
               
            }
                
                return paciente;
            
        
        
    } catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    
}

public boolean InsertarPacientes(Pacientes paciente){
        PreparedStatement ps;
       
        
              
        try{
            ps = conexion.prepareStatement("INSERT INTO Pacientes ( id, Codigo,Cedula, Nombre ; Apellido,Ciudad, Direccion, Telefono,Correo,Celular)  values (?,?,?,?,?,?,?,?,?)");
            
                         ps.setString(1,paciente.getCodigo());
                         ps.setString(2,paciente.getCedula());
                         ps.setString(3,paciente.getNombre());
                          ps.setString(4,paciente.getApellido());
                         ps.setString(5,paciente.getCiudad());
                         ps.setString(6,paciente.getDireccion());
                         ps.setString(7,paciente.getTelefono());
                         ps.setString(8,paciente.getCorreo());
                         ps.setString(9,paciente.getCelular());
                         
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return false;
    }
    
}

public boolean ActualizarPacientes(Pacientes paciente){
        PreparedStatement ps;
       
        
        try{
            ps = conexion.prepareStatement("UPDATE Pacientes SET Codigo=?, Cedula=?,Nombre=?, Apellido=?,Ciudad=?, Direccion=?, Telefono=?, Correo=?, Celular=? WHERE id=?");
            
                         ps.setString(1,paciente.getCodigo());
                         ps.setString(2,paciente.getCedula());
                         ps.setString(3,paciente.getNombre());
                         ps.setString(4,paciente.getApellido());
                         ps.setString(5,paciente.getCiudad());
                         ps.setString(6,paciente.getDireccion());
                         ps.setString(7,paciente.getTelefono());
                         ps.setString(8,paciente.getCorreo());
                         ps.setString(9,paciente.getCelular());
                          ps.setInt(10,paciente.getId());
                         
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return false;
    }
    
}

public boolean EliminarPacientes(int _id){
        PreparedStatement ps;
       
        
              
        try{
            ps = conexion.prepareStatement("DELETE FROM Pacientes WHERE id=?");
            
                         ps.setInt(1, _id);
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return false;
    }
    





}
}

