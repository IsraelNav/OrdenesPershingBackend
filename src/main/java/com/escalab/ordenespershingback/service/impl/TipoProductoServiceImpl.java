package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.TipoOrden;
import com.escalab.ordenespershingback.model.TipoProducto;
import com.escalab.ordenespershingback.repository.TipoOrdenRepository;
import com.escalab.ordenespershingback.repository.TipoProductoRepository;
import com.escalab.ordenespershingback.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoProductoServiceImpl implements TipoProductoService {

    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    @Override
    public TipoProducto findById(Integer id) throws Exception{
        Optional<TipoProducto> optionalTipoProducto = tipoProductoRepository.findById(id);
        if(!optionalTipoProducto.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+ id);
        }
        return optionalTipoProducto.get();
    }

    @Override
    public List<TipoProducto> findAll() {
        return tipoProductoRepository.findAll();
    }

    @Override
    public TipoProducto save(TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public TipoProducto update(TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<TipoProducto> optionalTipoProducto = tipoProductoRepository.findById(id);
        if(!optionalTipoProducto.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        tipoProductoRepository.deleteById(id);
        return true;
    }
}
