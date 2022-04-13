package kotiki.dao.dao;

import java.util.List;

public interface Dao<T> {
    public T findById(int id);
    public List<T> getAll();
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
