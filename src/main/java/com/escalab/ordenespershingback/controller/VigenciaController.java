package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.model.TipoProducto;
import com.escalab.ordenespershingback.model.Vigencia;
import com.escalab.ordenespershingback.service.TipoProductoService;
import com.escalab.ordenespershingback.service.VigenciaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vigencia")
public class VigenciaController {
    private VigenciaService vigenciaService;

    @Autowired
    public VigenciaController(VigenciaService vigenciaService) {
        this.vigenciaService = vigenciaService;
    }

    @ApiOperation(value = "Obtener todas las vigencias",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Vigencia")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Tipo Producto en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<Vigencia> findAll(){
        return vigenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Vigencia finById(@PathVariable("id") Integer id) throws Exception{
        return vigenciaService.findById(id);
    }

    @PostMapping
    public Vigencia save(@RequestBody Vigencia vigencia){
        return vigenciaService.save(vigencia);
    }

    @PutMapping
    public Vigencia update(@RequestBody Vigencia vigencia){
        return  vigenciaService.update(vigencia);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        vigenciaService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
