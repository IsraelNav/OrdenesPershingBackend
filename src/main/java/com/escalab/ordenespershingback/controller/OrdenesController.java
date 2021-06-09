package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.dto.ConsultarOrdenes;
import com.escalab.ordenespershingback.model.Operacion;
import com.escalab.ordenespershingback.model.Ordenes;
import com.escalab.ordenespershingback.service.OperacionService;
import com.escalab.ordenespershingback.service.OrdenesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ordenes")
public class OrdenesController {

    private OrdenesService ordenesService;

    @Autowired
    public OrdenesController(OrdenesService ordenesService) {

        this.ordenesService = ordenesService;
    }

    @ApiOperation(value = "Obtener todas las ordenes",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Ordenes")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Ordenes en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<Ordenes> findAll(){

        return ordenesService.findAll();
    }

    @GetMapping("/allOrdenes")
    private List<ConsultarOrdenes> getOrdenes() throws Exception {
        return ordenesService.getOrdenes();
    }

    @GetMapping("/{id}")
    public Ordenes finById(@PathVariable("id") Integer id) throws Exception{
        return ordenesService.findById(id);
    }

    @PostMapping
    public Ordenes save(@RequestBody Ordenes ordenes){
        return ordenesService.save(ordenes);
    }

    @PutMapping
    public Ordenes update(@RequestBody Ordenes ordenes){
        return  ordenesService.update(ordenes);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        ordenesService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
