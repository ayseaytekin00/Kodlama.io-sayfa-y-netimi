package dataAccess.jdbcDB;

import dataAccess.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " isimli kurs , jdbc veritabanı ile eklendi.");

	}

	@Override
	public void delete(int id) {
		System.out.println(id + " id'li kurs silindi.");

	}

}
