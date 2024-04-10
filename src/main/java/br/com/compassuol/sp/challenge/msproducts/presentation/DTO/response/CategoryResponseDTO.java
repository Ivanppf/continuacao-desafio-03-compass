package br.com.compassuol.sp.challenge.msproducts.presentation.DTO.response;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;

import java.util.List;

public record CategoryResponseDTO(
        Integer categoryId,
        String name,
        List<Product> productList
) {
}
