package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.model.TipoCuenta;
import com.escalab.ordenespershingback.model.TipoOrden;
import com.escalab.ordenespershingback.service.TipoCuentaService;
import com.escalab.ordenespershingback.service.TipoOrdenService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipoorden")
public class TipoOrdenController {
    private TipoOrdenService tipoOrdenService;

    @Autowired
    public TipoOrdenController(TipoOrdenService tipoOrdenService) {
        this.tipoOrdenService = tipoOrdenService;
    }

    @ApiOperation(value = "Obtener todas los Tipos Ordenes",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "TipoOrden")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Tipo Orden en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<TipoOrden> findAll(){
        return tipoOrdenService.findAll();
    }

    @GetMapping("/{id}")
    public TipoOrden finById(@PathVariable("id") Integer id) throws Exception{
        return tipoOrdenService.findById(id);
    }

    @PostMapping
    public TipoOrden save(@RequestBody TipoOrden tipoOrden){
        return tipoOrdenService.save(tipoOrden);
    }

    @PutMapping
    public TipoOrden update(@RequestBody TipoOrden tipoOrden){
        return  tipoOrdenService.update(tipoOrden);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        tipoOrdenService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
