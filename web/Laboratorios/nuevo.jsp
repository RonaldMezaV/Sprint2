<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALERTACOVID19</title>
    </head>
    <body>
       <h2>Nuevo Registro Laboratorios</h2>
        
        
        <Form action="ControLaboratorios?accion=insertar" method=" POST" autocomplete=" off">
            <p>
                Codigo:
                <input id= "Codigo" name="codigo" type="text" />
                       
                       </p>
                       <p>
                Empresa:
                <input id= "Empresa" name="empresa" type="text" />
                       </p>
                       <p>
                      
                RUC:
                <input id= "Ruc" name="ruc" type="text" />
                       
                       </p>
                       
                        <p>
                      
                Telefonos:
                <input id= "Telefono" name="telefono" type="text" />
                       
                       </p>
                       
                       
                            <p>
                Correo:
                <input id= "Correo" name="correo" type="text" />
                       
                       </p>
                       
                             <p>
                Ciudad:
                <input id= "Ciudad" name="ciudad" type="text" />
                       </p>
                       
                       
                          <p>
                      
                Celular:
                <input id= "Celular" name="celular" type="text" />
                       
                       </p>
                       
                      <br /><br />
                       
                       <button id="Crear Cuenta" name="Crear Cuenta" type="submit">Crear Cuenta</button>
                       
                       
        </form>       
        
        
    </body>
</html>

