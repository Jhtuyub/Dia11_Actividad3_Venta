package com.banregio.next.venta.app.web.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.banregio.next.venta.remoto.dto.Producto;
import com.banregio.next.venta.remoto.service.ProductoService;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/1.2/producto")
public class ProductoController {

	private final ProductoService serviProducto;
	@ApiOperation(
			value = "Devuelve todos los productos.",
			notes = "Devuelve todos los productos desde otro microservicio de forma remota."
			)
	@GetMapping
	public ResponseEntity<List<Producto>> getall(){
		return new ResponseEntity<>(serviProducto.getAll(), HttpStatus.OK);
	}

	
}
