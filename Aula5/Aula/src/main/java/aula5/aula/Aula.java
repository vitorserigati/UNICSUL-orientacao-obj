/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula5.aula;

import aula5.aula.classes.Trabalhador;

/**
 *
 * @author autologon
 */
public class Aula {

    public static void main(String[] args) {
          double[] values = new double[]{0, 1500, 2000, 6000, 300, 850, 790, 1000, 1000, 1500, 1100, 2000, 3000};
          Trabalhador trab = new Trabalhador("Vitor", values);
          
          trab.visualiza();
    }
}
