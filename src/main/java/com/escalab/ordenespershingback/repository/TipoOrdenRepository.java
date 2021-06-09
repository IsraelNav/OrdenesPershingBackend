package com.escalab.ordenespershingback.repository;

import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.model.TipoOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoOrdenRepository extends JpaRepository<TipoOrden,Integer> {
}
