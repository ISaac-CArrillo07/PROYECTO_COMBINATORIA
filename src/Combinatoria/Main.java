package Combinatoria;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Funciones_combinatoria Objfunciones=new Funciones_combinatoria();
		
		int opc=0;
		while (opc!=7) {
			opc=Objfunciones.index();
			switch (opc) {
			case 1:
				long resp_CSR=Objfunciones.combi_SR();
				JOptionPane.showMessageDialog(null, "Respuesta: "+resp_CSR,"Combinaci�n, sin repetici�n",1);
				break;
			case 2:	
				long resp_CCR=Objfunciones.combi_CR();
				JOptionPane.showMessageDialog(null, "Respuesta: "+resp_CCR,"Combinaci�n, con repetici�n",1);
				break;
			case 3:
				
				long resp_VSR=Objfunciones.var_SR();
				JOptionPane.showMessageDialog(null, "Respuesta: "+resp_VSR,"Variaci�n, sin repetici�n",1);
				break;
			case 4: 
				long resp_VCR=Objfunciones.var_CR();
				JOptionPane.showMessageDialog(null, "Respuesta: "+resp_VCR,"Variaci�n, con repetici�n",1);
				break;
			case 5:	
				long resp_PSR=Objfunciones.permut_SR();
				JOptionPane.showMessageDialog(null, "Respuesta: "+resp_PSR,"Permutaci�n, sin repetici�n",1);
				break;
			case 6:
				long resp_PCR=Objfunciones.permut_CR();
				JOptionPane.showMessageDialog(null, "Respuesta: "+resp_PCR,"Permutaci�n, sin repetici�n",1);
				break;
			case 7:
				JOptionPane.showMessageDialog(null, new JLabel("Fin del programa",JLabel.CENTER),"Combinatoria",-1);
				break;
			default:
				JOptionPane.showMessageDialog(null, new JLabel("Ingrese un n�mero v�lido",JLabel.CENTER),"ERROR!!!",0);
				break;
			}
		}
			
		}
		

}
