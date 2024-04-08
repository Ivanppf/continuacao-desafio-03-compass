package br.com.compassuol.sp.challenge.msproducts.business.services;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;
import br.com.compassuol.sp.challenge.msproducts.model.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.UUID;

@Service
@SessionScope
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public Product findById(UUID id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product with id " + id + " not found"));
    }

    public List<Product> findAll(Sort pageable) {
        return productRepository.findAll(pageable);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product update(UUID id, Product product) {
        findById(id);
        product.setProductId(id);
        return productRepository.save(product);
    }

    public void deleteById(UUID id) {
        productRepository.deleteById(id);
    }
}
