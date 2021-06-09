package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.Estado;
import com.escalab.ordenespershingback.repository.EstadoRepository;
import com.escalab.ordenespershingback.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public Estado findById(Integer id) throws Exception{
        Optional<Estado> optionalEstado = estadoRepository.findById(id);
        if(!optionalEstado.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
        }
        return optionalEstado.get();
    }

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    @Override
    public Estado save(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    public Estado update(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<Estado> optionalEstado = estadoRepository.findById(id);
        if(!optionalEstado.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        estadoRepository.deleteById(id);
        return true;
    }
}
