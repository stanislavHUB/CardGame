package ua.stas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.stas.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
