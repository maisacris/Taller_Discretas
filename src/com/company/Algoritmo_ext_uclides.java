package com.company;

import javax.swing.*;

public class Algoritmo_ext_uclides {



    public void funciAlgEuclides(){
        int a,b;
        int residuo = 0 ;
        int [] vec = new int[3];

        a = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor b"));
        int numV;

        while (b !=0)
        {
            numV = b;
            do {
                if (b*numV >= a){
                    numV = numV - 1;
                }
                else{
                    numV = numV +1;
                }

                if (b * numV < a) {
                    residuo = a - b * numV;
                    System.out.println(a + " = " + b + "*" + numV + "+" + residuo);
                    vec[0] = a;
                    vec[1] = b;
                    vec[2] = residuo;
                }


            } while (b * numV > a);
            a = vec[1];
            b = vec[2];


        }







    }
}
