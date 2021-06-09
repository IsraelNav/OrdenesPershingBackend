package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.TipoCuenta;
import com.escalab.ordenespershingback.model.TipoOrden;
import com.escalab.ordenespershingback.repository.TipoCuentaRepository;
import com.escalab.ordenespershingback.repository.TipoOrdenRepository;
import com.escalab.ordenespershingback.service.TipoCuentaService;
import com.escalab.ordenespershingback.service.TipoOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoOrdenServiceImpl implements TipoOrdenService {

    @Autowired
    private TipoOrdenRepository tipoOrdenRepository;

    @Override
    public TipoOrden findById(Integer id) throws Exception{
        Optional<TipoOrden> optionalTipoOrden = tipoOrdenRepository.findById(id);
        if(!optionalTipoOrden.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+ id);
        }
        return optionalTipoOrden.get();
    }

    @Override
    public List<TipoOrden> findAll() {
        return tipoOrdenRepository.findAll();
    }

    @Override
    public TipoOrden save(TipoOrden tipoOrden) {
        return tipoOrdenRepository.save(tipoOrden);
    }

    @Override
    public TipoOrden update(TipoOrden tipoOrden) {
        return tipoOrdenRepository.save(tipoOrden);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<TipoOrden> optionalTipoCuenta = tipoOrdenRepository.findById(id);
        if(!optionalTipoCuenta.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        tipoOrdenRepository.deleteById(id);
        return true;
    }
}
