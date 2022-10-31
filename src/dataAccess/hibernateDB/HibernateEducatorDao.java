package dataAccess.hibernateDB;

import dataAccess.EducatorDao;
import entities.Educator;

public class HibernateEducatorDao implements EducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println(educator.getFirstName() + " isimli egitmen, hibernate veritabanı ile eklendi.");

	}

	@Override
	public void delete(int id) {
		System.out.println(id + " id'li eğitmen silindi.");

	}

}
