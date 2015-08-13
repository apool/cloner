/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Anselmo Pool <anselmo_pool@alfmensajeria.com.mx>
 * 
 */
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Integer edad;
    private String direccion;
    
    public Persona() {
    }
    
    private Persona(Integer id, String nombre, String apellidoPaterno, String 
            apellidoMaterno, Integer edad, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public static PersonaBuilder builder() {
        return new PersonaBuilder();
    }
    
    public static class PersonaBuilder {
        
        private Integer id;
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private Integer edad;
        private String direccion;
        
        PersonaBuilder() {
        }
        
        public PersonaBuilder id(Integer id) {
            this.id = id;
            return this;
        }
        
        public PersonaBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        
        public PersonaBuilder apellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
            return this;
        }
        
        public PersonaBuilder apellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
            return this;
        }
        
        public PersonaBuilder edad(Integer edad) {
            this.edad = edad;
            return this;
        }
        
        public PersonaBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }
        
        public Persona build() {
            return new Persona(this.id, this.nombre, this.apellidoPaterno, 
                    this.apellidoMaterno, this.edad, this.direccion);
        }
        
    }
    
}
