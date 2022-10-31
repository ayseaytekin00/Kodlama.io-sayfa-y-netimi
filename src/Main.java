import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.loglama.FileLogger;
import core.loglama.Logger;
import core.loglama.MailLogger;
import dataAccess.EducatorDao;
import dataAccess.hibernateDB.HibernateCategoryDao;
import dataAccess.hibernateDB.HibernateCourseDao;
import dataAccess.hibernateDB.HibernateEducatorDao;
import dataAccess.jdbcDB.JdbcCategoryDao;
import entities.Category;
import entities.Course;
import entities.Educator;

public class Main {

	public static void main(String[] args) {
		// business: iş kuralları (ürün fiyatı 10 dan küçük olamaz .)
		// dataaccess: verilerin bulundugu yerle(DB,veritabanı) bağlantı kurmamızı
		// sağlıyo
		// entities : DB'deki tabloların karşılığı,

		// jdbc hem de hibernate

		Category category1 = new Category(1, "Backend");
		Category category2 = new Category(2, "Frontend");

		Logger[] loggers = { new MailLogger(), new FileLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.CategoryAdd(category1);
		categoryManager.CategoryAdd(category2);
		categoryManager.CategoryDelete(2);

		Course course1 = new Course(1, 1, 1, "Java", 10);

		Course course2 = new Course(2, 2, 2, "C#", 20);

		Educator educator1 = new Educator(1, "Engin", "Demirog", 18);

		Educator educator2= new Educator (2,"smtcoder","Ayse",20);
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.CourseAdd(course1);
		courseManager.CourseAdd(course2);
		courseManager.CourseDelete(2);
		
		EducatorManager educatorManager=new EducatorManager(new HibernateEducatorDao(), loggers);
		educatorManager.EducatorAdd(educator1);
		educatorManager.EducatorAdd(educator2);
		educatorManager.EducatorDelete(2);;
	}

}
