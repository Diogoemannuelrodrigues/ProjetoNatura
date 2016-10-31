<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
<div align="center">
<table bgcolor="yellow" width="100%">
   <th><font color="Black" ><marquee>Natura: Bem Estar Bem!!!!!</marquee>
 <div align="center"></div> </font></th>
   </table>
<fieldset style="width: 35%">

<form action="">

<img src="imagens/natura-logo.jpg"height="200"width="200" WIDTH=20% /><br><br>

<font color="ORANGE">
<table border="2">
<tr align="RIGHT">
<td colspan="3" align="center">MENU</td>
</tr>
<tr>			
		<%
		
// 		if(session.getAttribute("login") == null)
// 			request.getRequestDispatcher("/Login.jsp").forward(request, response);
// 			response.sendRedirect("Login.jsp");
		
		%> 
<font color ="#ff0000">
<td><a href="Produto/Cadastro.jsp"><input type="button" name="Produto" value="Produto"/></a></td>
<td><a href="Cliente/CadastroCliente.jsp"><input type="button" name="Cliente" value="Cliente"/></a></td>
<!-- <td><a href="../ProjetoNatura/Produto?acao=consultarProduto"><input type="button" name="Consultar Produto" value="Consultar Produto"/></a></td> -->
<td><a href="/Relatio.jsp"><input type="button" name="venda" value="Venda"/></a></td>
</font>
</td>
</tr>
</form>

</div>
</fieldset>
<BR></BR></table>
<th><font color="Black" ><marquee>Compre nossos produtos!!!!!</marquee>
</body>
</html>