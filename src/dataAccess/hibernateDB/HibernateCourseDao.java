package dataAccess.hibernateDB;

import dataAccess.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " isimli kurs , hibernate veritabanı ile eklendi.");

	}

	@Override
	public void delete(int id) {
		System.out.println(id + " id'li kurs silindi.");

	}

}
