package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista
        //Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic.
		
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		Scanner scan = new Scanner (System.in);
		boolean invitato = false;
	    String nome;

	    
	    System.out.println("Salve, Mi dica il suo nome: ");
	     nome = scan.nextLine();
	     for(int i = 0; i < listaInvitati.length; i++) {
				
				if(nome.equalsIgnoreCase(listaInvitati[i])) 
					invitato = true;
	     }	
			    if(invitato == true)
				System.out.println("Lei  è sulla lista, può entrare.");
			    else
				System.out.println("Lei non è sulla lista, non può entrare.");
	 
			
			    scan.close();
	}
	
}
	    
		
	       

 

	



