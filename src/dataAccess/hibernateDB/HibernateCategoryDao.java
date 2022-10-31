package dataAccess.hibernateDB;

import dataAccess.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " kategori hibernate veritabanı ile eklendi. ");

	}

	@Override
	public void delete(int id) {
		System.out.println(id + " id'li hibernate ile silindi. ");

	}

}
