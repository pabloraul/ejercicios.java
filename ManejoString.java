
public class ManejoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre1=("PABLO@gmail.com");
		String nombre2=("raul");
		String texto="hola pa";
		int perro=2;
		
			
		
		System.out.println(nombre1.isEmpty()); // DEVUELVE TRUE SOLO SI LENGTH ES 0
        System.out.println(nombre2.equalsIgnoreCase(nombre1));
		System.out.println(texto.length()); // CANTIDAD DE CARACTERES.
		System.out.println(nombre1.contains("blo")); // LANZA UN BOOLEAN TRUE O FALSE PARA SABER SI CONTIENE ESA CADENA DE CARACTER.
		System.out.println(texto.intern());  // DEVUELVE UNA REPRESENTACION CANONICA 
		System.out.println(texto.trim());   // OMITE LOS ESPACIOS INICIALES Y FINALES
		System.out.println(texto.toString());   // SI ESTA EN LA CADENA SE DEVUELVE
		System.out.println(nombre1.toLowerCase()); // LOS CARACTERES PASAN A QUEDAR EN MINUSCULAS
		System.out.println(nombre2.substring(perro)); // MUESTRA EN PANTALLA LAS ULTIMAS LETRAS 
		
		
		
		
		
		
		
		
		
		

	}

}
