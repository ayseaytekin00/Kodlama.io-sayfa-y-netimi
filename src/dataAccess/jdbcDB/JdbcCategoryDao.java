package dataAccess.jdbcDB;

import dataAccess.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " isimli kategori jdbc veritabanı ile eklendi. ");
	}

	@Override
	public void delete(int id) {
		System.out.println(id + "id'li kategori jdbc ile silindi. ");

	}

}
