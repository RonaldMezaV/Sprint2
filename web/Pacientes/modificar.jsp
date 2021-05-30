
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALERTACOVID19</title>
    </head>
    <body>
        <h2>Modificar Pacientes</h2>
        
        
        <Form action="ControPacientes?accion=ActualizarPacientes" method=" POST" autocomplete=" off">
            <p>
                
                Id:
                <input id= "id" name="id" type="text" value="<c:out value="${pacientes.id}"/>"
                       
                       </p>
                
                                
                              
                Codigo:
                <input id= "Codigo" name="codigo" type="text" value="<c:out value="${pacientes.Codigo}"/>"
                       
                       </p>
                           
                       <p>
                Cedula:
                <input id= "Cedula" name="cedula" type="text" value="<c:out value="${pacientes.Cedula}"/>"
                       </p>
                       
                       
                       <p>
                Nombre:
                <input id= "Nombre" name="nombre" type="text" value="<c:out value="${pacientes.Nombre}"/>"
                       </p>
                       <p>
                      
                Apellido:
                <input id= "Apellido" name="apellido" type="text" value="<c:out value="${pacientes.Apellido}"/>"
                       
                       </p>
                       
                        <p>
                      
                Telefonos:
                <input id= "Telefono" name="telefono" type="text" value="<c:out value="${pacientes.Telefono}"/>"
                       
                       </p>
                       
                       
                            <p>
                Correo:
                <input id= "Correo" name="email" type="text" value="<c:out value="${pacientes.Correo}"/>"
                       
                       </p>
                       
                             <p>
                Ciudad:
                <input id= "Ciudad" name="ciudad" type="text"value="<c:out value="${pacientes.Ciudad}"/>"
                       </p>
                                     <p>
                Direccion:
                <input id= "Direccion" name="direccion" type="text" value="<c:out value="${pacientes.Direccion}"/>"
                       </p>
                       
                       
                          <p>
                      
                Celular:
                <input id= "Celular" name="celular" type="text" value="<c:out value="${pacientes.Celular}"/>"
                       
                       </p>
                       
                      <br /><br />
                       
                         <button id="guardar" name="guardar" type="submit">Guardar</button>
                       
                       
        </form>       
        
        
    </body>
</html>