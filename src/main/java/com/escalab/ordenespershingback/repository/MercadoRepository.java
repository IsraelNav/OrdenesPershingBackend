package com.escalab.ordenespershingback.repository;

import com.escalab.ordenespershingback.model.Mercado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercadoRepository extends JpaRepository<Mercado,Integer> {

}
