<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="jumbotron vertical-center"">
            <div class="container">
                <div class="form-group col-md-4">
                    <label for="location" class="control-label">Choose a city</label>
                    <input type="text" class="form-control" placeholder="eg. Warszawa" id="location" onchange="enableSelect();"
                    onkeyup="this.onchange();" onpaste="this.onchange();" oninput="this.onchange();"/>
                </div>
                <div class="form-group col-md-4">
                    <label for="restaurant" class="control-label">Choose a restaurant</label>
                    <select class="form-control" id="restaurant" disabled="true"></select>
                </div>
                <div class="form-group col-md-8">
                    <button type="submit" class="btn btn-primary btn-block">Submit</button>
                </div>
            </div>
        </div>

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
</script>

<script>
    function enableSelect(){
        $("#restaurant").prop("disabled", false);
    }
</script>