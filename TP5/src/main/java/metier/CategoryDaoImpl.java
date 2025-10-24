package metier;

import dao.IDao;
import entities.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements IDao<Category> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean create(Category category) {
        sessionFactory.getCurrentSession().persist(category);
        return true;
    }

    @Override
    public Category findById(int id) {
        return sessionFactory.getCurrentSession().get(Category.class, id);

    }

    @Override
    public List<Category> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Category", Category.class)
                .list();
    }

    @Override
    public boolean update(Category category) {
        sessionFactory.getCurrentSession().merge(category);
        return true;
    }

    @Override
    public boolean delete(Category category) {
        Session session = sessionFactory.getCurrentSession();

        if (category != null) {
            session.remove(category);
        }
        return true;
    }

}
