package com.temperatura.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temperatura.apirest.models.Temperatura;

/*Usar o JpaRepository para fazer métodos*/
/*Criar instância Temperatura*/

public interface TemperaturaRepository extends JpaRepository<Temperatura, Long> {

}
