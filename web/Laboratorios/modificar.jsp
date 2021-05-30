
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALERTACOVID19</title>
    </head>
    <body>
        <h2>Modificar Laboratorios</h2>
        
        
        <Form action="ControLaboratorios?accion=ActualizarLaboratorios" method=" POST" autocomplete=" off">
            <p>
                
                Id:
                <input id= "id" name="id" type="hidden" value="<c:out value="${laboratorios.id}"/>"
                
                 <p>
                     
                Codigo:
                <input id= "Codigo" name="codigo" type="text"value="<c:out value="${laboratorios.Codigo}"/>" />
                       
                       </p>
                           
                       <p>
                Ruc:
                <input id= "Ruc" name="ruc" type="text"value="<c:out value="${laboratorios.Ruc}"/>"
                       </p>
                       
                       
                       <p>
                Empresa:
                <input id= "Empresa" name="Empresa" type="text"value="<c:out value="${laboratorios.Empresa}"/>"
                       </p>
                       </p>
                     
                 Ciudad:
                <input id= "Ciudad" name="ciudad" type="text"value="<c:out value="${laboratorios.Ciudad}"/>"
                       
                        <p>
                    
                    </p>
                 Direccion:
                <input id= "Direccion" name="direccion" type="text"value="<c:out value="${laboratorios.Direccion}"/>"
                     
                       </p>
                        <p>
                            
                Telefono:
                <input id= "Telefono" name="telefono" type="text" value="<c:out value="${laboratorios.Telefono}"/>"
                       
                       </p>
                       </p>
                       
                Correo:
                <input id= "Correo" name="correo" type="text" value="<c:out value="${laboratorios.Correo}"/>"
                       
                       </p>
                       </p>
                                                  
                Celular:
                <input id= "Celular" name="celular" type="text"value="<c:out value="${laboratorios.Celular}"/>"
                       
                       </p>
                       
                      <br /><br />
                       
                         <button id="guardar" name="guardar" type="submit">Guardar</button>
                       
                       
        </form>       
        
        
    </body>
</html>