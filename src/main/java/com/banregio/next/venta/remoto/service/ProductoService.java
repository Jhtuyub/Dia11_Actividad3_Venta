package com.banregio.next.venta.remoto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banregio.next.venta.remoto.dto.Producto;
import com.banregio.next.venta.remoto.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {

	private final ProductoRepository repoProducto;
	
	public List<Producto> getAll(){
		return repoProducto.getAll();
	}
	
	
}
