package com.OrestesAraujoStar.GasTech.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrestesAraujoStar.GasTech.Services.PublicoService;
import com.OrestesAraujoStar.GasTech.dto.PublicoDTO;

@RestController
@RequestMapping(value = "/publico")
public class PublicoResource {
	
	@Autowired
	private PublicoService service;
	
	@GetMapping
	public ResponseEntity<List<PublicoDTO>> findAll() {
		List<PublicoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
}
