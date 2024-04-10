package br.com.compassuol.sp.challenge.msproducts.business.configuration;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Category;
import br.com.compassuol.sp.challenge.msproducts.model.repository.CategoryRepository;
import br.com.compassuol.sp.challenge.msproducts.model.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

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

    }
}
