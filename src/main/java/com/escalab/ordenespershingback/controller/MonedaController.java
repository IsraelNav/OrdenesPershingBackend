package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.model.Mercado;
import com.escalab.ordenespershingback.model.Moneda;
import com.escalab.ordenespershingback.service.MercadoService;
import com.escalab.ordenespershingback.service.MonedaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moneda")
public class MonedaController {

    private MonedaService monedaService;

    @Autowired
    public MonedaController(MonedaService monedaService) {
        this.monedaService = monedaService;
    }

    @ApiOperation(value = "Obtener todos los monedas",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Moneda")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Monedas en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<Moneda> findAll(){
        return monedaService.findAll();
    }

    @GetMapping("/{id}")
    public Moneda finById(@PathVariable("id") Integer id) throws Exception{
        return monedaService.findById(id);
    }

    @PostMapping
    public Moneda save(@RequestBody Moneda moneda){
        return monedaService.save(moneda);
    }

    @PutMapping
    public Moneda update(@RequestBody Moneda moneda){
        return  monedaService.update(moneda);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        monedaService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
