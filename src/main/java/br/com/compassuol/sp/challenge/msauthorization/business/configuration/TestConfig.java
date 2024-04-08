package br.com.compassuol.sp.challenge.msauthorization.business.configuration;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.Role;
import br.com.compassuol.sp.challenge.msauthorization.model.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class TestConfig implements CommandLineRunner {
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        Role role1 = new Role("Admin");
        Role role2 = new Role("Operator");
        roleRepository.save(role1);
        roleRepository.save(role2);
    }
}
