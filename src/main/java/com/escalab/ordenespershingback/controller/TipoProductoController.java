package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.model.TipoOrden;
import com.escalab.ordenespershingback.model.TipoProducto;
import com.escalab.ordenespershingback.service.TipoOrdenService;
import com.escalab.ordenespershingback.service.TipoProductoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipoproducto")
public class TipoProductoController {

    private TipoProductoService tipoProductoService;

    @Autowired
    public TipoProductoController(TipoProductoService tipoProductoService) {
        this.tipoProductoService = tipoProductoService;
    }

    @ApiOperation(value = "Obtener todas los Tipos Producto",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "TipoProducto")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Tipo Producto en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<TipoProducto> findAll(){
        return tipoProductoService.findAll();
    }

    @GetMapping("/{id}")
    public TipoProducto finById(@PathVariable("id") Integer id) throws Exception{
        return tipoProductoService.findById(id);
    }

    @PostMapping
    public TipoProducto save(@RequestBody TipoProducto tipoProducto){
        return tipoProductoService.save(tipoProducto);
    }

    @PutMapping
    public TipoProducto update(@RequestBody TipoProducto tipoProducto){
        return  tipoProductoService.update(tipoProducto);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        tipoProductoService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
