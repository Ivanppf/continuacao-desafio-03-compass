package br.com.compassuol.sp.challenge.msproducts.business.services;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;
import br.com.compassuol.sp.challenge.msproducts.model.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product with id " + id + " not found"));
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Integer id, Product product) {
        Product foundProduct = findById(id);
        product.setProductId(id);
        product.setDate(foundProduct.getDate());
        return productRepository.save(product);
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
