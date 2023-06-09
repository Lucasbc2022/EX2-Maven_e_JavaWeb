<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/styles.css">
<title>Onibus</title>
</head>
<body>
    <div>
		<jsp:include page="menu.jsp"/>
	</div>
	    <br />
        <div align="center" class="container">
           <form action="onibus" method="post">
              <p class="title">
                  <b>Descri��o do Onibus</b>
              </p>
                  
        
                      <table>
                  <tr>
                      <td colspan="3">
                          <input class="id_input_data" type="number"  id="cv" name="cv" placeholder="Codigo da viagem"
                          value='<c:out value="${onibus.codigo_viagem }"></c:out>'>
                      </td>
                      <td>
                          <input type="submit" id="botao" name="botao" value="Buscar">
                      </td>    
                  </tr>
                  <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="nome" name="nome"
                          placeholder="Nome do Motorista"
                          value='<c:out value="${onibus.nome_mot }"></c:out>'>
                      </td>    
                  </tr>
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="placa" name="placa"
                          placeholder="Placa do Onibus"
                          value='<c:out value="${onibus.placa }"></c:out>'>
                      </td>    
                  </tr>                  
                  
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" 
                           id="marc_oni" name="marc_oni" placeholder="Marca do Onibus"
                          value='<c:out value="${onibus.marca }"></c:out>'>
                      </td>    
                  </tr>
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="number" min="0" step="1"
                           id="ano" name="ano" placeholder="Ano da Viagem"
                          value='<c:out value="${onibus.ano }"></c:out>'>
                      </td>    
                  </tr>
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="descricao" name="descricao"
                          placeholder="Descri��o" 
                          value='<c:out value="${onibus.descricao }"></c:out>'>
                      </td>    
                  </tr>
                  
                 </table>
                </form>    
            </div>

</body>
</html>