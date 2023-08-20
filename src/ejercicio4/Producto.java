/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author CX-Notebook
 */
public class Producto implements Comparable<Producto> {

    private int codigo;
    private String descripcion;
    private String rubro;
    private double precio;
    private int stock;

    public Producto(int codigo, String descripcion, String rubro, double precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.rubro = rubro;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto t) {
        if (codigo == t.codigo) {
            return 0;
        } else if (codigo > t.codigo) {
            return 1;
        }else{
            return -1;
        }

    }
}
