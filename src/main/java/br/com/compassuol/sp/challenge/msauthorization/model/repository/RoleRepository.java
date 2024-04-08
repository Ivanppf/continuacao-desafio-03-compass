package br.com.compassuol.sp.challenge.msauthorization.model.repository;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
}
