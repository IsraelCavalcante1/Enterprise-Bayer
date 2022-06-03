<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pt-Br">

<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <title>HealthCare - Bayer</title>
    <link href="./resources/css/custom.css" rel="stylesheet"/>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet"/>
    <link href="./resources/css/styles.css" rel="stylesheet"/>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
</head>

<body class="sb-nav-fixed">
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <!-- Barra de navegação-->

    <a class="logo-bayer" href="index.html"> <img
            src="./resources/bayer-logo-73D68B4F29-seeklogo.com-removebg-preview.png" alt="Logo" height="40px"
            width="40px"></a>
    <span class="bayer-text-logo">Bayer - HealthCare</span>
    <!-- Barra lateral-->
    <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i
            class="fas fa-bars"></i></button>
    <!-- Pesquisa barra de navegação-->
    <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
        <div class="input-group">
            <input class="form-control" type="text" placeholder="Pesquisar por..." aria-label="Pesquisar por..."
                   aria-describedby="btnNavbarSearch"/>
            <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
        </div>
    </form>
    <!-- Barra de navegação -perfil -->
    <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown"
               aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="#!">Configurações</a></li>
                <li><a class="dropdown-item" href="#!">Atividade</a></li>
                <li>
                    <hr class="dropdown-divider"/>
                </li>
                <li><a class="dropdown-item" href="#!">Sair</a></li>
            </ul>
        </li>
    </ul>
</nav>
<div id="layoutSidenav">
    <div id="layoutSidenav_nav">
        <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
            <div class="sb-sidenav-menu">
                <div class="nav">
                    <!-- Barra menu lateral - itens-->
                    <div class="sb-sidenav-menu-heading">Início</div>
                    <a class="nav-link" href="index.html">
                        <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                        Dashboard
                    </a>

                    <div class="collapse" id="collapsePages" aria-labelledby="headingTwo"
                         data-bs-parent="#sidenavAccordion">
                        <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
                               data-bs-target="#pagesCollapseAuth" aria-expanded="false"
                               aria-controls="pagesCollapseAuth">
                                Authentication
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                        </nav>

                    </div>
                    <div class="sb-sidenav-menu-heading">Gráficos</div>
                    <a class="nav-link" href="charts.html">
                        <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                        Gráficos
                    </a>
                </div>
            </div>

            <!-- Rodapé-->
            <div class="sb-sidenav-footer">
                <div class="small">Logado como Admin:</div>
                Luizão Bastos
            </div>
        </nav>
    </div>

    <div id="layoutSidenav_content">
        <main>
            <!-- Conteúdo-->
            <div class="container-fluid px-10">
                <h1 class="dashboard-text">Dashboard</h1>
                <ol class="breadcrumb mb-20">
                    <li class="breadcrumb-item active"></li>
                    Visualização dos dados</li>
                </ol>

                <!-- Cards-->
                <div class="row">
                    <div class="col-xl-2 col-md-5">
                        <div class="card text-white mb-4">
                            <div class="card-body bg_card__norte">Região Norte</div>
                            <div class=" d-flex align-items-center justify-content-between">

                            </div>
                        </div>
                    </div>
                    <div class="col-xl-2 col-md-5">
                        <div class="card text-white mb-4">
                            <div class="card-body bg_card__nordeste">Região Nordeste</div>
                            <div class=" d-flex align-items-center justify-content-between">
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-2 col-md-5">
                        <div class="card text-white mb-4">
                            <div class="card-body bg_card__centro-oeste">Região Centro-Oeste</div>
                            <div class="d-flex align-items-center justify-content-between">
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-2 col-md-5">
                        <div class="card text-white mb-4">
                            <div class="card-body bg_card__sudeste">Região Sudeste</div>
                            <div class="d-flex align-items-center justify-content-between">
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-2 col-md-5">
                        <div class="card text-white mb-4">
                            <div class="card-body bg_card__sul">Região Sul</div>
                            <div class=" d-flex align-items-center justify-content-between">
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Gráficos-->
                <div class="row">
                    <div class="col-xl-6">
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-chart-area me-1"></i>
                                Gráfico Geral das Regiões
                            </div>
                            <div class="card-body">
                                <canvas id="myAreaChart" width="100%" height="40"></canvas>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-6">
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-chart-bar me-1"></i>
                                Gráfico do Aumento das Doenças
                            </div>
                            <div class="card-body">
                                <canvas id="myBarChart" width="100%" height="40"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card mb-4">
                    <div class="card-header">
                        <i class="fas fa-table me-1"></i>
                        Tabela
                    </div>
                    <div class="card-body">
                        <table id="datatablesSimple">
                            <thead>
                            <tr>
                                <th>Nome</th>
                                <th>Região</th>
                                <th>Estado Civil</th>
                                <th>Idade</th>
                                <th>Registro de Enfermidade</th>
                                <th>Enfermidade</th>
                            </tr>

                            </thead>
                            <%--                            <% while (rs.next()) { %>--%>
                            <tr>
                                <td>
                                    <%--                                    <%= rs.getString("NOME") %>--%>
                                </td>


                                <td>
                                    <%--                                    <%= rs.getString("NOME_REGIAO") %>--%>
                                </td>

                                <td>
                                    <%--                                    <% if (rs.getString("PESSOA_ID_PESSOA") != null) {%>--%>
                                    <%--                                    <%= "Casado" %>--%>
                                    <%--                                    <%} else if (rs.getString("PESSOA_ID_PESSOA") == null) {%>--%>
                                    <%--                                    <%= "Solteira" %>--%>
                                    <%--                                    <%}%>--%>
                                </td>
                                <%--Lógica para pegar a idade--%>

                                <%--                                <%--%>
                                <%--                                    Date dataNascimento = rs.getDate("NASCIMENTO");--%>
                                <%--                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");--%>
                                <%--                                    String dataFormatadaString = simpleDateFormat.format(dataNascimento);--%>
                                <%--                                    Integer dataFormatadaInt = Integer.parseInt(dataFormatadaString);--%>
                                <%--                                    Date date = new Date();--%>
                                <%--                                    Calendar calendar = new GregorianCalendar();--%>
                                <%--                                    calendar.setTime(date);--%>
                                <%--                                    int year = calendar.get(Calendar.YEAR);--%>
                                <%--                                    idade = year - dataFormatadaInt;--%>
                                <%--                                    System.out.println(idade);--%>
                                <%--                                %>--%>

                                <td>
                                    <%--                                    <%=idade%>--%>
                                </td>

                                <td>
                                    <%--                                    <%=rs.getDate("DATA_REGISTRO_DOENCA")%>--%>
                                </td>
                                <td>
                                    <%--                                    <%=rs.getString("NOME_DOENCA")%>--%>
                                </td>

                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </main>
        <footer class="py-4 bg-light mt-auto">
            <div class="container-fluid px-4">
                <div class="d-flex align-items-center justify-content-between small">
                    <div class="text-muted">Copyright &copy; Baixa-Latência 2022</div>
                    <div>
                        <a href="#">Privacidade</a>
                        &middot;
                        <a href="#">Termos &amp; Condições</a>
                    </div>
                </div>
            </div>
        </footer>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="./resources/js/scripts.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="./resources/assets/demo/chart-area-demo.js"></script>
<script src="./resources/assets/demo/chart-bar-demo.js"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
<script src="./resources/js/datatables-simple-demo.js"></script>
</body>

</html>
