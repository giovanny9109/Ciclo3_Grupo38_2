package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.web.entidad.Usuarios;

@Repository
/*@EnableJpaRepositories ("com.app.web.repositorio")*/
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Integer>{
}
