<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>

<footer class="footer">
    <div class="container">
        <p class = "text-muted"><%= new SimpleDateFormat("yyyy").format(new Date()) %> - Spring Application</p>
    </div>
</footer>