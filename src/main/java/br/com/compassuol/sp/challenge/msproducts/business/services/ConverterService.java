package br.com.compassuol.sp.challenge.msproducts.business.services;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Category;
import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;
import br.com.compassuol.sp.challenge.msproducts.model.repository.CategoryRepository;
import br.com.compassuol.sp.challenge.msproducts.presentation.DTO.request.ProductRequestDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConverterService {
    private CategoryRepository categoryRepository;

    public Product RequestDTOToProduct(ProductRequestDTO productRequestDTO) {
        List<Category> categories = categoryRepository.findAllById(productRequestDTO.categoryIds());
        Product product = new Product(productRequestDTO);
        product.setCategoriesList(categories);
        return product;
    }

}
