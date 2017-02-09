<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/secureheader.jsp"%>
<div class="container">
    <!-- Example row of columns -->
    <div class="panel panel-primary">
        <div class="panel-heading">Add Course</div>
        <div class="panel-body">
    <div class="row">
        <div class="col-sm-6">
            <form:form commandName="course" action="${pageContext.request.contextPath}/course/add" method="POST">
                <div class="form-group">
                    <label for="id">Course Id:</label><form:errors path="courseId" cssClass="errorLable"/>
                    <form:input path="courseId" type="text" class="form-control" id="id" name="courseId" />

                </div>
                <div class="form-group">
                    <label for="cname">Course Name:</label><form:errors path="coursenName" cssClass="errorLable"/>
                    <form:input path="coursenName" type="text" class="form-control" id="cname" name="coursenName" />
                </div>
                <div class="form-group">
                    <label for="description">Course Description:</label><form:errors path="description" cssClass="errorLable"/>
                    <form:input  path ="description" type="text"   class="form-control" id="description" name="description" />
                </div>
                <%--<div class="form-group">
                    <label for="bcode">Student Barcode:</label><form:errors path="barCode" cssClass="errorLable"/>
                    <form:input path="barCode" type="text" class="form-control" id="bcode" name="barCode" />
                </div>--%>

                <button type="submit" class="btn btn-default">Add Course</button>
            </form:form>
        </div>
    </div>


</div>
    </div></div></div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>