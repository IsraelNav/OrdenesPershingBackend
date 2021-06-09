package com.escalab.ordenespershingback.repository;

import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.model.Ordenes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenesRespository extends JpaRepository<Ordenes,Integer> {
}
