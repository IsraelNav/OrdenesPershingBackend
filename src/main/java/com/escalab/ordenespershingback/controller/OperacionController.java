package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.model.Moneda;
import com.escalab.ordenespershingback.model.Operacion;
import com.escalab.ordenespershingback.service.MonedaService;
import com.escalab.ordenespershingback.service.OperacionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("operacion")
public class OperacionController {
    private OperacionService operacionService;

    @Autowired
    public OperacionController(OperacionService operacionService) {
        this.operacionService = operacionService;
    }

    @ApiOperation(value = "Obtener todas las operaciones",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Operacion")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Operaciones en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<Operacion> findAll(){
        return operacionService.findAll();
    }

    @GetMapping("/{id}")
    public Operacion finById(@PathVariable("id") Integer id) throws Exception{
        return operacionService.findById(id);
    }

    @PostMapping
    public Operacion save(@RequestBody Operacion operacion){
        return operacionService.save(operacion);
    }

    @PutMapping
    public Operacion update(@RequestBody Operacion operacion){
        return  operacionService.update(operacion);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        operacionService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
