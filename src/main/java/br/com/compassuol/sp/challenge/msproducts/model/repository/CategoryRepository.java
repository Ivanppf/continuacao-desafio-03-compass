package br.com.compassuol.sp.challenge.msproducts.model.repository;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
