/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cloneador;

import model.Persona;
import util.Cloner;

/**
 *
 * @author Anselmo Pool <anselmo_pool@alfmensajeria.com.mx>
 * 
 */
public class Cloneador {

    
    public static void main(String[] args) {
        try {
            // Creamos una nueva persona
            Persona persona = Persona.builder()
                    .id(1)
                    .nombre("Jose")
                    .apellidoPaterno("Perez")
                    .apellidoMaterno("Gomez")
                    .edad(25)
                    .direccion("Mexico DF")
                    .build();
            
            // Usando la clase Cloner, creamos una nueva persona clonando los 
            // datos de otra persona
            Persona personaClon = Cloner.clone(persona);
            
            // Imprimimos los datos de cada persona
            System.out.println("Persona Original: " + persona);
            System.out.println("Persona Clonada: " + personaClon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
