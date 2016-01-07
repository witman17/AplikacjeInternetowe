<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

    <h1>Rezerwacja</h1>

    <div class="panel panel-primary">
      <div class="panel-heading">
        <h3 class="panel-title">Nazwa</h3>
      </div>
      <div class="panel-body">
        <form class="form-horizontal" name="reservation" method="post">
                <div class=>

                </div>
                <div class="form-group">
                  <label for="datetimepicker" class="col-lg-2 control-label">Data</label>
                  <div class="col-lg-10">
                    <div class='input-group date' id='datetimepicker'>
                        <input type='text' class="form-control" />
                          <span class="input-group-addon">
                              <span class="glyphicon glyphicon-calendar"></span>
                          </span>
                    </div>
                  </div>
                </div>
                <div class="form-group">
                  <label for="select" class="col-lg-2 control-label">Miejsca</label>
                  <div class="col-lg-10">
                    <select class="form-control" id="select"></select>
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-lg-10 col-lg-offset-2">
                    <button type="reset" class="btn btn-default">Cancel</button>
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
                </div>
            </form>

      </div>
    </div>

    </tiles:putAttribute>
</tiles:insertDefinition>

<script type="text/javascript" src="webjars/momentjs/2.11.0/moment.js"></script>
<script type="text/javascript" src="webjars/bootstrap-datetimepicker/2.3.5/js/bootstrap-datetimepicker.min.js"></script>

<script type="text/javascript">
    $(function () {
        $('#datetimepicker').datetimepicker();
    });
</script>