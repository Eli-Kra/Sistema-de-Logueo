/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Persona {
   int Id;
   String nombre;
   String correo;

public Persona(){

}

public Persona (int Id, String nombre, String correo){
    this.Id=Id;
    this.nombre=nombre;
    this.correo=correo;
    
}

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
        
        
        
        
        
        }