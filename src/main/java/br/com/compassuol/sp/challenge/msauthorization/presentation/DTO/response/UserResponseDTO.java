package br.com.compassuol.sp.challenge.msauthorization.presentation.DTO.response;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.Role;
import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;

import java.util.List;

public record UserResponseDTO(
        Integer id,
        String firstName,
        String lastName,
        String email,
        List<Role> roles
) {
    public UserResponseDTO(User user) {
        this(user.getUserId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getRoles());
    }
}
