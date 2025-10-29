package om.gjun.jds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import om.gjun.jds.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
