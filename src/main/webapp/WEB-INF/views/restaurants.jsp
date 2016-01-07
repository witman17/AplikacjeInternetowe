<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
 <h2>Restauracje</h2>

<ul class = "list-group">
   <c:forEach var="restaurant" items="${restaurants}" varStatus="counter">
        <li class = "list-group-item">${restaurant.name}</li>
   </c:forEach>
</ul>

    </tiles:putAttribute>
</tiles:insertDefinition>