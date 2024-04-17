package br.com.compassuol.sp.challenge.msauthorization.business.services;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;
import br.com.compassuol.sp.challenge.msauthorization.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
//@SessionScope
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    //    private RabbitmqService rabbitmqService;
    private PasswordEncoder passwordEncoder;

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
    }

    @Override
    public User save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        EmailDTO emailDTO = new EmailDTO("", "", "");
        return userRepository.save(user);
    }

    @Override
    public User update(Integer id, User user) {
        user.setUserId(id);
        return userRepository.save(user);
    }

}
