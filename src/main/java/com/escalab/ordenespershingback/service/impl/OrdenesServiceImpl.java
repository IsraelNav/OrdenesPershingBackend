package com.escalab.ordenespershingback.service.impl;

import com.escalab.ordenespershingback.dto.ConsultarOrdenes;
import com.escalab.ordenespershingback.exeption.ModeloNotFoundException;
import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.model.Operacion;
import com.escalab.ordenespershingback.model.Ordenes;
import com.escalab.ordenespershingback.model.Vigencia;
import com.escalab.ordenespershingback.repository.OperacionRepository;
import com.escalab.ordenespershingback.repository.OrdenesRespository;
import com.escalab.ordenespershingback.service.MercadoService;
import com.escalab.ordenespershingback.service.OperacionService;
import com.escalab.ordenespershingback.service.OrdenesService;
import com.escalab.ordenespershingback.service.VigenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrdenesServiceImpl implements OrdenesService {

    @Autowired
    private OrdenesRespository ordenesRepository;

    @Autowired
    private VigenciaService vigenciaService;

    @Autowired
    private OperacionService operacionService;

    @Autowired
    private MercadoService mercadoService;

    @Override
    public Ordenes findById(Integer id) throws Exception{
        Optional<Ordenes> optionalOrdenes = ordenesRepository.findById(id);
        if(!optionalOrdenes.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: "+ id);
        }
        return optionalOrdenes.get();
    }

    @Override
    public List<Ordenes> findAll() {

        return ordenesRepository.findAll();
    }

    @Override
    public List<ConsultarOrdenes> getOrdenes() throws Exception {
        List<Ordenes> ordenes = ordenesRepository.findAll();
        List<ConsultarOrdenes> ordenesDTO = new ArrayList<>();
        for(Ordenes od: ordenes){
            ConsultarOrdenes dto = new ConsultarOrdenes();
            dto.setIdOrden(od.getIdOrden());
            Vigencia vigencia = vigenciaService.findById(od.getVigencia().getIdVigencia());
            Operacion operacion = operacionService.findById(od.getOperacion().getIdOperacion());
            Mercado mercado = mercadoService.findById(od.getMercado().getIdMercado());
            dto.setVigencia(vigencia);
            dto.setOperacion(operacion);
            dto.setMercado(mercado);
            dto.setFechaIngreso(od.getFechaIngreso());
            dto.setRut(od.getRut());
            dto.setNombre(od.getNombre());
            dto.setLlr(od.getLlr());
            dto.setMontoEstimado(od.getMontoEstimado());
            dto.setComision(od.getComision());

            ordenesDTO.add(dto);
        }
        return ordenesDTO;
    }

    @Override
    public Ordenes save(Ordenes ordenes) {
        return ordenesRepository.save(ordenes);
    }

    @Override
    public Ordenes update(Ordenes ordenes) {
        return ordenesRepository.save(ordenes);
    }

    @Override
    public boolean deleteById(Integer id) throws Exception{
        Optional<Ordenes> optionalOrdenes = ordenesRepository.findById(id);
        if(!optionalOrdenes.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + id);
        }
        ordenesRepository.deleteById(id);
        return true;
    }
}
