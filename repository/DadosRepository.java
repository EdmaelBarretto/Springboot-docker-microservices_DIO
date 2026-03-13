package com.dio.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dio.microservices.model.Dados;

public interface DadosRepository extends JpaRepository<Dados, Long> {

}
