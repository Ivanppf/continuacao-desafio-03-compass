package br.com.compassuol.sp.challenge.msauthorization.business.services;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.Role;
import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;
import br.com.compassuol.sp.challenge.msauthorization.model.repository.RoleRepository;
import br.com.compassuol.sp.challenge.msauthorization.presentation.DTO.request.UserRequestDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConverterService {
    private RoleRepository roleRepository;

    public User DTOToUser(UserRequestDTO userRequestDTO) {
        List<Role> roles = roleRepository.findAllById(userRequestDTO.roles());
        User user = new User(userRequestDTO);
        user.setRoles(roles);
        return user;
    }
}
