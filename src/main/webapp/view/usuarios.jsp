<%-- 
    Document   : menu
    Created on : 2/05/2018, 06:36:48 PM
    Author     : giovanny
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <body>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">
                    <form method="post"
                          action="${pageContext.servletContext.contextPath}/UsuariosServlet">
                        <div class="form-row">
                            <div class="col">
                                <input name="txtdocumento" type="text" 
                                       class="form-control" 
                                       placeholder="Documento">
                            </div>
                            <div class="col"></div>                           
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtnombres" type="text" 
                                       class="form-control" 
                                       placeholder="Nombres">
                            </div>
                            <div class="col">
                                <input name="txtapellidos" type="text" 
                                       class="form-control" 
                                       placeholder="Apellidos">
                            </div>                           
                        </div>  
                        
                        <div class="form-row">
                            <div class="col">
                                <input name="txtmontoprestar" type="number" 
                                       class="form-control" 
                                       placeholder="Monto a prestar">
                            </div>                             
                            <div class="col">
                                <select name="txttipotrabajador" id="inputState" 
                                        class="form-control">
                                    <option value="Independiente" selected>Independiente</option>
                                    <option value="Dependiente" >Dependiente</option>
                                </select>
                            </div>
                        </div>    
                        <div class="form-row">
                            <div class="col">
                                <select name="txttipocredito" id="inputState" 
                                        class="form-control">
                                    <option value="vivienda" selected>vivienda</option>
                                    <option value="estudio">estudio</option>
                                    <option value="libre inversión">libre inversión</option>
                                </select>
                            </div>                           
                            <div class="col">
                                <select name="txttrabajacompania" id="inputState" 
                                        class="form-control">
                                    <option value="si" selected>Si</option>
                                    <option value="no" >No</option>
                                </select>
                            </div>
                                  
                            
                        </div>  
                        <div class="form-row">
                            <div class="col">
                                <button name="accion" value="crear" type="submit" 
                                        class="btn btn-primary">
                                    Registrar
                                </button>
                            </div>
                            <div class="col">
                              <!--  <button name="accion" value="listar" type="submit" 
                                        class="btn btn-primary">
                                    Listar Usuarios
                                </button> -->
                            </div>                         
                    </form>
                </div>
            </div>
        </main>

        <footer class="container">
            <p>&copy; Company 2017-2018</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    </body>
</html>
