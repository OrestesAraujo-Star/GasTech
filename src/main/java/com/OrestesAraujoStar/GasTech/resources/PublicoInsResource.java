package com.OrestesAraujoStar.GasTech.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OrestesAraujoStar.GasTech.Services.PublicoInsService;
import com.OrestesAraujoStar.GasTech.dto.PublicoDTO;
import com.OrestesAraujoStar.GasTech.dto.PublicoInsInsertDTO;

@RestController
@RequestMapping(value = "/publico")
public class PublicoInsResource {
	
	@Autowired
	private PublicoInsService service;
	
	@PostMapping
	public ResponseEntity<PublicoInsInsertDTO>  insert(@RequestBody PublicoInsInsertDTO dto) {
		PublicoInsInsertDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);

	}

	
	@GetMapping
	public ResponseEntity<Page<PublicoDTO>> findAll(
			@RequestParam(value = "respondido", defaultValue = "") String respondido,
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
			@RequestParam(value = "direction", defaultValue = "DESC") String direction)
			{
				
		if (linesPerPage == 0) {
			linesPerPage = Integer.MAX_VALUE;
		}
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Page<PublicoDTO> list = service.findByMoments(pageRequest);
		return ResponseEntity.ok().body(list);
		
	}
}
