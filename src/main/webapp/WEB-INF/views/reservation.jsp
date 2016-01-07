<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

    <div class="container">
        <div class="row">
            <div class='col-sm-6'>
                <div class="form-group">
                    <div class='input-group date' id='datetimepicker'>
                        <input type='text' class="form-control" />
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-calendar"></span>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </div>

    </tiles:putAttribute>
</tiles:insertDefinition>

<script type="text/javascript">
    $(function () {
        $('#datetimepicker').datetimepicker();
    });
</script>