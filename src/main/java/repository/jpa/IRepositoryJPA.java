package repository.jpa;

import model.BaseEntity;

public interface IRepositoryJPA<T extends BaseEntity> {
	
	public T save(T t);
	public void delete(Class<T> clazz, Integer id);
	public T findById(Class<T> clazz, Integer id);
	

}
