
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraPOO {

    public static void main(String[] args) throws IOException {

        coutln("Calculadora sem OO");
        char ch = '.';

        while (true) {
            cout("Para sair digite S ou s: ");
            ch = cinch();
            if (ch == 'S' || ch == 's') break;

            cout("Digite o primeiro número: ");
            double d1 = cind();

            cout("Digite o segundo número: ");
            double d2 = cind();

            cout("Escolha a operação + - * / -> ");
            char op = cinch();

            String msg = "Inválido";
            double dResultado = 0;

            switch (op) {
                case '+':
                    dResultado = d1 + d2;
                    msg = "A soma é:";
                    break;
                case '-':
                    dResultado = d1 - d2;
                    msg = "A subtração é:";
                    break;
                case '*':
                    dResultado = d1 * d2;
                    msg = "A multiplicação é:";
                    break;
                case '/':
                    if (d2 != 0) {
                        dResultado = d1 / d2;
                        msg = "A divisão é:";
                    } else {
                        dResultado = 999999999.999999999;
                        msg = "Erro de divisão por zero";
                    }
                    break;
                default:
                    msg = "Operação não implementada...";
            }

            coutln(msg + " " + dResultado);
        }

        coutln("Encerrado.");
    }

    // Permite ler uma string do teclado
    static String cin() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
        return str;
    }

    // Lê uma string, verifica cada caractere; se houver caractere inválido, retorna 0
    static double cind() throws IOException {
        String str = cin();
        double d = 0;
        int i = 0;
        while (i < str.length()) {
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')
                    || str.charAt(i) == '.'
                    || str.charAt(i) == '-') {
                i++;
                continue;
            } else {
                return d;
            }
        }
        d = Double.parseDouble(str);
        return d;
    }

    // Lê uma string e seleciona o primeiro caractere
    static char cinch() throws IOException {
        String str = cin();
        char ch = 'e';
        if (str.length() >= 1)
            ch = str.charAt(0);
        return ch;
    }

    // Escreve e mantém o cursor na mesma linha
    static void cout(String str) {
        System.out.print(str);
    }

    static void coutln(String str) {
        System.out.println(str);
    }
}