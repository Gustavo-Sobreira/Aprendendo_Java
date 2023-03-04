/*Escreva um programa que calcula o IMC (Índice de massa corporal de uma pessoa) e exibe o resultado.*/

import java.util.*;
public class Program {
    public static void main(String[] args)
    {
        System.out.println("==========   ==========   ==========   IMC   ==========   ==========   ==========");
        ClassificacaoIMC atual = new ClassificacaoIMC();
        double peso = atual.SetMedida("pesa");
        double altura = atual.SetMedida("mede");
        double imc = peso / (altura * altura);
        String[] classificacao = atual.GetClassificacao(imc);
        System.out.println("Você pesa " + peso +"Kg e mede " + altura + "m sendo assim, seu IMC é " +
                imc + "\nIsso o classifica como: " + classificacao[0] + " " + classificacao[1]
                );
    }
}
