package br.com.compassuol.sp.challenge.msproducts.model.repository;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
