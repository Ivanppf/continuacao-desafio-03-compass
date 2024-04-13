package br.com.compassuol.sp.challenge.msauthorization.model.repository;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

}