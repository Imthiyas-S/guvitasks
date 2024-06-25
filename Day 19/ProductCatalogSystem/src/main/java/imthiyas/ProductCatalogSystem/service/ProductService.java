package imthiyas.ProductCatalogSystem.service;



import imthiyas.ProductCatalogSystem.productEntity.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);

    public List<Product> getAllProducts();
}