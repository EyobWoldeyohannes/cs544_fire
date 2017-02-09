<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/secureheader.jsp"%>
<div class="container">

    <div class="panel panel-primary">
        <div class="panel-heading">Session List</div>


    <div class="col-sm-12">
        <form action="../csession/add" method="GET">
            <button type="submit" class="btn btn-success">Add Session</button>
        </form>
<table class="table table-hover">
    <thead>
    <tr>
        <th>No.</th>
        <th>Date</th>
        <th>Course Offering</th>

        <th>timeslot</th>

    </tr>

    </thead>
    <c:forEach items="${csessions1}" var="csession">
    <tr>
        <td>${csession.id}</td>
        <td>${csession.date}</td>
        <td>${csession.courseOffering.courseOfferingId}</td>
        <td>${csession.timeslot.abbrv}</td>

    </tr>
    </c:forEach>
    <c:forEach items="${csessions}" var="csession2">
        <tr>
            <td>${csession2.id}</td>
            <td>${csession2.date}</td>
            <td>${csession2.courseOffering.courseOfferingId}</td>
            <td>${csession2.timeslot.abbrv}</td>

        </tr>
    </c:forEach>


</table>
    </div>

</div>
    </div>
<%@include file="/WEB-INF/views/template/footer.jsp"%>