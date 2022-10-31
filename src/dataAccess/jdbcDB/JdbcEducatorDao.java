package dataAccess.jdbcDB;

import dataAccess.EducatorDao;
import entities.Educator;

public class JdbcEducatorDao implements EducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println(educator.getFirstName() + " isimli egitmen , Jdbc veritabaı ile eklendi.");

	}

	@Override
	public void delete(int id) {
		System.out.println(id + " id'li egitmen silindi.");

	}

}
