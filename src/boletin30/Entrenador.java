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
public class Entrenador extends SeleccionFutbol{
    @Override
    public void concentrarse() {
        System.out.println("Concentrandose entrenador.");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando entrenador.");
    }

    @Override
    public void entrenar() {
        System.out.println("Futbolista entrenador.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Entrenador jugando partido.");
    }
    public void SeleccionarXogador(){
        System.out.println("Seleccionando jugador.");
    
    
    }
}
