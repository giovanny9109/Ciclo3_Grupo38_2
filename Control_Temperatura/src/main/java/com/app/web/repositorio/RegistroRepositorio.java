package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Registro;

@Repository
public interface RegistroRepositorio extends JpaRepository<Registro, Integer>{

}
