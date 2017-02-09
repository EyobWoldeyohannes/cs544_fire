<%@include file="/WEB-INF/views/template/secureheader.jsp"%>
<div class="container">
    <!-- Example row of columns -->
    <div class="panel panel-primary">
        <div class="panel-heading">Edit Course</div>
            <div class="panel-body">

    <div class="row">
        <div class="col-sm-6">
            <form action="../../course/edit/${course.courseId}" method="POST" >
                <div class="form-group">
                    <label for="id">Course Id:</label>
                    <input type="text" class="form-control" id="id" name="courseId" value="${course.courseId}">
                </div>
                <div class="form-group">
                    <label for="cname">Course Name:</label>
                    <input type="text" class="form-control" id="cname" name="coursenName" value="${course.coursenName}">
                </div>
                <div class="form-group">
                    <label for="description">Description:</label>
                    <input type="text" class="form-control" id="description" name="description" value="${course.description}">
                </div>
               <%-- <div class="form-group">
                    <label for="bcode">Student Barcode:</label>
                    <input type="text" class="form-control" id="bcode" name="barCode" value="${student.barCode}">
                </div>--%>

                <button type="submit" class="btn btn-default">Update Course</button>
            </form>
        </div>
    </div>


</div>
</div>
</div>
</div>
<%@include file="/WEB-INF/views/template/footer.jsp"%>
