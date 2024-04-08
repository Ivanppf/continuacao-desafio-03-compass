package br.com.compassuol.sp.challenge.msauthorization.business.services;

import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;

public interface UserService {
    User findById(Integer id);

    User save(User user);

    User update(Integer id, User user);
}
