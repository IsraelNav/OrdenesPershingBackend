package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.TipoProducto;
import com.escalab.ordenespershingback.model.Vigencia;
import com.escalab.ordenespershingback.repository.TipoProductoRepository;
import com.escalab.ordenespershingback.repository.VigenciaRepository;
import com.escalab.ordenespershingback.service.VigenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VigenciaServiceImpl implements VigenciaService {

    @Autowired
    private VigenciaRepository vigenciaRepository;

    @Override
    public Vigencia findById(Integer id) throws Exception{
        Optional<Vigencia> optionalVigencia = vigenciaRepository.findById(id);
        if(!optionalVigencia.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+ id);
        }
        return optionalVigencia.get();
    }

    @Override
    public List<Vigencia> findAll() {
        return vigenciaRepository.findAll();
    }

    @Override
    public Vigencia save(Vigencia vigencia) {
        return vigenciaRepository.save(vigencia);
    }

    @Override
    public Vigencia update(Vigencia vigencia) {
        return vigenciaRepository.save(vigencia);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<Vigencia> optionalVigencia = vigenciaRepository.findById(id);
        if(!optionalVigencia.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        vigenciaRepository.deleteById(id);
        return true;
    }
}
