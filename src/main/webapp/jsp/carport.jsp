<%-- 
    Document   : carport
    Created on : Apr 24, 2019, 2:10:31 PM
    Author     : stein
//TODO. create input fields from user to customize carport measurements
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customize your own carport!</title>
    </head>
    <body>
        <h1>Customize your own carport!</h1>
        <label title="Carport bredde" for="Input_858750582">
    Carport bredde
</label>
        <form action ="../FrontController" method = "POST">
<select class="form-control" id="Input_858750582" name="width" title="Carport bredde"><option selected="selected" value="">Vælg bredde</option>
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
<span class="field-validation-valid" data-valmsg-for="Carport_bredde_e3c5db680d0f49eeb6d36a4ac402c7b8" data-valmsg-replace="true"></span>

            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            

<label title="Carport længde" for="Input_507378691">
    Carport længde
</label>
<select class="form-control" id="Input_507378691" name="length" title="Carport længde"><option selected="selected" value="">Vælg længde</option>
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

<label title="Tag" for="Input_507378691">
    Tag
</label>
<select class="form-control" id="Input_507378691" name="roof" title="Tag"><option selected="selected" value="Plasttrapezplader">Plasttrapezplader</option>
<option selected="selected" value="Plasttrapezplader">Plasttrapezplader</option>
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
            NB! Der skal beregnes 15 cm tagudhæng på hver side af redskabsrummet*
            </span>
            </div>
            </div>
            <div class="form-group">
            <div class="col-md-12 col-xs-12">
            

<label title="Redskabsrum bredde" for="Input_507378691">
    Redskabsrum bredde
</label>
<select class="form-control" id="Input_507378691" name="shedWidth" title="Redskabsrum bredde"><option selected="selected" value="0">Ønsker ikke redskabsrum</option>
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



<label title="Redskabsrum længde" for="Input_507378691">
    Redskabsrum længde
</label>
<select class="form-control" id="Input_507378691" name="shedLength" title="Redskabsrum længde"><option selected="selected" value="0">Ønsker ikke redskabsrum</option>
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
                <button name="command" value="calculate"> Pindsvinet of Doom</button>
  </form>
    </body>
    
</html>