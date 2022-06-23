import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main {
  public static void main(String[] args) {
	  
	  String operator;
	  Double num1, num2, result;
	  
	  Scanner input = new Scanner(System.in);
	  
	  boolean loop=true;
	  
	  while(loop){
		  System.out.println("Scegli un'operazione: addizione, sottrazione, "
		  + "moltiplicazione, divisione, radice, potenza, percentuale, esci");
		  
		  
		  if(!input.hasNext()) {
			  input.next();
		  }
		  
		  operator = input.next();
		  
		  switch (operator) {
		  
		  case "addizione":
			  
			  System.out.println("Immetti il primo numero");
			  num1 = input.nextDouble();

			  System.out.println("Immetti il secondo numero");
			  num2 = input.nextDouble();

			  result = num1 + num2;
			  System.out.println(num1 + " + " + num2 + " = " + result);
			  
			  break;
			  
			  
		  case "sottrazione":
			  
			  System.out.println("Immetti il primo numero");
			  num1 = input.nextDouble();

			  System.out.println("Immetti il secondo numero");
			  num2 = input.nextDouble();

			  result = num1 - num2;
			  System.out.println(num1 + " - " + num2 + " = " + result);
			  
			  break;
			  
			  
		  case "moltiplicazione":
			  
			  System.out.println("Immetti il primo numero");
			  num1 = input.nextDouble();

			  System.out.println("Immetti il secondo numero");
			  num2 = input.nextDouble();

			  result = num1 * num2;
			  System.out.println(num1 + " * " + num2 + " = " + result);
			  
			  break;
			  
			  
		  case "divisione":
			  
			  System.out.println("Immetti il primo numero");
			  num1 = input.nextDouble();

			  System.out.println("Immetti il secondo numero");
			  num2 = input.nextDouble();

			  result = num1 / num2;
			  double reminder = num1 % num2;
			  
			  System.out.println(num1 + " / " + num2 + " = " + result + " con resto di " + reminder);
			  
			  break;
			  
		  case "radice":
			  
			  System.out.println("Immetti il numero di cui vuoi la radice");
			  num1 = input.nextDouble();
			  
			  result = Math.sqrt(num1);
			  System.out.println("La radice di " + num1 + " è " + result);
			  
			  break;
			  
		  case "potenza":
			  
			  System.out.println("Immetti il primo numero");
			  num1 = input.nextDouble();

			  System.out.println("Immetti la potenza");
			  num2 = input.nextDouble();

			  result = Math.pow(num1, num2);
			  System.out.println("La potenza di" + num1 + " alla " + num2 + " è " + result);
			  
			  break;
			  
		  case "percentuale":
			  
			  System.out.println("Immetti il primo numero");
			  num1 = input.nextDouble();

			  System.out.println("Immetti il secondo numero");
			  num2 = input.nextDouble();

			  result = (num1 * 100/num2);
			  result = BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
			  System.out.println( num1 + " è il " + result + "% di " + num2);
			  
			  break;
			  
		  case "esci":
			  loop=false;
			  break;
			  
		  default:
			  System.out.println("Operazione non valida, riprova");
			  break;
		  }
		 
	  }
	  input.close();
    }
}