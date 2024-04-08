package br.com.compassuol.sp.challenge.msproducts.presentation.DTO.response;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Category;
import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record ProductResponseDTO(
        UUID productId,
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
                product.getPrice(),
                product.getCategoriesList()
        );
    }

}
