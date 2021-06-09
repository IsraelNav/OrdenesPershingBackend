package com.escalab.ordenespershingback.repository;

import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    //select * from usuario where username = ?
    Usuario findOneByUserName(String username);
}
