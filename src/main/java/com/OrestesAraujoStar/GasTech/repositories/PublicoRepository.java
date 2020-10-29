package com.OrestesAraujoStar.GasTech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrestesAraujoStar.GasTech.entities.Publico;

@Repository
public interface PublicoRepository extends JpaRepository<Publico, Long>{

}
