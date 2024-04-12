package br.com.compassuol.sp.challenge.msproducts.business.services;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Product findById(Integer id);

    Page<Product> findAll(Pageable pageable);

    Product save(Product product);

    Product update(Integer id, Product product);

    void deleteById(Integer id);
}
