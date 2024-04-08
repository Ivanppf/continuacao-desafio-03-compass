package br.com.compassuol.sp.challenge.msproducts.presentation.DTO.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record ProductRequestDTO(
        @NotNull(message = "Please insert the product description") String description,
        @NotNull(message = "Please insert the product name") String name,
        String imgUrl,
        @NotNull(message = "Please insert the product price") @Positive BigDecimal price,
        @NotNull(message = "Please insert the product category") List<UUID> categoryIds
) {
}
