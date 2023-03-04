import java.util.List;
import java.util.Scanner;

public class ClassificacaoIMC {
    private double _peso;
    private double _tamanho;
    private String _tipoDeMedida;
    private double _medidaValida;

    Scanner sc= new Scanner(System.in);

    public double SetMedida(String tipoDeMedida){
        _tipoDeMedida = tipoDeMedida;
        System.out.println("Suas medidas devem ser maiores que 0 e no formato X.XX");
        System.out.println("Qual seu " + _tipoDeMedida + "?");
        String medida = sc.nextLine();
        VerificarValorMedida(medida);
        return _medidaValida;
    }

    private void VerificarValorMedida(String medida){
        try {
            _medidaValida = (Double.parseDouble(medida) > 0) ? Double.parseDouble(medida) : SetMedida(_tipoDeMedida);
        }catch(Exception error){
            System.out.println("Medida deve ser dada somente com números, usando ponto para separação.\n" +
                    "Formato X.XX\n" +
                    "Enter para continuar");
            sc.nextLine();
            SetMedida(_tipoDeMedida);
        }
    }

    private final String[][] _listaDeValores = {
            {"Magreza Grau III", "0", "" },
            {"Magreza Grau II", "16", ""},
            {"Magreza Grau I","17", ""},
            {"Eutrofia", "18.5", ""},
            {"Sobrepeso", "25", "Risco Aumentado"},
            {"Obesidade Grau I","30", "Risco Moderado"},
            {"Obesidade Grau II", "35", "Risco Grave"},
            {"Obesidade Grau III", "40.01", "Risco Muito Grave"}
    };

    public String[] GetClassificacao(double imc){
        String[] classificacao = {"",""};
        for (int i = _listaDeValores.length -1; i >= 0; i--){
            if(imc >= Double.parseDouble(_listaDeValores[i][1])){
                 classificacao[0] = _listaDeValores[i][0];
                 classificacao[1] = _listaDeValores[i][2];
                 i = 0;
            }
        }
        return classificacao;
    }


}
