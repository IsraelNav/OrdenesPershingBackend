package com.escalab.ordenespershingback.repository;

import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.model.TipoCuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoCuentaRepository extends JpaRepository<TipoCuenta,Integer> {
}
