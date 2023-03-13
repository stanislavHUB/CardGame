package ua.stas.service;

import ua.stas.model.User;

public interface UserService {
    void save(User user);

    void save(User user);

    User findByUsername(String username);
}
