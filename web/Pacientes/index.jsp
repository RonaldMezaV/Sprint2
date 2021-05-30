
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALERTACOVID19</title>
    </head>
    <body>
        <h1>PACIENTES</h1>
        
        <a href="" >Nuevo registro</a>
        
        <br /><br />
        
        <table border="1" width="80%"> 
            <thead>
                
                 <tr>
                      <th>Codigo:</th>
                      <th>Nombre:</th>
                      <th>Cedula:</th>
                      <th>Direccion: </th>
                      <th>Telefonos:</th>
                      <th>Correo:</th>
                      <th>Ciudad:</th>
                      <th>Celular: </th>
                      
                      <th></th>
                      <th></th>
                      
                      <tr>
                                
                     </thead>
                     
                     </tbody>
                     
                     
                      <c:forEach var= "pacientes" items ="${lista}">
                                
                         <tr>
                             <td><c:out value="${pacientes.Codigo}"/></td>
                             <td><c:out value="${pacientes.Nombre}"/></td>
                             <td><c:out value="${pacientes.Cedula}"/></td>
                             <td><c:out value="${pacientes.Direccion}"/></td>
                             <td><c:out value="${pacientes.Telefonos}"/></td>
                             <td><c:out value="${pacientes.Correo}"/></td>
                             <td><c:out value="${pacientes.Ciudad}"/></td>
                             <td><c:out value="${pacientes.Celular}"/></td>
                                                                 
                             <td><a href="ControPacientes?accion=modificar&id=?<c:out value="${pacientes.id}"/>">Modificar</a><td>
                             <td><c:out value="${pacientes.id}"/></td>
                             <td><a href="ControPacientes?accion=eliminar&id=?<c:out value="${pacientes.id}"/>">Eliminar</a><td>
                             
                                 </tr>
                      </c:forEach>
                     
                     
                     
                     
                     
                     </tbody>

        </table>
            
            
        
        
        
        
        
        
    </body>
</html>

