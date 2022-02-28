package Ejercicio;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

public class practicaJunit {
	
	String letra;
	int i=0;
	int np=0;
	String vocal;
	public String checkLetters(char c) {
		if (c=='a'|| c == 'e' || c == 'i'|| c == 'o'|| c == 'u') {
		letra = "Vocal";
			return letra;
		}
		else if(c=='b'|| c == 'c' || c == 'd' || c == 'f'|| c == 'g' || c == 'h' || c == 'j'|| c == 'k'|| c == 'l' || c == 'm' || c == 'n'|| c == 'p'
				|| c == 'q' || c == 'r' || c == 's'|| c == 't'|| c == 'v' || c == 'w' || c == 'x'|| c == 'y'|| c == 'z' ) {
			letra= "Consonante";
			return letra;
		}
		else {
			letra= "Caracter no valido";
			return letra;
		}
			
	}
	public boolean checkArray(int [] numeros ) {
	
		for(  i = 0; i < numeros.length; i++){
		   if(numeros[i]>=0 && numeros[i]%2==0)
		    {
		       np ++;     
		    }		    
		}
		if (np==i) {
			return true;
		}else {
			return false;
		}
		
		
	}
		
	public String vocalAbusona(String frase) {
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		for(int x=0;x<frase.length();x++) {
			
			 if ((frase.charAt(x)=='a') ){ 
				 contadorA++;
			  }else if((frase.charAt(x)=='e')||(frase.charAt(x)=='E')) {
				  contadorE++;
			  }else if((frase.charAt(x)=='i')||(frase.charAt(x)=='I')) {
				  contadorI++;
			  }else if((frase.charAt(x)=='o')||(frase.charAt(x)=='O')) {
				  contadorO++;
			  }else if((frase.charAt(x)=='u')||(frase.charAt(x)=='U')) {
				  contadorU++;
			  }
			 if (contadorA==0 && contadorE==0 && contadorI==0 && contadorO==0 && contadorU==0) {
				vocal="Esta cadena de texto no tiene vocales";
			 }else if(contadorA>contadorE && contadorA>contadorI && contadorA>contadorO && contadorA>contadorU) {
				 vocal="A";
			 }else if(contadorE>contadorA && contadorE>contadorI && contadorE>contadorO && contadorE>contadorU) {
				 vocal="E";
			 }else if(contadorI>contadorA && contadorI>contadorE && contadorI>contadorO && contadorI>contadorU) {
				 vocal="I";
			 }else if(contadorO>contadorA && contadorO>contadorE && contadorO>contadorI && contadorO>contadorU) { 
				 vocal="O"; 
			 }else if(contadorU>contadorA && contadorU>contadorE && contadorU>contadorO && contadorU>contadorI) {
				 vocal="U";
			 }
			}
		return vocal;
		
		
		
	}
	
	@Test 
	
	public void testVocal() {
		checkLetters('a');
		assertEquals(letra,"Vocal");
	}
	@Test 
	public void testConsonante() {
		checkLetters('f');
		assertEquals(letra,"Consonante");
	}
	@Test 
	public void testCaracterNoValido() {
		checkLetters('è');
		assertEquals(letra,"Caracter no valido");
	}
	@Test 
	public void ArrayTrue() {
		int [] numero = {2,4,6,8,10 };
		checkArray(numero);
		
		assertEquals(true,true);
	}
	@Test 
	public void ArrayFalse() {
		int [] numero = {2,3,4,6,8,10 };
		checkArray(numero);
		assertEquals(false,false);
	}
	@Test 
	public void ArrayFalse2() {
		int [] numero = {-2,2,4,6,8,10 };
		checkArray(numero);
		assertEquals(false,false);
	}
	@Test 
	public void vocalAbusona() {
		vocalAbusona("Hola que tal estas");
		assertEquals("A",vocal);
	}
	@Test
	public void vocalAbusona2() {
		vocalAbusona("jjjjjjjjhhhhhh");
		assertEquals("Esta cadena de texto no tiene vocales",vocal);
	}
}
