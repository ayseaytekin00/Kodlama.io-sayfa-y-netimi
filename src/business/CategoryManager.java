package business;

import core.loglama.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] logger;

	public CategoryManager(CategoryDao categoryDao, Logger[] logger) {
		super();
		this.categoryDao = categoryDao;
		this.logger = logger;
	}

	public void CategoryAdd(Category category) {
		categoryDao.add(category);

		for (Logger logger : logger) {
			logger.log(category.getName() + " kategorisi eklendi.");
		}
	}

	public void CategoryDelete(int id) {

		categoryDao.delete(id);

		for (Logger logger : logger) {
			logger.log(id + " id'si silindi. ");
		}

	}

}
