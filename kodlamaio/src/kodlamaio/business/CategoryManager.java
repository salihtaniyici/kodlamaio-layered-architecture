package kodlamaio.business;

import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;
import kodlamaio.logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		
		if(categoryDao.check(category.getCategoryName())) {
			throw new Exception("Category name has already been exist!");
		}
		
		categoryDao.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		
	}
	
	
	
}
	
	
	
	
	


	


