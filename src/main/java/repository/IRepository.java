package repository;

public interface IRepository<T> {
	
	public T salvar(T t);
	public T alterar(T t);
	public T excluir(Class<T> clazz, T t);

}
