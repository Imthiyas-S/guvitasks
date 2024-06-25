package imthiyas.ProductCatalogSystem.repository;


import imthiyas.ProductCatalogSystem.productEntity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {



}
