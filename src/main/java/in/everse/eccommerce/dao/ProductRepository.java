package in.everse.eccommerce.dao;

import in.everse.eccommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("Http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
