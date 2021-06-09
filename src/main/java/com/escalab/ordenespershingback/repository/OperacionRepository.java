package com.escalab.ordenespershingback.repository;

import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.model.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperacionRepository extends JpaRepository<Operacion,Integer> {
}
