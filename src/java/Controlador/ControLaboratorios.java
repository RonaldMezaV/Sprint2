
package Controlador;

import Modelo.LaboratoriosDao;
import Modelo.Laboratorios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ControLaboratorios", urlPatterns = {"/ControLaboratorios"})
public class ControLaboratorios extends HttpServlet {


   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        LaboratoriosDao laboratoriosDao = new LaboratoriosDao();
        String accion;
        RequestDispatcher dispatcher = null;
        accion = request.getParameter("accion");
        
        if(accion == null || accion.isEmpty()){
                dispatcher = request.getRequestDispatcher("Laboratorios/index.jps");
                List<Laboratorios> listaLaboratorios = laboratoriosDao.listaLaboratorios();
                request.setAttribute("lista" , listaLaboratorios);
              
                
            }else if ( "actualizar".equals(accion)){
                
                 int id= Integer.parseInt(request.getParameter("id"));
                String Codigo= request.getParameter("Codigo");
                String Ruc= request.getParameter("Ruc");
                 String Empresa= request.getParameter("Empresa");
                  String Ciudad= request.getParameter("Ciudad");
                   String Direccion= request.getParameter("Direccion");
                    String Telefono= request.getParameter("Telefono");
                String Correo= request.getParameter("Correo");
                    String Celular= request.getParameter("Celular");
                
                
                
                
                //Double Precio= Double.parseDouble(request.getParameter("Precio"));
               // int Existencia=Integer.parseInt( request.getParameter("Existencia"));
                
                
                Laboratorios laboratorio = new Laboratorios (id, Codigo,Ruc,Empresa,Ciudad,Direccion,Telefono, Correo, Celular );
                
                laboratoriosDao.ActualizarLaboratorios(laboratorio);
                
                
                dispatcher = request.getRequestDispatcher("Laboratorios/index.jps");
                
                List<Laboratorios> listaLaboratorios = laboratoriosDao.listaLaboratorios();
                request.setAttribute("lista" , listaLaboratorios);
                
            }else if ( "eliminar".equals(accion)){
                
                 int id= Integer.parseInt(request.getParameter("id"));
                
                laboratoriosDao.EliminarLaboratorios(id);
                dispatcher = request.getRequestDispatcher("Laboratorios/index.jps");
                List<Laboratorios> listaLaboratorios = laboratoriosDao.listaLaboratorios();
                request.setAttribute("lista" , listaLaboratorios);
                
    }else {
                dispatcher = request.getRequestDispatcher("Laboratorios/index.jps");
                List<Laboratorios> listaLaboratorios = laboratoriosDao.listaLaboratorios();
                request.setAttribute("lista" , listaLaboratorios);
                 
                
                
            }
        dispatcher.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet ( request, response);
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}