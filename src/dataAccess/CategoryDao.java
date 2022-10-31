package dataAccess;

import entities.Category;

public interface CategoryDao {

	void add(Category category);

	void delete(int id);

}
