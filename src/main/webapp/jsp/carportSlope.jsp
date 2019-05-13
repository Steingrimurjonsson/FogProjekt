<%-- 
    Document   : carport
    Created on : Apr 24, 2019, 2:10:31 PM
    Author     : stein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
       <head>
      <jsp:include page='header.jsp'></jsp:include> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carport Slope</title>
    </head>
    <body>
<div class="xhtml-string">
	<h3><img style="float: right; margin-left: 10px;" alt="" src="/globalassets/service/quickbyg/quickmrejs.gif" height="87" width="165" class="img-responsive">Quick-Byg tilbud - carport med rejsning</h3>
<p><span>Med et specialudviklet computerprogram kan vi lynhurtigt beregne prisen og udskrive en skitsetegning på en carport indenfor vores standardprogram.</span></p>
<p>Tilbud og skitsetegning fremsendes med post hurtigst muligt.<br>Standardbyggevejledning medfølger ved bestilling.</p>
<p><strong>Udfyld nedenstående omhyggeligt og klik på "Bestil tilbud"</strong><br>Felter markeret * SKAL udfyldes!</p>
</div>
        
        
        <div>

<div class="formbuilder-block">
    <div class="row">
        <div class="col-md-12" data-form-table-to-div="">
            <div id="table" class="form-horizontal col-md-12 col-xs-12">
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            <span>
            Ønsket carport mål:
            </span>
            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            

<label title="Carport bredde" for="Input_1868253726">
    Carport bredde
</label>
<form action ="FrontController" method = "POST">
<select class="form-control" id="Input_1868253726" name="width" title="Carport bredde"><option selected="selected" value="">Vælg bredde</option>
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
<span class="field-validation-valid" data-valmsg-for="Carport_bredde_4a3f359ad4574d27b17b47192d5407c4" data-valmsg-replace="true"></span>

            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            

<label title="Carport længde" for="Input_1868253726">
    Carport længde
</label>
<select class="form-control" id="Input_1868253726" name="length" title="Carport længde"><option selected="selected" value="">Vælg længde</option>
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
<span class="field-validation-valid" data-valmsg-for="Carport_laengde_6479aad50c114c8f890201e753193145" data-valmsg-replace="true"></span>

            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            

<label title="Tagtype/farve" for="Input_1868253726">
    Tag
</label>
<select class="form-control" id="Input_1868253726" name="Tag" title="Tagtype/farve"><option selected="selected" value="">Vælg tagtype/farve</option>
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
<span class="field-validation-valid" data-valmsg-for="Tag_fb8ae7dd620c4aab9b5b21ea3dc5516e" data-valmsg-replace="true"></span>

            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            

<label title="Taghældning" for="Input_1868253726">
    Taghældning
</label>
<select class="form-control" id="Input_1868253726" name="Taghaeldning" title="Taghældning"><option value="15">15 grader</option>
<option value="20">20 grader</option>
<option selected="selected" value="25">25 grader</option>
<option value="30">30 grader</option>
<option value="35">35 grader</option>
<option value="40">40 grader</option>
<option value="45">45 grader</option>
</select>
<span class="field-validation-valid" data-valmsg-for="Taghaeldning_ec1d75fe35ae4bd590f18fb12009ec5c" data-valmsg-replace="true"></span>

            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            <span>
            <b>
            Redskabsrum:
            </b>
            <br>
            NB! Der skal beregnes 15 cm tagudhæng på hver side af redskabsrummet*
            </span>
            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            

<label title="Redskabsrum bredde" for="Input_1868253726">
    Redskabsrum bredde
</label>
<select class="form-control" id="Input_1868253726" name="shedWidth" title="Redskabsrum bredde"><option selected="selected" value="">Ønsker ikke redskabsrum</option>
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
<option value="720">720 cm</option>
</select>
<span class="field-validation-valid" data-valmsg-for="Redskabsrum_bredde_b0d18528d44a45d1b53f0f628e7df179" data-valmsg-replace="true"></span>

            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            

<label title="Redskabsrum bredde" for="Input_1868253726">
    Redskabsrum længde
</label>
<select class="form-control" id="Input_1868253726" name="shedLength" title="Redskabsrum bredde"><option selected="selected" value="">Ønsker ikke redskabsrum</option>
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
  <button name="command" value="calculate">Add to cart</button>
  </form>
            </form>        </div>
    </div>
</div>
</div>
        
        
                    <jsp:include page='footer.jsp'></jsp:include>

    </body>
</html>
