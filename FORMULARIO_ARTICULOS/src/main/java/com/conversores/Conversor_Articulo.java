package com.conversores;

import java.util.Map;

import com.modelo.Articulo;

public class Conversor_Articulo {
	public Articulo convertir_Articulo(Map<String, String> mapa_datos) {
		
		Articulo articulo_convertido = null;
		Integer codigo_art = null;
		Double precio_art = null;
		Integer unidades_art = null;
		boolean valido = true;
		
		try {
		codigo_art = Integer.parseInt(mapa_datos.get("codigo_articulo"));
		}catch(Exception e) {
			valido = false;
		}
		try {
			precio_art = Double.parseDouble(mapa_datos.get("precio_articulo"));
		}catch(Exception e) {
			valido = false;
		}
		try {
			unidades_art = Integer.parseInt(mapa_datos.get("unidades_articulo"));
		}catch(Exception e) {
			valido = false;
		}
		if(valido) {
			articulo_convertido = new Articulo();
			articulo_convertido.setCodigo_articulo(codigo_art);
			articulo_convertido.setUnidades_articulo(unidades_art);
			articulo_convertido.setPrecio_articulo(precio_art);
			articulo_convertido.setDescripcion_articulo(mapa_datos.get("descripcion_articulo"));
		}
		return  articulo_convertido;
	}
}
