
package Controlador;



import Modelo.Pacientes;
import Modelo.PacientesDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ControPacientes", urlPatterns = {"/ControPacientes"})
public class ControPacientes extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
      PacientesDao pacientesDao = new PacientesDao();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
        
        if(accion == null || accion.isEmpty()){
                dispatcher = request.getRequestDispatcher("Pacientes/index.jps");
                List<Pacientes> listaPacientes = pacientesDao.listaPacientes();
                request.setAttribute("lista" , listaPacientes);
                
        } else if ( "actualizar".equals(accion)){
                
                 int id= Integer.parseInt(request.getParameter("id"));
                String Codigo= request.getParameter("Codigo");
                String Cedula= request.getParameter("Cedula");
                 String Nombre= request.getParameter("Nombre");
                 String Apellido= request.getParameter("Apellido");
                  String Ciudad= request.getParameter("Ciudad");
                   String Direccion= request.getParameter("Direccion");
                    String Telefono= request.getParameter("Telefono");
                String Correo= request.getParameter("Correo");
                    String Celular= request.getParameter("Celular");
                
                
                
                
                //Double Precio= Double.parseDouble(request.getParameter("Precio"));
               // int Existencia=Integer.parseInt( request.getParameter("Existencia"));
                
                
                Pacientes pacientes = new Pacientes (id, Codigo,Cedula,Nombre,Apellido,Ciudad,Direccion,Telefono, Correo, Celular );
                
                pacientesDao.ActualizarPacientes(pacientes);
                
                
                dispatcher = request.getRequestDispatcher("Laboratorios/index.jps");
                
                List<Pacientes> listaPacientes = pacientesDao.listaPacientes();
                request.setAttribute("lista" , listaPacientes);
                
            }else if ( "eliminar".equals(accion)){
                
                 int id= Integer.parseInt(request.getParameter("id"));
                
                pacientesDao.EliminarPacientes(id);
                dispatcher = request.getRequestDispatcher("Pacientes/index.jps");
                List<Pacientes> listaPacientes = pacientesDao.listaPacientes();
                request.setAttribute("lista" , listaPacientes);
                
    }else {
                dispatcher = request.getRequestDispatcher("Laboratorios/index.jps");
                List<Pacientes> listaPacientes = pacientesDao.listaPacientes();
                request.setAttribute("lista" , listaPacientes);
                 
                
                
            }
                
                
        dispatcher.forward(request, response);  
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
