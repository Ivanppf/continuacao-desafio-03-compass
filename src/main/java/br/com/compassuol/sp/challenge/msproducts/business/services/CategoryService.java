package br.com.compassuol.sp.challenge.msproducts.business.services;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Category;
import br.com.compassuol.sp.challenge.msproducts.model.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
@AllArgsConstructor
public class CategoryService {
    private CategoryRepository categoryRepository;

    public Category findById(Integer id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category with id " + id + "not found!"));
    }


}
