package Combinatoria;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Funciones_combinatoria {
	
	public int index() {
		
		JTextArea areaMenu=new JTextArea();
		areaMenu.append("MENU"+
				"\n1.Combinación, sin repetición"+
				"\n2.Combinación, con repetición"+
				"\n3.Variación, sin repetición"+
				"\n4.Variación, con repetición"+
				"\n5.Permutacion, sin repetición"+
				"\n6.Permutación, con repetición"+
				"\n7.Finalizar Programa");
		
		int opc=Integer.parseInt(JOptionPane.showInputDialog(null,areaMenu,"COMBINATORIA",-1));
		return opc;
	}
	
	public long factorial(int num) {
		long fact=1;
		
		if (num==0) {return 1;}
		else{
			while(num!=0) {
				fact=fact*num;
				num--;
				}
			}
		
		return fact;
	}
	
	public int valor_n() {
		int n=0;
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese valor de n:")) ;
		
		return n;
	}
	public int valor_r() {
		int r=0;
		r=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese valor de r:"));
		return r;
	}
	
	//metodo combinacion sin repeticion;
	public long combi_SR() {
		int n=0, r=0;
		long numerador=0,denominador=0,resp=0;
		
		n=valor_n();
		r=valor_r();
		
		numerador=factorial(n);
		denominador=factorial(r)*factorial(n-r);
		resp=numerador/denominador;
		
		return resp;
	}
	
	//combinacion com repeticion
	public long combi_CR() {
		int n=0, r=0;
		long numerador=0,denominador=0,resp=0;
		
		n=valor_n();
		r=valor_r();
		
		numerador=factorial((n+r)-1);
		denominador=factorial(r)*factorial(n-1);
		resp=numerador/denominador;
		
		return resp;
	}
	
	public long var_SR() {
		int n=0, r=0;
		long numerador=0,denominador=0,resp=0;
		
		n=valor_n();
		r=valor_r();
		
		numerador=factorial(n);
		denominador=factorial((n-r));
		resp=numerador/denominador;
		
		return resp;
	}
	//variacion con repeticion
	public long var_CR() {
		int n=0, r=0;
		long resp=0;
		
		n=valor_n();
		r=valor_r();
		
		resp=(long)Math.pow(n,r);
		return resp;
	}
	
	//Permutacion sin repeticion
	public long permut_SR() {
		int n=0;
		long resp=0;
		n=valor_n();
		resp=factorial(n);
		return resp;
	}
	
	//Permutacion con repeticion
	public long permut_CR() {
		int n=0,cantidad=0;
		long resp=0,numerador=0,denominador=1;
		
		n=valor_n();
		cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese cantidad de elementos: "));
		int [] element= new int[cantidad];
			
			for(int x=0;x<cantidad;x++) {
				element[x]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de veces que se repite el elemento N°\"+(x+1)"));
				denominador=denominador*factorial(element[x]);
			}
		numerador=factorial(n);
		resp=numerador/denominador;
		return resp;
		
	}
}
