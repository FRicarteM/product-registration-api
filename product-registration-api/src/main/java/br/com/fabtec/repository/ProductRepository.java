package br.com.fabtec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabtec.modal.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findById(Long id);
	List<Product> findByProductName(String productName);
	List<Product> findByBrand(String brand);
	List<Product> findByCategory(Integer category);
	List<Product> findByType(Integer type);
	
}
