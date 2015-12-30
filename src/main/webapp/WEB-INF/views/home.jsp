<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="jumbotron">
            <div class="container">
                <label for="location">Choose a city</label>
                    <div class="input-group input-group-lg">
                        <input type="text" class="form-control" name="locationName" placeholder="eg.Pipidowek" id="location">
                    </div>
                <label for="restaurant">Choose a restaurant</label>
                    <div class="input-group input-group-lg">
                        <select class="form-control" id="restaurant" disabled="true"></select>
                    <div>
                    <div class="btn btn-primary">Submit</div>
            </div>
        </div>

    </tiles:putAttribute>
</tiles:insertDefinition>