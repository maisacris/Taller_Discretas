package com.company;

import javax.swing.*;

public class AlgoritmoDivision {
        double a,b;


    public void funcAlgDiv (){
        int a,b;
        a= Integer.parseInt(JOptionPane.showInputDialog("ingrese por favor el numero a"));
        b= Integer.parseInt(JOptionPane.showInputDialog("ingrese por favor el numero b"));
        int numeroDism = b -1;
        int residuo =0;


        if(a % b == 0 )
        {
            System.out.print(b+"q + "+ residuo);
        }

        while( b*numeroDism > a){

            numeroDism = numeroDism -1;

            if(b*numeroDism < a){

                residuo = a - b*numeroDism;

                System.out.print(b+"."+ numeroDism+"+"+residuo +" -> "+b+"q + "+residuo);
            }
        }


    }

}
