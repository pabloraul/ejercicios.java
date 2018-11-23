package minicalculadora;

import java.util.Scanner;

public class operacionesbinarias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sell=null;
	int numero;
	int exp;
    int digito;
        double binario;
        Scanner sec = new Scanner(System.in);
        System.out.println("CONVERSION DEC A BINARIO"
        		+ "\n CONVERSION BINARIO A DEC");
        sell=sec.nextLine();
        
        
        	
        	
        	
        do{ System.out.println("SELECCIONO DEC A BINARIO");
            System.out.print("Introduce un numero entero: ");
            numero = sec.nextInt();
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
        	
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
                
        }
        System.out.printf("Binario: %.0f %n", binario);
		
	}
}