package dataAccess;

import entities.Educator;

public interface EducatorDao {
	void add(Educator educator);

	void delete(int id);
}
