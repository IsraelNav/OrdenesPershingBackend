package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.Estado;
import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.repository.MercadoRepository;
import com.escalab.ordenespershingback.service.MercadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MercadoServiceImpl implements MercadoService {

    @Autowired
    private MercadoRepository mercadoRepository;

    @Override
    public Mercado findById(Integer id) throws Exception{
        Optional<Mercado> optionalMercado = mercadoRepository.findById(id);
        if(!optionalMercado.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
        }
        return optionalMercado.get();
    }

    @Override
    public List<Mercado> findAll() {
        return mercadoRepository.findAll();
    }

    @Override
    public Mercado save(Mercado mercado) {
        return mercadoRepository.save(mercado);
    }

    @Override
    public Mercado update(Mercado mercado) {
        return mercadoRepository.save(mercado);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<Mercado> optionalMercado = mercadoRepository.findById(id);
        if(!optionalMercado.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        mercadoRepository.deleteById(id);
        return true;
    }
}
