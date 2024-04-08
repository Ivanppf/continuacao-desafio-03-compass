package br.com.compassuol.sp.challenge.msauthorization.business.services;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;
import br.com.compassuol.sp.challenge.msauthorization.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.UUID;

@Service
@SessionScope
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User findById(UUID id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(UUID id, User user) {
        user.setUserId(id);
        return userRepository.save(user);
    }

}
