package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.model.Estado;
import com.escalab.ordenespershingback.service.EstadoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class EstadoController {

    private EstadoService estadoService;

    @Autowired
    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @ApiOperation(value = "Obtener todos los estados",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Estado")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron pacientes en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<Estado> findAll(){
        return estadoService.findAll();
    }

    @GetMapping("/{id}")
    public Estado finById(@PathVariable("id") Integer id) throws Exception{
        return estadoService.findById(id);
    }

    @PostMapping
    public Estado save(@RequestBody Estado estado){
        return estadoService.save(estado);
    }

    @PutMapping
    public Estado update(@RequestBody Estado estado){
        return  estadoService.update(estado);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        estadoService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
