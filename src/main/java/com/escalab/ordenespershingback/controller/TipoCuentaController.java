package com.escalab.ordenespershingback.controller;

import com.escalab.ordenespershingback.model.Ordenes;
import com.escalab.ordenespershingback.model.TipoCuenta;
import com.escalab.ordenespershingback.service.OrdenesService;
import com.escalab.ordenespershingback.service.TipoCuentaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipocuenta")
public class TipoCuentaController {

    private TipoCuentaService tipoCuentaService;

    @Autowired
    public TipoCuentaController(TipoCuentaService tipoCuentaService) {
        this.tipoCuentaService = tipoCuentaService;
    }

    @ApiOperation(value = "Obtener todas los Tipos Cuentas",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "TipoCuenta")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Tipo Cuenta en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public List<TipoCuenta> findAll(){
        return tipoCuentaService.findAll();
    }

    @GetMapping("/{id}")
    public TipoCuenta finById(@PathVariable("id") Integer id) throws Exception{
        return tipoCuentaService.findById(id);
    }

    @PostMapping
    public TipoCuenta save(@RequestBody TipoCuenta tipoCuenta){
        return tipoCuentaService.save(tipoCuenta);
    }

    @PutMapping
    public TipoCuenta update(@RequestBody TipoCuenta tipoCuenta){
        return  tipoCuentaService.update(tipoCuenta);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) throws Exception{
        tipoCuentaService.deleteById(id);
        return "Estado eliminado correctamente";
    }
}
