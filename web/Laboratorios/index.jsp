
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALERTACOVID19</title>
    </head>
    <body>
        <h1>LABORATORIOS</h1>
        
        <a href="" >Nuevo registro</a>
        
        <br /><br />
        
        <table border="1" width="80%"> 
            <thead>
                
                 <tr>
                      <th>Codigo:</th>
                      <th>Empresa:</th>
                      <th>Ruc#:</th>
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
                     
                     
                     <c:forEach var= "laboratorios" items ="${lista}">
                                
                         <tr>
                             <td><c:out value="${laboratorios.Codigo}"/></td>
                             <td><c:out value="${laboratorios.Ruc}"/></td>
                             <td><c:out value="${laboratorios.Empresa}"/></td>
                             <td><c:out value="${laboratorios.Ciudad}"/></td>
                             <td><c:out value="${laboratorios.Direccion}"/></td>
                             <td><c:out value="${laboratorios.Telefono}"/></td>
                             <td><c:out value="${laboratorios.Correo}"/></td>
                             <td><c:out value="${laboratorios.Celular}"/></td>
                                                                 
                             <td><a href="ControLaboratorios?accion=modificar&id=?<c:out value="${laboratorios.id}"/>">Modificar</a><td>
                             <td><c:out value="${laboratorios.id}"/></td>
                             <td><a href="ControLaboratorios?accion=eliminar&id=?<c:out value="${Laboratorios.id}"/>">Eliminar</a><td>
                             
                                 </tr>
                      </c:forEach>
                     
                     
                     
                     </tbody>

        </table>
            
            
        </body> 
        
        
        
        
        
        
    </body>
</html>

