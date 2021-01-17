package com.devsuperior.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.trabalho.entities.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long>{

}
