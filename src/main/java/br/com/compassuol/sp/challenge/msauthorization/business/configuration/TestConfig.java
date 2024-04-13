package br.com.compassuol.sp.challenge.msauthorization.business.configuration;

import br.com.compassuol.sp.challenge.msauthorization.business.services.UserService;
import br.com.compassuol.sp.challenge.msauthorization.model.entities.Role;
import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;
import br.com.compassuol.sp.challenge.msauthorization.model.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
@AllArgsConstructor
public class TestConfig implements CommandLineRunner {
    private RoleRepository roleRepository;
    private UserService userService;
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        Role role1 = new Role("Admin");
        Role role2 = new Role("Operator");
        roleRepository.save(role1);
        roleRepository.save(role2);

        User user1 = new User();
        user1.setFirstName("pedro");
        user1.setLastName("lucas");
        user1.setEmail("pedro@gmail.com");
        user1.setPassword(passwordEncoder.encode("pedro123"));
        Role role3 = roleRepository.findById(1).get();
        user1.setRoles(List.of(role3));
        userService.save(user1);

        User user2 = new User();
        user2.setFirstName("robson");
        user2.setLastName("batista");
        user2.setEmail("robson@gmail.com");
        user2.setPassword(passwordEncoder.encode("robson123"));
        Role role4 = roleRepository.findById(2).get();
        user2.setRoles(List.of(role4));
        userService.save(user2);
    }
}
