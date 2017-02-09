<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/secureheader.jsp"%>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">Course List</div>
        <div class="panel-body">

    <div class="col-sm-12">
        <form action="../course/add" method="GET">
            <button type="submit" class="btn btn-success">Add New Course</button>
        </form>
<table class="table table-hover">
    <thead>
    <tr>
        <th>Course Id</th>
        <th>Course Name</th>
        <th>Description </th>
        <th>Action</th>
    </tr>

    </thead>
    <c:forEach items="${courses}" var="course">
    <tr>
        <td>${course.courseId}</td>
        <td>${course.coursenName}</td>
        <td>${course.description}</td>
        <td>
            <form action="../course/edit/${course.courseId}" method="GET">
                <button type="submit" class="btn btn-primary">Edit</button>
                <%--button type="button" class="btn btn-danger">Delete</button>--%>
            </form>

            <form action="../course/delete/${course.courseId}" method="GET">
                <button type="submit" class="btn btn-danger">Delete</button>
            </form


        </td>

    </tr>

    </c:forEach>

</table>
    </div>
</div>
    </div>
</div>
<%@include file="/WEB-INF/views/template/footer.jsp"%>