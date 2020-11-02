package com.OrestesAraujoStar.GasTech.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OrestesAraujoStar.GasTech.dto.PublicoDTO;
import com.OrestesAraujoStar.GasTech.dto.PublicoInsInsertDTO;
import com.OrestesAraujoStar.GasTech.entities.Publico;
import com.OrestesAraujoStar.GasTech.repositories.PublicoRepository;

@Service
public class PublicoInsService {
	
	@Autowired
	private PublicoRepository repository;
	
	@Transactional
	public PublicoInsInsertDTO insert(PublicoInsInsertDTO dto) {
		Publico entity = new Publico();
		entity.setNome(dto.getNome());
		entity.setEmail(dto.getEmail());
		entity.setCpf(dto.getCpf());
		entity.setCnpj(dto.getCnpj());
		entity.setSugestao(dto.getSugestao());
		entity.setRespondido(dto.getRespondido());
		
		entity = repository.save(entity);
		return new PublicoInsInsertDTO(entity);

		
	}
	
	@Transactional(readOnly = true)
	public Page<PublicoDTO> findByMoments(PageRequest pageRequest) {
		return repository.findByMoments(pageRequest).map(x -> new PublicoDTO(x));
	}


		
	

}
