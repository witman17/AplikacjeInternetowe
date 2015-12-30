<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
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

    <script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>
