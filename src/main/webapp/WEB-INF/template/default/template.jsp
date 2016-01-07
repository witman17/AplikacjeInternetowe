<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <link rel='stylesheet' href='webjars/bootstrap/3.1.1/css/bootstrap.min.css'>
    <link rel='stylesheet' href='webjars/jquery-ui/1.9.2/css/smoothness/jquery-ui-1.9.2.custom.min.css'>
    <link rel='stylesheet' href='webjars/bootstrap-datetimepicker/2.3.5/css/bootstrap-datetimepicker.css'>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>AppName</title>

    <style>
        body {
            padding-top: 60px;
            padding-bottom: 42px;
        }
    </style>
</head>
<body>
    <div class="container">
        <tiles:insertAttribute name="navbar" />
        <div class="container body-content">
            <tiles:insertAttribute name="body" />
        </div>
    </div>

    <tiles:insertAttribute name="footer" />

    <tiles:insertAttribute name="scripts" />
</body>
</html>
