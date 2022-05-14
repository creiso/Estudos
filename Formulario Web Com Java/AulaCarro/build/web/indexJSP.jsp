<%-- 
    Document   : indexJSP
    Created on : 13/05/2022, 19:37:35
    Author     : Lab01
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Carro"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastra Carro</title>
          <link rel="stylesheet" type="text/css"  href="css/style.css">
         <%! 
            Carro carro=new Carro();
            String valors;
        %>
        
    </head>
    <body>
        <div class="centro">
        <h1>Produto</h1>
         <%
            carro.setChassi(request.getParameter("chassi"));
            carro.setPlaca(request.getParameter("placa"));
            carro.setCor(request.getParameter("cor"));
            carro.setAno(Integer.parseInt(request.getParameter("ano")));
            carro.setModelo(request.getParameter("modelo"));
            carro.setValor(Double.parseDouble(request.getParameter("valor")));
            carro.setFabricante(request.getParameter("fabricante"));
            DecimalFormat df = new DecimalFormat("0.00");
            valors = df.format(carro.getValor());
            
                    
               
        %>
        <p>Chassi:<%= carro.getChassi()%></p>
        <p>Placa: <%= carro.getPlaca()%></p>
        <p>Cor: <%= carro.getCor()%></p>
        <p>Ano: <%= carro.getAno() %></p>
        <p>Modelo: <%= carro.getModelo() %></p>
        <p>Fabricante: <%= carro.getFabricante() %></p>
        <p>Valor: R$<%=valors %></p>
        <a href="index.html">Voltar</a>
        </div>
    </body>
</html>
    </body>
</html>
