package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.Moneda;
import com.escalab.ordenespershingback.repository.MonedaRepository;
import com.escalab.ordenespershingback.service.MonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;;

@Service
public class MonedaServiceImpl implements MonedaService {

    @Autowired
    private MonedaRepository monedaRepository;

    @Override
    public Moneda findById(Integer id) throws Exception{
        Optional<Moneda> optionalMoneda = monedaRepository.findById(id);
        if(!optionalMoneda.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+ id);
        }
        return optionalMoneda.get();
    }

    @Override
    public List<Moneda> findAll() {
        return monedaRepository.findAll();
    }

    @Override
    public Moneda save(Moneda moneda) {
        return monedaRepository.save(moneda);
    }

    @Override
    public Moneda update(Moneda moneda) {
        return monedaRepository.save(moneda);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<Moneda> optionalMoneda = monedaRepository.findById(id);
        if(!optionalMoneda.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        monedaRepository.deleteById(id);
        return true;
    }

}
