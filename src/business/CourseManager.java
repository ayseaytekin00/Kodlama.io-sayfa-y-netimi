package business;

import core.loglama.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] logger;

	public CourseManager(CourseDao courseDao, Logger[] logger) {
		super();
		this.courseDao = courseDao;
		this.logger = logger;
	}

	public void CourseAdd(Course course) {
		courseDao.add(course);

		for (Logger logger : logger) {
			logger.log(course.getName() + " kursu eklendi.");
		}
	}

	public void CourseDelete(int id) {
		courseDao.delete(id);

		for (Logger logger : logger) {
			logger.log(id + " kursu silindi.");
		}
	}

}
