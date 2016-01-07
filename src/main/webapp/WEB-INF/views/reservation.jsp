<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

    <h1>Rezerwacja</h1>

    <form class="form-horizontal">
        <div class="form-group col-md-4">
            <div class='input-group date' id='datetimepicker'>
                <input type='text' class="form-control" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div>
        <div class="form-group col-md-4">
                <select class="form-control" id="select"></select>
        </div>
        <div class="form-group col-md-4">
            <a class="btn btn-default">Submit</a>
        </div>
    </form>



    </tiles:putAttribute>
</tiles:insertDefinition>

<script type="text/javascript" src="webjars/momentjs/2.11.0/moment.js"></script>
<script type="text/javascript" src="webjars/bootstrap-datetimepicker/2.3.5/js/bootstrap-datetimepicker.min.js"></script>

<script type="text/javascript">
    $(function () {
        $('#datetimepicker').datetimepicker();
    });
</script>