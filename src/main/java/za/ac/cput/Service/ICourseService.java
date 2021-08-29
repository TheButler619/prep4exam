package za.ac.cput.Service;

import za.ac.cput.Entity.Course;
import java.util.Set;

public interface ICourseService extends IService<Course, String> {
    Set<Course> getAll();
}
