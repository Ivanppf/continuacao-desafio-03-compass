package br.com.compassuol.sp.challenge.msauthorization.presentation.DTO.request;

import java.util.List;

public record UserRequestDTO(
        String firstName,
        String lastName,
        String email,
        String password,
        List<Integer> roles
) {
}
