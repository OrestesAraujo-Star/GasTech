package com.OrestesAraujoStar.GasTech.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrestesAraujoStar.GasTech.Services.PublicoInsService;
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
}
