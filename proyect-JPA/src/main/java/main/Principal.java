package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuarios;

public class Principal {

	public static void main(String[] args) {
		
		//Unidad de persistencia
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-contro-temperatura-test");
		EntityManager em = emf.createEntityManager();
		Usuarios usuarios = em.find(Usuarios.class, "");
		
		System.out.println(usuarios.getId());
		System.out.println(usuarios.getEncargadoID());

	}

}
