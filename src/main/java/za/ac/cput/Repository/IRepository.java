package za.ac.cput.Repository;

public interface IRepository<T, ID> {
/*
    T = Type parameter
    ID = Type parameter for specific string types which are identifiers such as id numbers etc
    t & id are parameters
 */

    public T create(T t);

    public T read (ID id);

    public T update(T t);

    public boolean delete(ID id);
}
