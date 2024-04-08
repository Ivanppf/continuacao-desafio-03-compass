package br.com.compassuol.sp.challenge.msproducts.model.repository;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
