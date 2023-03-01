/*Escreva um programa que conte a quantidade
 de palavras e caracteres que um determinado
 texto, escrito no Console.*/

import java.util.*;
public class Program {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite ou cole um texto aqui, para verificar seu n° de caracteres e n° de palavras");
        String textoParaVerificacao = sc.nextLine().trim();

        System.out.println("Total de caracteres: " + textoParaVerificacao.length() +
                "\nTotal de palavras: " + CalcularTotalDePalavras(textoParaVerificacao));
    }

    private static int CalcularTotalDePalavras(String textoParaVerificacao){
        int quant = (textoParaVerificacao != "") ? 1 : 0;
        String[] palavrasSeparadas = textoParaVerificacao.split("");

        for(int i=0;i<palavrasSeparadas.length;i++){
            if((palavrasSeparadas[i].equals(" ")) && (!Objects.equals(palavrasSeparadas[i + 1], " "))){
                quant++;
            }
        }
        return quant;
    }
}
