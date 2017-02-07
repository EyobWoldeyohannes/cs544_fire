<%@include file="/WEB-INF/views/template/header.jsp"%>
<div class="container">
    <!-- Example row of columns -->
    <div class="panel panel-primary">
        <div class="panel-heading">Add Student</div>
        <div class="panel-body">
    <div class="row">
        <div class="col-sm-6">
            <form action="addStudent" method="POST" >
                <div class="form-group">
                    <label for="id">Student Id:</label>
                    <input type="text" class="form-control" id="id" name="studentID" >
                </div>
                <div class="form-group">
                    <label for="fname">First Name:</label>
                    <input type="text" class="form-control" id="fname" name="firstName" >
                </div>
                <div class="form-group">
                    <label for="lname">Last Name:</label>
                    <input type="text" class="form-control" id="lname" name="lastName" >
                </div>
                <div class="form-group">
                    <label for="bcode">Student Barcode:</label>
                    <input type="text" class="form-control" id="bcode" name="barCode" >
                </div>

                <button type="submit" class="btn btn-default">Add Student</button>
            </form>
        </div>
    </div>


</div>
    </div></div></div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>