<%-- 
    Document   : carportSlope
    Created on : Apr 24, 2019, 2:10:31 PM
    Author     : stein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='header.jsp'></jsp:include> 
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Carport med rejst tag</title>
            <script>
                var url = window.location;
                var query_string = url.search;
                var search_params = new URLSearchParams(query_string);
                var error = search_params.get('error');
                if (error === "true") {
                    alert("Længden på redskabsrum er forlangt i forhold til selve carporten");
                }
            </script>
        </head>
        <body>
            <div class="xhtml-string" style="margin-left: 15px;">
                <h3><img style="float: right; margin-left: 10px;" alt="" src="img/slope.gif" height="87" width="165" class="img-responsive">Carport med rejst tag</h3>
                <p><span>Forskellige tagmaterialer kan vælges til carporte med rejst tag</span></p>
                <p>Standardbyggevejledning medfølger ved bestilling.</p>
                <p><strong>Udfyld alle felter og klik "Udregn pris & tilføj til kurv"</strong><br></p>
            </div>
            <div>
                <div class="formbuilder-block">
                    <div class="row">
                        <div class="col-md-12" data-form-table-to-div="">
                            <div id="table" class="form-horizontal col-md-12 col-xs-12">
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12">
                                        <span>
                                            Ønskede carport mål:
                                        </span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12">
                                        <label title="Carport bredde">
                                            Carport bredde
                                        </label>
                                        <form action ="FrontController" method = "POST">
                                            <select class="form-control" name="width" title="Carport bredde"><option selected="selected" value="">Vælg bredde</option>
                                                <option value="240">240 cm</option>
                                                <option value="270">270 cm</option>
                                                <option value="300">300 cm</option>
                                                <option value="330">330 cm</option>
                                                <option value="360">360 cm</option>
                                                <option value="390">390 cm</option>
                                                <option value="420">420 cm</option>
                                                <option value="450">450 cm</option>
                                                <option value="480">480 cm</option>
                                                <option value="510">510 cm</option>
                                                <option value="540">540 cm</option>
                                                <option value="570">570 cm</option>
                                                <option value="600">600 cm</option>
                                                <option value="630">630 cm</option>
                                                <option value="660">660 cm</option>
                                                <option value="690">690 cm</option>
                                                <option value="720">720 cm</option>
                                                <option value="750">750 cm</option>
                                            </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12">
                                        <label title="Carport længde">
                                            Carport længde
                                        </label>
                                        <select class="form-control" name="length" title="Carport længde"><option selected="selected" value="">Vælg længde</option>
                                            <option value="240">240 cm</option>
                                            <option value="270">270 cm</option>
                                            <option value="300">300 cm</option>
                                            <option value="330">330 cm</option>
                                            <option value="360">360 cm</option>
                                            <option value="390">390 cm</option>
                                            <option value="420">420 cm</option>
                                            <option value="450">450 cm</option>
                                            <option value="480">480 cm</option>
                                            <option value="510">510 cm</option>
                                            <option value="540">540 cm</option>
                                            <option value="570">570 cm</option>
                                            <option value="600">600 cm</option>
                                            <option value="630">630 cm</option>
                                            <option value="660">660 cm</option>
                                            <option value="690">690 cm</option>
                                            <option value="720">720 cm</option>
                                            <option value="750">750 cm</option>
                                            <option value="780">780 cm</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12">
                                        <label title="Tagtype/farve">
                                            Tag
                                        </label>
                                        <select class="form-control" name="Tag" title="Tagtype/farve"><option selected="selected" value="">Vælg tagtype/farve</option>
                                            <option value="Betontagsten - Rød">Betontagsten - Rød</option>
                                            <option value="Betontagsten - Teglrød">Betontagsten - Teglrød</option>
                                            <option value="Betontagsten - Brun">Betontagsten - Brun</option>
                                            <option value="Betontagsten - Sort">Betontagsten - Sort</option>
                                            <option value="Eternittag B6 - Grå">Eternittag B6 - Grå</option>
                                            <option value="Eternittag B6 - Sort">Eternittag B6 - Sort</option>
                                            <option value="Eternittag B6 - Mokka (brun)">Eternittag B6 - Mokka (brun)</option>
                                            <option value="Eternittag B6 - Rødbrun">Eternittag B6 - Rødbrun</option>
                                            <option value="Eternittag B6 - Teglrød">Eternittag B6 - Teglrød</option>
                                            <option value="Eternittag B7 - Grå">Eternittag B7 - Grå</option>
                                            <option value="Eternittag B7 - Sort">Eternittag B7 - Sort</option>
                                            <option value="Eternittag B7 - Mokka (brun)">Eternittag B7 - Mokka (brun)</option>
                                            <option value="Eternittag B7 - Rødbrun">Eternittag B7 - Rødbrun</option>
                                            <option value="Eternittag B7 - Teglrød">Eternittag B7 - Teglrød</option>
                                            <option value="Eternittag B7 - Rødflammet">Eternittag B7 - Rødflammet</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12"
                                        <label title="Taghældning">
                                            Taghældning
                                        </label>
                                        <select class="form-control" name="Taghaeldning" title="Taghældning"><option value="15">15 grader</option>
                                            <option value="20">20 grader</option>
                                            <option selected="selected" value="25">25 grader</option>
                                            <option value="30">30 grader</option>
                                            <option value="35">35 grader</option>
                                            <option value="40">40 grader</option>
                                            <option value="45">45 grader</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12">
                                        <span>
                                            <b>
                                                Redskabsrum:
                                            </b>
                                            <br>
                                            NB! Der skal beregnes 15 cm tagudhæng på hver side af redskabsrummet*<br>
                                            Bredde på Redskabsrum er samme som carporten.
                                        </span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12">
                                        <label title="Redskabsrum bredde">
                                            Redskabsrum længde
                                        </label>
                                        <select class="form-control" name="shedLength" title="Redskabsrum bredde"><option selected="selected" value="0">Ønsker ikke redskabsrum</option>
                                            <option value="150">150 cm</option>
                                            <option value="180">180 cm</option>
                                            <option value="210">210 cm</option>
                                            <option value="240">240 cm</option>
                                            <option value="270">270 cm</option>
                                            <option value="300">300 cm</option>
                                            <option value="330">330 cm</option>
                                            <option value="360">360 cm</option>
                                            <option value="390">390 cm</option>
                                            <option value="420">420 cm</option>
                                            <option value="450">450 cm</option>
                                            <option value="480">480 cm</option>
                                            <option value="510">510 cm</option>
                                            <option value="540">540 cm</option>
                                            <option value="570">570 cm</option>
                                            <option value="600">600 cm</option>
                                            <option value="630">630 cm</option>
                                            <option value="660">660 cm</option>
                                            <option value="690">690 cm</option>
                                        </select>
                                        <button name="command" value="calculate">Udregn pris & tilføj til kurv</button>
                                        </form>
                                        </form>        </div>
                                </div>
                            </div>
                        </div>
                    <jsp:include page='footer.jsp'></jsp:include>
                    </body>
                    </html>
