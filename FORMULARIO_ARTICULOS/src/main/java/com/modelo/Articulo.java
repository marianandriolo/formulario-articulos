package com.modelo;

public class Articulo {
private Integer codigo_articulo;
private String descripcion_articulo;
private Double precio_articulo;
private Integer unidades_articulo;
public Integer getCodigo_articulo() {
	return codigo_articulo;
}
public void setCodigo_articulo(Integer codigo_articulo) {
	this.codigo_articulo = codigo_articulo;
}
public String getDescripcion_articulo() {
	return descripcion_articulo;
}
public void setDescripcion_articulo(String descripcion_articulo) {
	this.descripcion_articulo = descripcion_articulo;
}
public Double getPrecio_articulo() {
	return precio_articulo;
}
public void setPrecio_articulo(Double precio_articulo) {
	this.precio_articulo = precio_articulo;
}
public Integer getUnidades_articulo() {
	return unidades_articulo;
}
public void setUnidades_articulo(Integer unidades_articulo) {
	this.unidades_articulo = unidades_articulo;
}
@Override
public String toString() {
	return "Articulo [codigo_articulo=" + codigo_articulo + ", descripcion_articulo=" + descripcion_articulo
			+ ", precio_articulo=" + precio_articulo + ", unidades_articulo=" + unidades_articulo + "]";
}

}
