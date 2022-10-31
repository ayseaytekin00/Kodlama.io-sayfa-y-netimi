package business;

import core.loglama.Logger;
import dataAccess.EducatorDao;
import entities.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private Logger[] logger;

	public EducatorManager(EducatorDao educatorDao, Logger[] logger) {
		super();
		this.educatorDao = educatorDao;
		this.logger = logger;
	}

	public void EducatorAdd(Educator educator) {
		educatorDao.add(educator);

		for (Logger logger : logger) {
			logger.log(educator.getFirstName() + " isimli egitmen eklendi.");
		}

	}

	public void EducatorDelete(int id) {
		educatorDao.delete(id);

		for (Logger logger : logger) {
			logger.log(id + " id'li egitmen silindi .");
		}
	}

}
