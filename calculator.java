
package minicalculadora;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String sele=null;
   double a=0;
   double b=0;
   double res=0;
   Scanner tec=new Scanner(System.in);
   System.out.println("Seleccione Operacion:");
   System.out.println("+: Suma"
           +"\n -: Resta"
		   +"\n *: Multiplicacion"
           +"\n /: Division"
           + "\n %: Divison con residuo");
   sele=tec.nextLine();
   switch(sele){
   case("+"):
	   System.out.println("A seleccionado SUMA"
			  + "\n Ingrese primer numero:"
			  + "\n Y PRESIONE ENTER");
   a=tec.nextDouble();
   
   System.out.println("Ingrese el segundo n�mero:");
   b=tec.nextDouble();
   res=a+b;
   System.out.println(a+"+"+b+"="+res);
   break;
   
   case("-"):
	   System.out.println("A seleccionado RESTA"
			  + "\n Ingrese primer numero:"
			  +  "\n Y PRESIONE ENTER");
   a=tec.nextDouble();
   
   System.out.println("Ingrese el segundo n�mero:");
   b=tec.nextDouble();
   res=a-b;
   System.out.println(a+"-"+b+"="+res);
   break;
   
   case("*"):
	   System.out.println("A seleccionado MULTIPLICACION"
			  + "\n Ingrese primer numero"
			  + "\n Y PRESIONE ENTER");
   a=tec.nextDouble();
   
   System.out.println("Ingrese el segundo n�mero:");
   b=tec.nextDouble();
   res=a*b;
   System.out.println(a+"*"+b+"="+res);
   break;
   
   case("/"):
	   System.out.println("A seleccionado DIVISION"
			  + "\n Ingrese primer numero:"
			  + "\n Y PRESIONE ENTER");
   a=tec.nextDouble();
  
   System.out.println("Ingrese el segundo n�mero:");
   b=tec.nextDouble();
   res=a/b;
   System.out.println(a+"/"+b+"="+res);
   break;
   
   case("%"):
	   System.out.println("A seleccionado DIVISION CON RESIDUO"
			  + "\n Ingrese primer numero:"
			  + "\n Y PRESIONE ENTER");
   a=tec.nextDouble();
   
   System.out.println("Ingrese el segundo n�mero:");
   b=tec.nextDouble();
   res=a%b;
   System.out.println(a+"%"+b+"="+res);
   break;
   
   
   
   }
   
   
   
		   
	}

}
