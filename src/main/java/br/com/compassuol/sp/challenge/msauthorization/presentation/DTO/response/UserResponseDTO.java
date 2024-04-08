package br.com.compassuol.sp.challenge.msauthorization.presentation.DTO.response;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.Role;
import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;

import java.util.List;
import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String firstName,
        String lastName,
        String email,
        List<Role> roles
) {
    public UserResponseDTO(User user) {
        this(user.getUserId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getRoles());
    }
}
