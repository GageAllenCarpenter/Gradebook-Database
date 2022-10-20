package RepoBase;

import java.util.Collection;

/**
 * The RepoBase.Repository interface defines the API for all repository objects
 * These objects must use RepoBase.EntityBase as their parent class
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public interface Repository<T extends EntityBase>
{
    public int count();

    public T get(int ID);

    public Collection<T> getPage(int pageNumber, int pageSize);

    public Collection<T> search(String term);

    public boolean add(T entity);

    public boolean update(T entity);

    public boolean delete(T entity);

    public int addCollection(Collection<T> addList);

    public int updateCollection(Collection<T> updateList);

    public int deleteCollection(Collection<T> deleteList);
}