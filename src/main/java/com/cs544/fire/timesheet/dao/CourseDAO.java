package com.cs544.fire.timesheet.dao;

        import com.cs544.fire.timesheet.model.Course;
        import org.springframework.stereotype.Controller;
        import org.springframework.stereotype.Repository;
        import org.springframework.web.bind.annotation.RequestMapping;

        import java.util.List;

/**
 * Created by Abel on 2/5/2017.
 */


public interface CourseDAO extends GenericDAO<Course> {

        List<Course> getAll();
        Course get(String id);


}


