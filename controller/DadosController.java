package com.dio.microservices.controller;

import org.springframework.web.bind.annotation.*;

import com.dio.microservices.model.Dados;
import com.dio.microservices.service.DadosService;

@RestController
@RequestMapping("/dados")
public class DadosController {

    private final DadosService service;

    public DadosController(DadosService service) {
        this.service = service;
    }

    @PostMapping
    public Dados criar() {
        return service.gerarDados();
    }
}
