package DB;

/**
 * Created by User on 23.05.2016.
 */
public class DaoMain {
    public static void main(String[] args) {
        DAO<Product> productDAO = new ProductMemoryDAO();
        productDAO.create(new Product(1, "asdsa", "sdf", 234));
        productDAO.create(new Product(1, "asdsa", "sdf", 234));
        productDAO.create(new Product(1, "asdsa", "sdf", 234));
        productDAO.create(new Product(1, "asdsa", "sdf", 234));
        workWithProducts(productDAO);

    }

    private static void workWithProducts(DAO<Product> productDAO) {
        Product product = productDAO.findById(3);
        System.out.println("id = 3" + product);
        System.out.println(product);

        product.setName("Crocodile");

        productDAO.update(product);

        System.out.println("after croco update: " + productDAO.findAll());

        System.out.println(productDAO.findAll());

        productDAO.delete(product);

        productDAO.create(new Product(5, "Giraffe", "African animal", 555_555));

        System.out.println("after croco delete and giraffe insert: " + productDAO.findAll());
    }
}
