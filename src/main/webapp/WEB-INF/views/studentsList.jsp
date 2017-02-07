<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<div class="row">

    <div class="col-sm-8">
        <form action="addStudent" method="GET">
            <button type="submit" class="btn btn-success">Add New Student</button>
        </form>
<table class="table table-hover">
    <thead>
    <tr>
        <th>Student ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Student Barcode#</th>
        <th>Action</th>
    </tr>

    </thead>
    <c:forEach items="${students}" var="student">
    <tr>
        <td>${student.studentID}</td>
        <td>${student.firstName}</td>
        <td>${student.lastName}</td>
        <td>${student.barCode}</td>
        <td>
            <form action="editStudent/${student.id}" method="GET">
                <button type="submit" class="btn btn-primary">Edit</button>
                <button type="button" class="btn btn-danger">Delete</button>
            </form>



        </td>

    </tr>

    </c:forEach>

</table>
    </div>
</div>
<%@include file="/WEB-INF/views/template/footer.jsp"%>