package Modelo;


public class Pacientes {
    
    private int id ;
    private String Codigo, Cedula, Nombre, Apellido, Ciudad, Direccion, Telefono, Correo, Celular;

public Pacientes(int id, String Codigo, String cedula, String Nombre,  String Apellido, String Ciudad, String Direccion, String Telefono, String Correo, String Celular){
    
        
        this.id =id;
        this.Codigo= Codigo;
        this.Cedula= Cedula;
        this.Nombre= Nombre;
        this.Apellido= Nombre;        
        this.Ciudad= Ciudad;
        this.Direccion= Direccion;
        this.Telefono= Telefono;
        this.Correo=Correo; 
        this.Celular=Celular;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

}

