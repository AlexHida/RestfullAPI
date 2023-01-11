package com.example.rest.Repository;

import com.example.rest.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userInterfaz extends JpaRepository<Usuario, Long> {
}
