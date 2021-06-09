package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.Moneda;
import com.escalab.ordenespershingback.model.Operacion;
import com.escalab.ordenespershingback.repository.MonedaRepository;
import com.escalab.ordenespershingback.repository.OperacionRepository;
import com.escalab.ordenespershingback.service.OperacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperacionServiceImpl implements OperacionService {

    @Autowired
    private OperacionRepository operacionRepository;

    @Override
    public Operacion findById(Integer id) throws Exception{
        Optional<Operacion> optionalOperacion = operacionRepository.findById(id);
        if(!optionalOperacion.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+ id);
        }
        return optionalOperacion.get();
    }

    @Override
    public List<Operacion> findAll() {
        return operacionRepository.findAll();
    }

    @Override
    public Operacion save(Operacion operacion) {
        return operacionRepository.save(operacion);
    }

    @Override
    public Operacion update(Operacion operacion) {
        return operacionRepository.save(operacion);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<Operacion> optionalOperacion = operacionRepository.findById(id);
        if(!optionalOperacion.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        operacionRepository.deleteById(id);
        return true;
    }
}
