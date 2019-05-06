/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Futbolista extends SeleccionFutbol{

    @Override
    public void concentrarse() {
        System.out.println("Concentrandose futbolista.");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando futbolista.");
    }

    @Override
    public void entrenar() {
        System.out.println("Futbolista entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Futbolista jugando partido.");
    }
    
}
