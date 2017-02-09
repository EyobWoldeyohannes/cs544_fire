<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/secureheader.jsp"%>

<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">Attendance List</div>
        <div class="panel-body">

            <div class="col-sm-12">
                <form action="../student/attendance" method="POST">
                    <div class="form-group">
                        <label for="id">Student Id:</label>
                        <input type="text" class="form-control" id="id" name="studentid" value="${studentid}">
                    </div>
                    <button type="submit" class="btn btn-success">Search Student</button>
                </form>


                <table class="table table-hover table-bordered">
                    <thead>
                    <tr>
                        <th>Student ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Student Barcode#</th>
                    </tr>

                    </thead>
                    <c:forEach items="${students}" var="student">
                        <tr>
                            <td>${student.studentID}</td>
                            <td>${student.firstName}</td>
                            <td>${student.lastName}</td>
                            <td>${student.barCode}</td>

                        </tr>

                    </c:forEach>

                </table>

                <span class="label label-default">Course Offering List</span>
                <table class="table table-hover table-bordered">
                    <thead>
                    <tr>
                        <th>Offering ID</th>
                        <th>Course ID</th>
                        <th>Course Name</th>
                        <th>Start Date</th>
                        <th>End Date</th>
                        <th>View Attendance</th>
                    </tr>

                    </thead>
                    <c:forEach items="${courseOfferings}" var="courseOfferings">
                        <tr>
                            <td>${courseOfferings.courseOfferingId}</td>
                            <td>${courseOfferings.courseid.courseId}</td>
                            <td>${courseOfferings.courseid.coursenName}</td>

                            <td>${courseOfferings.startDate}</td>
                            <td>${courseOfferings.endDate}</td>
                            <td>

                                <form action="../student/attendance" method="POST">
                                    <input type="hidden" name="studentid" value="${studentid}">
                                    <input type="hidden" name="offeringid" value="${courseOfferings.courseOfferingId}">
                                    <button type="submit" class="btn btn-primary">View Attendance</button>
                                </form>
                            </td>

                        </tr>

                    </c:forEach>

                </table>

                <span class="label label-default">Attendance List</span>
                <table class="table table-hover table-bordered">
                    <thead>
                    <tr>
                        <th>Session Date</th>
                        <th>Time Slot</th>
                        <th>Offering ID</th>
                        <th>Absent/Present</th>
                    </tr>

                    </thead>
                    <c:set var="present" value="0" scope="page" />
                    <c:set var="absent" value="0" scope="page" />

                    <c:forEach items="${tempSession}" var="tempsession">
                        <tr>
                            <td>${tempsession.sessiondate}</td>
                            <td>${tempsession.timeslot}</td>
                            <td>${tempsession.offeringid}</td>

                            <td>
                                <c:if test="${tempsession.attendance==true}">
                                <span style="color:green" class="glyphicon glyphicon-ok"></span>
                                   <c:set var="present" value="${present + 1}" scope="page"/>
                                </c:if>
                                <c:if test="${tempsession.attendance==false}">
                                    <c:set var="absent" value="${absent + 1}" scope="page"/>
                                <span style="color:red"  class="glyphicon glyphicon-remove"></span>
                                </c:if>

                            </td>

                        </tr>

                    </c:forEach>

                </table>
            <c:if test="${present!=0 || absent!=0}">
                <h1>Present: ${present}</h1>
                <h1>Absent: ${absent}</h1>
            </c:if>
            </div>
        </div>
    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp"%>