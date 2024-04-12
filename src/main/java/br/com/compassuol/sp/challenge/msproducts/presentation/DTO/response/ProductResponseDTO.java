package br.com.compassuol.sp.challenge.msproducts.presentation.DTO.response;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Category;
import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

public record ProductResponseDTO(
        Integer productId,
        LocalDate date,
        String description,
        String name,
        String imgUrl,
        BigDecimal price,
        List<Category> categoriesList
) {

    public ProductResponseDTO(Product product) {
        this(
                product.getProductId(),
                product.getDate(),
                product.getDescription(),
                product.getName(),
                product.getImgUrl(),
                product.getPrice().setScale(2, RoundingMode.UNNECESSARY),
                product.getCategoriesList()
        );
    }

}
