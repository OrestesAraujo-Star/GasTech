package com.OrestesAraujoStar.GasTech.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OrestesAraujoStar.GasTech.dto.PublicoDTO;
import com.OrestesAraujoStar.GasTech.entities.Publico;
import com.OrestesAraujoStar.GasTech.repositories.PublicoRepository;

@Service
public class PublicoService {
	
	@Autowired
	private PublicoRepository repository;
	
	@Transactional(readOnly = true)
	public List<PublicoDTO> findAll() {
		List<Publico> list = repository.findAll();
		return list.stream().map(x -> new PublicoDTO(x)).collect(Collectors.toList());
		
		
	}

}
