package com.wpa.imoveis.controller;

import com.wpa.imoveis.entities.Imovel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import com.wpa.imoveis.service.ImovelService;



@RestController
@RequestMapping("/imoveis")
public class ImovelController {

	@Autowired
	private ImovelService imovelService;

	@GetMapping
	public ResponseEntity<Page<Imovel>> findAll(@PageableDefault(size = 10, page = 0, sort= "id")Pageable pageable){
		return ResponseEntity.ok();
	}

}
