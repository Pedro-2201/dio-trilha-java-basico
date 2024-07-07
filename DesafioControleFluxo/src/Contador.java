import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimendo o número " + (i + 1) );
        }
    }

}