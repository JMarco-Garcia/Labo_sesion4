/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion4.Entidades;

import sesion4.Abstracciones.Persona;

/**
 *
 * @author marco
 */
public class Empleado extends Persona {

    private String codEmpleado;
    private String area;

    public Empleado() {

    }

    public Empleado(String codEmpleado, String area, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codEmpleado = codEmpleado;
        this.area = area;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public String getArea() {
        return area;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
