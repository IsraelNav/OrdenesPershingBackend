package com.escalab.ordenespershingback.service;

import com.escalab.ordenespershingback.dto.ConsultarOrdenes;
import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.model.Ordenes;

import java.util.List;

public interface OrdenesService extends ICRUD<Ordenes>{
    List<ConsultarOrdenes> getOrdenes() throws Exception;
}
