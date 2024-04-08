package br.com.compassuol.sp.challenge.msproducts.presentation.DTO.response;

import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;

import java.util.List;
import java.util.UUID;

public record CategoryResponseDTO(
        UUID categoryId,
        String name,
        List<Product> productList
) {
}
