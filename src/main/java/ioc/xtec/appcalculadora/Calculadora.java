package ioc.xtec.appcalculadora;

public class Calculadora {

    public double multiplicar(double a, double b) {
      return a * b;
   }

   public double dividir(double a, double b) {
      /*if (b == 0) {
         throw new IllegalArgumentException("El divisor no pot ser zero");
      }*/
      return a/b;
   }
<<<<<<< HEAD
   //Sumar
=======
   //Suma
>>>>>>> branca_resta
   public double sumar(double a, double b) {
      return a+b;
   }
   //Resta
   public double restar(double a, double b) {
      return a-b;
   }
<<<<<<< HEAD
=======
   //metode creat amb branca resta
   public String conflicte() {
      return "conflicte amb branca resta";
   }
>>>>>>> branca_resta
}
