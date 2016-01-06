<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

<h2>Rejestracja</h2>
<form class="form-horizontal well" data-toggle="validator" role="form" name="user" method="post">
     <div class="form-group">
      <label for="inputName" class="col-lg-2 control-label">Imie</label>
      <div class="col-lg-10">
        <input type="text" name="name" class="form-control" id="inputName" placeholder="Imie"
        required
        data-fv-notempty-message="To pole jest wymagane.">
      </div>
      <div class="help-block with-errors"></div>
    </div>
    <div class="form-group">
          <label for="inputSurname" class="col-lg-2 control-label">Nazwisko</label>
          <div class="col-lg-10">
            <input type="text" name="surname" class="form-control" id="inputSurname" placeholder="Nazwisko"
            required
            data-fv-notempty-message="To pole jest wymagane.">
          </div>
          <div class="help-block with-errors"></div>
        </div>
    <div class="form-group">
      <label for="inputEmail" class="col-lg-2 control-label">Email</label>
      <div class="col-lg-10">
        <input type="email" name="email" class="form-control" id="inputEmail" placeholder="Email"
        required
        data-fv-notempty-message="To pole jest wymagane.">
      </div>
      <div class="help-block with-errors"></div>
    </div>
    <div class="form-group">
      <label for="inputPassword" class="col-lg-2 control-label">Haslo</label>
      <div class="col-lg-10">
        <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password"
        required
        data-fv-notempty-message="To pole jest wymagane.">
      </div>
      <div class="help-block with-errors"></div>
    </div>
    <div class="form-group">
      <label for="inputPassword" class="col-lg-2 control-label">Potwierdz Haslo</label>
      <div class="col-lg-10">
        <input type="password" class="form-control" id="inputPasswordConfirm" data-match="#inputPassword"
        data-match-error="hasla nie pokrywaja sie" placeholder="Password"
        required data-fv-notempty-message="To pole jest wymagane.">
      </div>
      <div class="help-block with-errors"></div>
    </div>
    <div class="form-group">
          <label for="inputPhone" class="col-lg-2 control-label">Numer telefonu</label>
          <div class="col-lg-10">
            <input type="number" name="phone" class="form-control bfh-phone" data-format="ddd ddd ddd" id="inputPhone" placeholder="">
          </div>
        </div>
    <div class="form-group">
      <div class="col-lg-10 col-lg-offset-2">
        <button type="reset" class="btn btn-default">Reset</button>
        <button type="submit" class="btn btn-primary">Rejestruj</button>
      </div>
    </div>
  </form>

    </tiles:putAttribute>
</tiles:insertDefinition>