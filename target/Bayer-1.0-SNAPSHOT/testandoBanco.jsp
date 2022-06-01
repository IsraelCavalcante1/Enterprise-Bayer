<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="static com.bayer.data.dao.CRUD.connection" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


    <%! ResultSet rs;%>
    <%! int idade;%>


<%

    Statement statement;
    try {
        statement = connection.createStatement();
        rs = statement.executeQuery("SELECT h.endereco_id_endereco,h.id_pessoa,h.cpf,h.pessoa_id_pessoa,h.nascimento,h.nome,h.id_sus, h.sexo,j.regiao_id_regiao,i.nome_regiao,g.estado_id_estado,l.id_registro,l.pessoa_id_pessoa,l.doenca_id_doenca, l.data_registro_doenca,k.id_doenca,k.nome_doenca FROM pessoa h,endereco g,estado j,regiao i, doenca_registro l,doenca k WHERE g.id_endereco = h.endereco_id_endereco AND i.id_regiao = j.regiao_id_regiao AND j.id_estado = g.estado_id_estado AND k.id_doenca = l.doenca_id_doenca AND h.id_pessoa = l.pessoa_id_pessoa");
        System.out.println(rs);

    } catch (SQLException e) {
        e.printStackTrace();
    }

%>

    <tr>
        <th>Nome</th>
        <th>Região</th>
        <th>Estado Civil</th>
        <th>Idade</th>
        <th>Registro de Enfermidade</th>
        <th>Enfermidade</th>
    </tr>

    <% while (rs.next()) { %>
    <tr>
        <td><%= rs.getString("NOME") %></td>


        <td><%= rs.getString("NOME_REGIAO") %></td>

        <td><% if (rs.getString("PESSOA_ID_PESSOA") != null) {%>
            <%= "Casado" %>
            <%} else if (rs.getString("PESSOA_ID_PESSOA") == null){%>
                <%= "Solteira" %>
            <%}%></td>
        <%--Lógica para pegar a idade--%>

        <%
            Date dataNascimento = rs.getDate("NASCIMENTO");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            String dataFormatadaString = simpleDateFormat.format(dataNascimento);
            Integer dataFormatadaInt = Integer.parseInt(dataFormatadaString);
            Date date = new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int year = calendar.get(Calendar.YEAR);
            idade =  year - dataFormatadaInt;
            System.out.println(idade);
        %>

        <td><%=idade%></td>

        <td><%=rs.getDate("DATA_REGISTRO_DOENCA")%></td>
        <td><%=rs.getString("NOME_DOENCA")%></td>


    </tr>
    <% } %>




