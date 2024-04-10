package br.com.compassuol.sp.challenge.msproducts.model.repository;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
