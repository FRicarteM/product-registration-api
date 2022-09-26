package br.com.fabtec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabtec.modal.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
