package ua.stas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.stas.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
