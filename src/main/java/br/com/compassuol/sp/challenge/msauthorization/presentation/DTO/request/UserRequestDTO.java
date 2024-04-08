package br.com.compassuol.sp.challenge.msauthorization.presentation.DTO.request;

import java.util.List;
import java.util.UUID;

public record UserRequestDTO(
        String firstName,
        String lastName,
        String email,
        String password,
        List<UUID> roles
) {
}
