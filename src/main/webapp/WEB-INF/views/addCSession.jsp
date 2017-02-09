<%@include file="/WEB-INF/views/template/secureheader.jsp"%>
<div class="container">
    <!-- Example row of columns -->
    <div class="panel panel-primary">
        <div class="panel-heading">ADD CSession</div>
        <div class="panel-body">
    <div class="row">
        <div class="col-sm-6">
            <form action="../csession/add" method="POST" >

                <div class="form-group">
                    <label for="fname">Start Date:</label>
                    <input type="text" class="form-control" id="fname" name="startdate" >
                </div>
                <div class="form-group">
                    <label for="lname">End Date:</label>
                    <input type="text" class="form-control" id="lname" name="enddate" >
                </div>
                <div class="form-group">
                    <label for="bcode">Offering Id:</label>
                    <input type="text" class="form-control" id="bcode" name="CourseOfferingId" >
                </div>

                <button type="submit" class="btn btn-default">Add CSession</button>
            </form>
        </div>
    </div>


</div>
    </div></div></div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>