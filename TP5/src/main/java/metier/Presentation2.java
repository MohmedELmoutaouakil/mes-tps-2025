package metier;

import dao.IDao;
import entities.Category;
import entities.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

public class Presentation2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        IDao<Product> productDao = context.getBean(IDao.class);

        Product product = new Product();
        product.setName("Produit 1");
        product.setPrice(100.0);
        Category category = new Category();
        category.setName("Category 1");
        product.setCategory(category);
        productDao.create(product);

        System.out.println("Produit sauvegardé : " + product.getName());
    }
}