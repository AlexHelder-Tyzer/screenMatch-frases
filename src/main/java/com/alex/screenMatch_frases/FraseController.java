package com.alex.screenMatch_frases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired // inyeccion de la dependencia
    FraseService servicio;

    @GetMapping("series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }

}
