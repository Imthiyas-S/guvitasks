package imthiyas.ProductCatalogSystem.service.Impl;


import imthiyas.ProductCatalogSystem.productEntity.Product;
import imthiyas.ProductCatalogSystem.repository.ProductRepository;
import imthiyas.ProductCatalogSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}