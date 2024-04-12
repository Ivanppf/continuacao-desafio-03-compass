package br.com.compassuol.sp.challenge.msproducts.business.configuration;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Category;
import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;
import br.com.compassuol.sp.challenge.msproducts.model.repository.CategoryRepository;
import br.com.compassuol.sp.challenge.msproducts.model.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
@AllArgsConstructor
public class TestConfig implements CommandLineRunner {
    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category category1 = new Category("Eletrônicos");
        Category category2 = new Category("Limpeza");
        Category category3 = new Category("Comida");
        Category category4 = new Category("Roupas");
        List<Category> categories = List.of(category1, category2, category3, category4);
        categoryRepository.saveAll(categories);

        Product product1 = new Product();
        product1.setCategoriesList(List.of(category1));
        product1.setDescription("descrição monitor");
        product1.setName("athen v2l");
        product1.setPrice(new BigDecimal("540.60"));
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setCategoriesList(List.of(category2));
        product2.setDescription("descrição sabonete");
        product2.setName("Sabonete");
        product2.setPrice(new BigDecimal("4.60"));
        productRepository.save(product2);

        Product product3 = new Product();
        product3.setCategoriesList(List.of(category3));
        product3.setDescription("descrição leite");
        product3.setName("leite");
        product3.setPrice(new BigDecimal("5.40"));
        productRepository.save(product3);

        Product product4 = new Product();
        product4.setCategoriesList(List.of(category4));
        product4.setDescription("descrição camisa");
        product4.setName("Camisa");
        product4.setPrice(new BigDecimal("55.60"));
        productRepository.save(product4);

    }
}
