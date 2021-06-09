package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.model.Estado;
import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.service.EstadoService;
import com.escalab.ordenespershingback.service.MercadoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mercado")
public class MercadoController {
    private MercadoService mercadoService;

    @Autowired
    public MercadoController(MercadoService mercadoService) {
        this.mercadoService = mercadoService;
    }

    @ApiOperation(value = "Obtener todos las mercados",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Mercado")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Mercados en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<Mercado> findAll(){
        return mercadoService.findAll();
    }

    @GetMapping("/{id}")
    public Mercado finById(@PathVariable("id") Integer id) throws Exception{
        return mercadoService.findById(id);
    }

    @PostMapping
    public Mercado save(@RequestBody Mercado mercado){
        return mercadoService.save(mercado);
    }

    @PutMapping
    public Mercado update(@RequestBody Mercado mercado){
        return  mercadoService.update(mercado);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        mercadoService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
