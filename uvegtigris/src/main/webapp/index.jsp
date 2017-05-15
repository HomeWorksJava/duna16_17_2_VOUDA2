<%-- Berki Dávid - vouda2 --%>

<%@page import="uvegtigris.service.memory.italServiceImpl"%>
<%@page import="uvegtigris.service.api.italService"%>
<%@page import="uvegtigris.service.memory.etelServiceImpl"%>
<%@page import="uvegtigris.service.api.etelService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css">
        <title>ÜVEGTIGRIS RAKTÁRKÉSZLET NYILVÁNTARTÓ</title>
    </head>
    <body>
        <%
            etelService serviceEtel = new etelServiceImpl();
            italService serviceItal = new italServiceImpl();
        %>
        <header>
            <h1>ÜVEGTIGRIS RAKTÁRKÉSZLET NYILVÁNTARTÓ</h1>
        </header>
        <table align="center">
            <tr>
                <td><h2>ÉTELEK</h2></td>
            </tr>
            <tr class="adat">
                <td>Ételfajta:</td>
                <td>ID:</td>
                <td>Gyártó:</td>
                <td>Neve:</td>
                <td>Mennyiség:</td>
                <td>Mértékegység:</td>
            </tr>
            <tr>
                <td><% out.print(serviceEtel.getEtelById(0).getEtelfajta()); %></td>
                <td><% out.print(serviceEtel.getEtelById(0).getID()); %></td>
                <td><% out.print(serviceEtel.getEtelById(0).getGyarto()); %></td>
                <td><% out.print(serviceEtel.getEtelById(0).getNeve()); %></td>
                <td><% out.print(serviceEtel.getMennyisegById(0).getMennyiseg()); %></td>
                <td><% out.print(serviceEtel.getMennyisegById(0).getMertekegyseg()); %></td>
            </tr>

             <tr>
                <td><h2 class="italok">ITALOK</h2></td>
            </tr>
            <tr class="adat">
                <td>Italfajta:</td>
                <td>ID:</td>
                <td>Gyártó:</td>
                <td>Neve:</td>
                <td>Mennyiség:</td>
                <td>Mértékegység:</td>
            </tr>
            <tr>
                <td><% out.print(serviceItal.getItalById(0).getItalfajta()); %></td>
                <td><% out.print(serviceItal.getItalById(0).getID()); %></td>
                <td><% out.print(serviceItal.getItalById(0).getGyarto()); %></td>
                <td><% out.print(serviceItal.getItalById(0).getNeve()); %></td>
                <td><% out.print(serviceItal.getMennyisegById(0).getMennyiseg()); %></td>
                <td><% out.print(serviceItal.getMennyisegById(0).getMertekegyseg()); %></td>
            </tr>
        </table>
    </body>
</html>
