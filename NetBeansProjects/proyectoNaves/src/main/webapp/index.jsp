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
    </head>
    <body>
        <h1>Naves Star Wars</h1>
        
        <form action="servletOperacion" method="get">
            
            <h2>Halcon Milenario</h2>
            Digite cant personas que transporta: <input type="text" name="txtHalconCantPersonas">
            Digite cant litros: <input type="text" name="txtHalconCantLitros">
            Digite cant naves: <input type="text" name="txtHalconCantNaves">
            
            <h2>Destructor Estelar</h2>
            Digite cant personas que transporta: <input type="text" name="txtDestructorCantPersonas">
            Digite cant litros: <input type="text" name="txtDestructorCantLitros">
            Digite cant naves: <input type="text" name="txtDestructorCantNaves">
            
            <h2>Lanzadera Imperial</h2>
            Digite cant personas que transporta: <input type="text" name="txtLanzaderaCantPersonas">
            Digite cant litros: <input type="text" name="txtLanzaderaCantLitros">
            Digite cant naves: <input type="text" name="txtLanzaderaCantNaves">
            
            <h2>Supremacy</h2>
            Digite cant personas que transporta: <input type="text" name="txtSupremacyCantPersonas">
            Digite cant litros: <input type="text" name="txtSupremacyCantLitros">
            Digite cant naves: <input type="text" name="txtSupremacyCantNaves">
            
            <h2>At-At:</h2>
            Digite cant personas que transporta: <input type="text" name="txtAtAtCantPersonas">
            Digite cant litros: <input type="text" name="txtAtAtCantLitros">
            Digite cant naves: <input type="text" name="txtAtAtCantNaves"><br><br>
            
            
            <input type="submit">
            
        </form>
        
    </body>
</html>
