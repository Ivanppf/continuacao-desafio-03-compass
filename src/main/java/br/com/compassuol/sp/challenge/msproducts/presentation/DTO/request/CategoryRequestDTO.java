package br.com.compassuol.sp.challenge.msproducts.presentation.DTO.request;

import jakarta.validation.constraints.NotNull;

public record CategoryRequestDTO(
        @NotNull(message = "Please insert the category name") String name
) {
}
