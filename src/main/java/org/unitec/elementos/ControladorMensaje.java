/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorMensaje {
    
    
 @CrossOrigin   
 @GetMapping("/mensaje")   
 public Mensaje holaMundo(){
     Mensaje mensa=new Mensaje();
     mensa.setTitulo("Hola mundo");
     return mensa;
 }
    
}
