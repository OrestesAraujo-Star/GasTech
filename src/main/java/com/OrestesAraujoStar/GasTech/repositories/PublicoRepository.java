package com.OrestesAraujoStar.GasTech.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OrestesAraujoStar.GasTech.entities.Publico;

@Repository
public interface PublicoRepository extends JpaRepository<Publico, Long>{

//	@Query("SELECT obj FROM Publico obj WHERE (coalece(obj.id,null) IS NULL OR obj.id <=2)")
	@Query("SELECT obj FROM Publico obj WHERE (obj.id IS NULL OR obj.id <=2)")
	Page<Publico> findByMoments(PageRequest pageRequest);

}
