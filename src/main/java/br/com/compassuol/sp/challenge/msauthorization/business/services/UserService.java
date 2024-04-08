package br.com.compassuol.sp.challenge.msauthorization.business.services;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;

import java.util.UUID;

public interface UserService {
    User findById(UUID id);

    User save(User user);

    User update(UUID id, User user);
}
