package com.company;

public class AlgoritoEuclides {


    public int funcionAlgEu(int a, int b)
    {

        if (b ==0)
        {
            return a;
        }

        else
        {
            return funcionAlgEu(b,a%b);
        }

    }



}
