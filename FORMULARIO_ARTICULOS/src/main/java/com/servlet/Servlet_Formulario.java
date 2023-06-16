package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.conversores.Conversor_Articulo;
import com.logica.Articulo_Logica;
import com.modelo.Articulo;

@WebServlet(description = "Formulario de articulos", urlPatterns = { "/Servlet_Formulario" })
public class Servlet_Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_Formulario() {
		System.out.println("soy el constructor del servlet formulario");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("soy el metodo init del servlet formulario");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("soy el metodo destroy del servlet formulario");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		
		Articulo articulo_consulta = null;
		String boton = peticion.getParameter("accion") ;
		
		String codigo_articulo = peticion.getParameter("codigo_articulo");
		String descripcion_articulo = peticion.getParameter("descripcion_articulo");
		String precio_articulo = peticion.getParameter("precio_articulo");
		String unidades_articulo =peticion.getParameter("unidades_articulo");		
	
		Conversor_Articulo conversor = new Conversor_Articulo();

		Map<String,String>mapa_datos = new HashMap<>();
		mapa_datos.put("codigo_articulo", codigo_articulo);
		mapa_datos.put("unidades_articulo", unidades_articulo);
		mapa_datos.put("precio_articulo", precio_articulo);
		mapa_datos.put("descripcion_articulo", descripcion_articulo);
		
		Articulo articulo_convertido =conversor.convertir_Articulo(mapa_datos);	
		
		if(articulo_convertido != null) {
			Articulo_Logica logica = new Articulo_Logica();
			Boolean proceso_correcto = false;
			
			if(boton.equals("alta")){
			proceso_correcto = logica.alta_Articulo(articulo_convertido);	
			}
			if(boton.equals("baja")) {
				proceso_correcto = logica.baja_Articulo(articulo_convertido);
			}
			if(boton.equals("modificar")) {
				proceso_correcto = logica.modificar_Articulo(articulo_convertido);
			}
			if(boton.equals("consultar")) {
				articulo_consulta = logica.consultar_Articulo();
			}
	}
	
		System.out.print("se ha pulsado el boton de " + boton);
	
		RequestDispatcher salida = peticion.getRequestDispatcher("/jsp/bbdd.jsp");
		salida.forward(peticion, respuesta);
	}

}

