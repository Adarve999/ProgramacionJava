/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo1_calculos;

/**
 *
 * @author rubén
 */
public class Empresa1 implements Trabajo { 
//Esta empresa paga a 12 euros la hora de trabajo 
    
@Override
public double pagarSueldo(double horas) { return horas*12; } 
}
