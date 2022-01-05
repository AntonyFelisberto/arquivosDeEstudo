package com.everis.calculadorasimples;

public class Calculadora
{
    public double soma( double parcela1, double parcela2 ){
        return parcela1 + parcela2;                             //retornando um valor do método
    }

    public double subtrai( double minuendo, double subtraendo ){
        return minuendo - subtraendo;                          //retornando um valor do método
    }

    public double multiplica( double fator1, double fator2 ){
        return fator1 * fator2;                                 //retornando um valor do método
    }

    public double divide( double dividendo, double divisor ){
        return dividendo / divisor;                             //retornando um valor do método
    }
    
    public int restoDivisaoInteira(int dividendo, int divisor){
    	return dividendo % divisor;                             //retornando um valor do método
    }
}
