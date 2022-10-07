package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Area;

@Repository
public interface AreaRepositorio extends JpaRepository<Area, Integer>{

}
