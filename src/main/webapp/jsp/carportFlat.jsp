<%-- 
    Document   : carportFlat
    Created on : May 1, 2019, 1:00:06 PM
    Author     : stein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <jsp:include page='header.jsp'></jsp:include> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carport med Fladt Tag</title>
        <script>
            var url = window.location;
            var query_string = url.search;
            var search_params = new URLSearchParams(query_string); 
            var error = search_params.get('error');
            if(error === "true"){
            alert("Længden på redskabsrum er forlangt i forhold til selve carporten");
            }   
        </script>
  
    </head>
    <body>
        <div style="margin-left: 15px;">
 
 
<div class="xhtml-string">
        	<h3><img style="float: right; margin-left: 10px;" alt="" src="img/flat.gif" height="87" width="165" class="img-responsive">Carport med fladt tag</h3>

<p>Carport med fladt tag kommer med plastiktag.</p>
<p>Ved bestilling medfølger standardbyggevejledning.</p>
<p><strong>Udfyld alle felter og klik "Udregn pris & tilføj til kurv"</strong></p>

</div></div>
        <div>

<div class="formbuilder-block" >
    <div class="row">
        <div class="col-md-12">       
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
            

<label title="width">
    Carport Bredde
</label>
<form action ="FrontController" method = "POST">
    <select class="form-control" name="width" title="width">
    <option selected="selected" value="">Vælg bredde</option>
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
            

<label title="length">
    Carport Længde
</label>
<select class="form-control" name="length" title="length" >
<option selected="selected" value="">Vælg længde</option>
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

            </div>
            </div>
            <div class="form-group" style="margin-left: 15px;">
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
            <div class="col-md-12 col-xs-12" >
            

            <div class="form-group"  >
                <div class="col-md-12 col-xs-12" >
            

<label title="Redskabsrum længde">
    Redskabsrum længde
</label>
                    <select class="form-control" name="shedLength" title="Redskabsrum længde" >
<option selected="selected" value="">Ønsker ikke redskabsrum</option>
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

              <button  name="command" value="calculate">Udregn pris & tilføj til kurv</button>
  </form>      </div>
    </div>
</div>
</div>
                    <jsp:include page='footer.jsp'></jsp:include>

    </body>
</html>
