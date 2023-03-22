<%-- 
    Document   : index
    Created on : 20/03/2023, 5:26:51 p. m.
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="stilo.css"/>
    </head>
    <body>
        <h1>Naves Star Wars</h1>
        
        <form action="servletOperacion" method="get">
            
            <h2>Halcon Milenario</h2>
            <div>
            Digite cant personas que transporta: <input type="text" name="txtHalconCantPersonas">
            Digite cant litros: <input type="text" name="txtHalconCantLitros">
            Digite cant naves: <input type="text" name="txtHalconCantNaves">
            </div>
            
            <h2>Destructor Estelar</h2>
            <div>
            Digite cant personas que transporta: <input type="text" name="txtDestructorCantPersonas">
            Digite cant litros: <input type="text" name="txtDestructorCantLitros">
            Digite cant naves: <input type="text" name="txtDestructorCantNaves">
            </div>

            <h2>Lanzadera Imperial</h2>
            <div>
            Digite cant personas que transporta:  <input type="text" name="txtLanzaderaCantPersonas">
            Digite cant litros: <input type="text" name="txtLanzaderaCantLitros">
            Digite cant naves: <input type="text" name="txtLanzaderaCantNaves">
            </div>
            
            <h2>Supremacy</h2>
            <div>
            Digite cant personas que transporta: <input type="text" name="txtSupremacyCantPersonas">
            Digite cant litros: <input type="text" name="txtSupremacyCantLitros">
            Digite cant naves: <input type="text" name="txtSupremacyCantNaves">
            </div>

            <div>
            <h2>At-At:</h2>
            Digite cant personas que transporta: <input type="text" name="txtAtAtCantPersonas">
            Digite cant litros: <input type="text" name="txtAtAtCantLitros">
            Digite cant naves: <input type="text" name="txtAtAtCantNaves"><br><br>
            </div>
            
            <input type="submit">
            
        </form>
        
    </body>
</html>
