<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
 <h2>Restauracje</h2>

<ul class = "list-group">
   <c:if test="${restaurants == null}">
    <p>Brak restauracji w miescie</p>
   </c:if>
   <c:forEach var="restaurant" items="${restaurants}" varStatus="counter">
        <a href="reservation?id=${restaurant.id}" class="btn btn-default btn-lg btn-block ">
        ${restaurant.name} - ${restaurant.address.city} ${restaurant.address.street}/${restaurant.address.flat}
        </a>
   </c:forEach>
</ul>

    </tiles:putAttribute>
</tiles:insertDefinition>
