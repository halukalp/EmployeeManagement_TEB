package tr.com.teb.bt.employee_app.model.service;

import java.util.List;

public interface EntityService<E, I>
{
    E update(E entity);

    void deleteByID(I id);

    E findByID(I id);

    List<E> getAll();

    E insert(E entity);
}

