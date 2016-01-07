<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <form class="form-inline" name="home" method="post">
                <div class="form-group col-md-4">
                    <label for="location" class="control-label">Wybierz miasto</label>
                    <input type="text" name="city" class="form-control" placeholder="eg. Warszawa" id="location"
                    onchange="enableSelect();" onkeyup="this.onchange();" onpaste="this.onchange();" oninput="this.onchange();"/>
                </div>
                <div class="form-group col-md-4">
                    <label for="restaurant" class="control-label">Wybierz ulice</label>
                    <input class="form-control" name="street" id="street" disabled="true"></select>
                </div>
                <div class="form-group col-md-8">
                    <button type="submit" class="btn btn-primary btn-block">Submit</button>
                </div>
        </form>

    </tiles:putAttribute>
</tiles:insertDefinition>

<script>
$(document).ready(function() {
var availableTags = [
      "Warszawa",
      "Krakow",
      "Wroclaw",
      "Lublin",
      "Radom",
      "Poznan",
      "Katowice",
      "Gdansk",
      "Lodz",
      "Szczecin"
    ];
    $( "#location" ).autocomplete({
      source: availableTags
    });
});

var enableSelect = function (){
    $("#street").prop("disabled", false);
}

var disableSelect = function (){
    $("#street").prop("disabled", true);
}

</script>