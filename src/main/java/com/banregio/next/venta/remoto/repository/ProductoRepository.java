package com.banregio.next.venta.remoto.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banregio.next.venta.configuration.VentaConfiguration;
import com.banregio.next.venta.remoto.dto.Producto;

@FeignClient(name="PRODUCTO", url = "http://localhost:9898/api/1.0",configuration = VentaConfiguration.class)
public interface ProductoRepository {

	@RequestMapping(value ="/productos", method = RequestMethod.GET)
	List<Producto> getAll();
}
