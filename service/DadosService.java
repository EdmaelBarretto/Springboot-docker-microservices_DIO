package com.dio.microservices.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.dio.microservices.model.Dados;
import com.dio.microservices.repository.DadosRepository;

@Service
public class DadosService {

    private final DadosRepository repository;

    public DadosService(DadosRepository repository) {
        this.repository = repository;
    }

    public Dados gerarDados() {

        Random random = new Random();

        Dados dados = new Dados();

        String valor = "User" + random.nextInt(1000);

        dados.setNome(valor);
        dados.setSobrenome(valor);
        dados.setEndereco(valor);
        dados.setCidade(valor);
        dados.setHost(System.getenv("HOSTNAME"));

        return repository.save(dados);
    }
}
