<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-Br">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>HealthCare - Bayer</title>
    <link href="./resources/css/custom.css" rel="stylesheet" />
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="./resources/css/styles.css" rel="stylesheet" />
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

</head>

<body class="sb-nav-fixed">
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <!-- Barra de navegação-->

    <a class="logo-bayer" href="index.html"> <img src="./resources/bayer-logo-73D68B4F29-seeklogo.com-removebg-preview.png" alt="Logo" height="40px" width="40px"></a>
    <span class="bayer-text-logo">Bayer - HealthCare</span>
    <!-- Barra lateral-->
    <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
    <!-- Pesquisa barra de navegação-->
    <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
        <div class="input-group">
            <input class="form-control" type="text" placeholder="Pesquisar por..." aria-label="Pesquisar por..." aria-describedby="btnNavbarSearch" />
            <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
        </div>
    </form>
    <!-- Barra de navegação -perfil -->
    <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="#!">Configurações</a></li>
                <li><a class="dropdown-item" href="#!">Atividade</a></li>
                <li>
                    <hr class="dropdown-divider" />
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

                    <div class="collapse" id="collapsePages" aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
                        <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#pagesCollapseAuth" aria-expanded="false" aria-controls="pagesCollapseAuth">
                                Authentication
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>

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
                    <li class="breadcrumb-item active"></li>Visualização dos dados</li>
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
                            <div class="card-body"><canvas id="myAreaChart" width="100%" height="40"></canvas></div>
                        </div>
                    </div>
                    <div class="col-xl-6">
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-chart-bar me-1"></i>
                                Gráfico do Aumento das Doenças
                            </div>
                            <div class="card-body"><canvas id="myBarChart" width="100%" height="40"></canvas></div>
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
                                <th>Estado civil</th>
                                <th>Idade</th>
                                <th>Registro da enfermidade</th>
                                <th>Enfermidade</th>
                            </tr>
                            </thead>
                            <tfoot>

                            </tfoot>
                            <tbody>
                            <tr>
                                <!-- // nome -->
                                <td>Julia Silva</td>
                                <!-- Nome Região -->
                                <td>Centro Oeste</td>
                                <!-- Estado Civil -->
                                <td>Solteira</td>
                                <!-- Idade -->
                                <td>21</td>
                                <!-- Data da Enfermidade -->
                                <td>22/10/2000</td>
                                <!-- Nome Enfermidade -->
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Vilma Regina</td>
                                <td>Sudeste</td>
                                <td>Casada</td>
                                <td>29</td>
                                <td>10/05/2016</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Milton Cox</td>
                                <td>Sul</td>
                                <td>Casado</td>
                                <td>66</td>
                                <td>08/02/2022</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Kelly Rodrigues</td>
                                <td>Nordeste</td>
                                <td>Solteira</td>
                                <td>39</td>
                                <td>08/10/2015</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Airi Sasaki</td>
                                <td>Sul</td>
                                <td>Casado</td>
                                <td>28</td>
                                <td>04/11/2010</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Brielle Ofnner</td>
                                <td>Norte</td>
                                <td>Solteira</td>
                                <td>22</td>
                                <td>07/12/2010</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Maria Chand</td>
                                <td>Centro Oeste</td>
                                <td>Casada</td>
                                <td>31</td>
                                <td>07/12/2010</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Junior Rodrigues</td>
                                <td>Nordeste</td>
                                <td>Solteiro</td>
                                <td>1</td>
                                <td>11/20/2022</td>
                                <td>Microcefalia</td>
                            </tr>
                            <tr>
                                <td>Clovis De Lucas</td>
                                <td>Sudeste</td>
                                <td>Solteiro</td>
                                <td>39</td>
                                <td>22/06/2012</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Sonya Vanessa</td>
                                <td>Centro-Oeste</td>
                                <td>Casada</td>
                                <td>23</td>
                                <td>30/05/2005</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Jena Gaines</td>
                                <td>Centro-Oeste</td>
                                <td>Solteira</td>
                                <td>30</td>
                                <td>20/10/2020</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Mazuel Flynn</td>
                                <td>Nordeste</td>
                                <td>Solteiro</td>
                                <td>22</td>
                                <td>02/05/2021</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Daiane Mendes</td>
                                <td>Centro-Oeste</td>
                                <td>Casado</td>
                                <td>36</td>
                                <td>01/10/2002</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>João Amazonas</td>
                                <td>Norte</td>
                                <td>Casado</td>
                                <td>43</td>
                                <td>10/10/2008</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Tatyana Fitzpatrick</td>
                                <td>Centro-Oeste</td>
                                <td>Solteiro</td>
                                <td>19</td>
                                <td>2010/03/17</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Michael Silva</td>
                                <td>Sul</td>
                                <td>Casado</td>
                                <td>66</td>
                                <td>20/10/2019</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Paulo Domingues </td>
                                <td>Centro-Oeste</td>
                                <td>Casado</td>
                                <td>64</td>
                                <td>10/05/2016</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Gloria Marta</td>
                                <td>Sul</td>
                                <td>Solteira</td>
                                <td>59</td>
                                <td>29/05/2009</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Matilde Ferreira</td>
                                <td>Nordeste</td>
                                <td>Solteira</td>
                                <td>41</td>
                                <td>21/022012</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Dai Rios</td>
                                <td>Centro-Oeste</td>
                                <td>Casada</td>
                                <td>34</td>
                                <td>26/06/2012</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Vanessa Rios</td>
                                <td>Centro-Oeste</td>
                                <td>Solteira</td>
                                <td>2</td>
                                <td>09/03/2021</td>
                                <td>Microcefalia</td>
                            </tr>
                            <tr>
                                <td>Yuri Berry</td>
                                <td>Sul</td>
                                <td>Casado</td>
                                <td>40</td>
                                <td>21/20/2009</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Caesar Vance</td>
                                <td>Nordeste</td>
                                <td>Solteiro</td>
                                <td>21</td>
                                <td>19/22/2021</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Doris Veneza</td>
                                <td>Nordeste</td>
                                <td>Solteira</td>
                                <td>22</td>
                                <td>10/10/2016</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Angelica Ramos</td>
                                <td>Nordeste</td>
                                <td>Casada</td>
                                <td>47</td>
                                <td>09/10/2019</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Joyce Silva</td>
                                <td>Sudeste</td>
                                <td>Solteira</td>
                                <td>42</td>
                                <td>22/10/2016</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Jennifer Manata</td>
                                <td>Sudeste</td>
                                <td>Casada</td>
                                <td>28</td>
                                <td>14/10/2018</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Mauro Rodigues</td>
                                <td>Sudeste</td>
                                <td>Casado</td>
                                <td>28</td>
                                <td>12/11/2018</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Rogério Mendes</td>
                                <td>Sul</td>
                                <td>Casado</td>
                                <td>29</td>
                                <td>8/03/2017</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Junior Menezes</td>
                                <td>Norte</td>
                                <td>Casado</td>
                                <td>28</td>
                                <td>19/10/2016</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Vitor Manata</td>
                                <td>Sudeste</td>
                                <td>Solteiro</td>
                                <td>81</td>
                                <td>12/12/2020</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Alex Dantas</td>
                                <td>Norte</td>
                                <td>Casado</td>
                                <td>21</td>
                                <td>09/02/2018</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Matheus Matson</td>
                                <td>Norte</td>
                                <td>Solteiro</td>
                                <td>21</td>
                                <td>13/10/2014</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Vilcker Andrade</td>
                                <td>Sudeste</td>
                                <td>Casado</td>
                                <td>69</td>
                                <td>16/03/2016</td>
                                <td>Malária</td>
                            </tr>
                            <tr>
                                <td>Marta Vasconcelos</td>
                                <td>Norte</td>
                                <td>Solteira</td>
                                <td>46</td>
                                <td>09/10/2014</td>
                                <td>Zika</td>
                            </tr>
                            <tr>
                                <td>Nayara Guimarães</td>
                                <td>Sul</td>
                                <td>Solteira</td>
                                <td>23</td>
                                <td>21/07/2013</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Diogo Fernandes</td>
                                <td>Sudeste</td>
                                <td>Casado</td>
                                <td>51</td>
                                <td>15/01/2017</td>
                                <td>Dengue</td>
                            </tr>
                            <tr>
                                <td>Juliana Guerra</td>
                                <td>Nordeste</td>
                                <td>Solteira</td>
                                <td>37</td>
                                <td>17/05/2015</td>
                                <td>Malária</td>
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="./resources/js/scripts.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="./resources/assets/demo/chart-area-demo.js"></script>
<script src="./resources/assets/demo/chart-bar-demo.js"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
<script src="./resources/js/datatables-simple-demo.js"></script>
</body>

</html>
