package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.Ordenes;
import com.escalab.ordenespershingback.model.TipoCuenta;
import com.escalab.ordenespershingback.repository.OrdenesRespository;
import com.escalab.ordenespershingback.repository.TipoCuentaRepository;
import com.escalab.ordenespershingback.service.TipoCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoCuentaServiceImpl implements TipoCuentaService {

    @Autowired
    private TipoCuentaRepository tipoCuentaRepository;

    @Override
    public TipoCuenta findById(Integer id) throws Exception{
        Optional<TipoCuenta> optionalTipoCuenta = tipoCuentaRepository.findById(id);
        if(!optionalTipoCuenta.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+ id);
        }
        return optionalTipoCuenta.get();
    }

    @Override
    public List<TipoCuenta> findAll() {
        return tipoCuentaRepository.findAll();
    }

    @Override
    public TipoCuenta save(TipoCuenta ordenes) {
        return tipoCuentaRepository.save(ordenes);
    }

    @Override
    public TipoCuenta update(TipoCuenta ordenes) {
        return tipoCuentaRepository.save(ordenes);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<TipoCuenta> optionalTipoCuenta = tipoCuentaRepository.findById(id);
        if(!optionalTipoCuenta.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        tipoCuentaRepository.deleteById(id);
        return true;
    }
}
