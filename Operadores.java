public class Operadores {
    public static void main(String[] args) {
         int num = 5;

          String msg = ((num % 2) == 0) ? "Número Par" : "Número Impar";
          if((num % 2) == 0) {
              msg = "Número Par";
          } else {
              msg = "Número Impar";
          }
          System.out.println(msg);
    }
} 
// String msg = ((num > 10) && (num <100)) ?
//      "Número maior que 10 e menor que 100" :
//      "Número menor ou igual à 10 ou maior que 100";