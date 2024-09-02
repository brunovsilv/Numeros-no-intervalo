import java.util.Scanner
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    //um programa qhe leia um valo inteiro N. Este valor será a quantidade de valores inteiros X que seram lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10, 20] e quantos estão fora do intervalo, mostrando essas informações;

    int quantidadeDeNumerosDigitados = sc.nextInt();
    int valoresDentrodoIntervalo = 0;
    int valoresForadoIntervalo = 0;
    int numeroDifitado;

    for(int i = 0; i < quantidade DeNumerosDigitados; i++;) {
      System.out.println("digite o valor a ser comparando");
      numerodigitado = sc.nextInt();
      if (numeroDigitado >= 10 && numeroDigitado <= 20) {
        valoresDentroDoIntervolo++;
      } else {
        valoresForaDoIntervalo++;
      }
      
    }

    Systen.out.println("dentro do intervalo temos: " + valoresDentroDoIntervalo);
    System.out.println("fora do intervalo temos: + valoresForaDoIntervalo");
    sc.close();
  }
  
}