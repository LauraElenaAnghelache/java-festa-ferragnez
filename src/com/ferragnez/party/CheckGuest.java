package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito ? di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista
        //Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic.
		
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		Scanner scan = new Scanner (System.in);
		 String nome, ripeti;
	  do {
		    boolean invitato = false;	    
             System.out.println("Salve, Mi dica il suo nome: ");
	        nome = scan.nextLine();
	        for(int i = 0; i < listaInvitati.length; i++) {
				
				if(nome.equalsIgnoreCase(listaInvitati[i])) 
					invitato = true;
	         }	
			    if(invitato == true)
				System.out.println("Lei  ? sulla lista, pu? entrare.");
			    else
				System.out.println("Lei non ? sulla lista, non pu? entrare.");
		do {
			System.out.println("Ci sono altri invitati? ");
			ripeti = scan.nextLine();
			    if(!ripeti.equalsIgnoreCase("si") && !ripeti.equalsIgnoreCase("no"))
			    System.out.println("Mi scusi non ho capito, puo' ripetere? ");
		    }while(!ripeti.equalsIgnoreCase("si") && !ripeti.equalsIgnoreCase("no"));
		
	  }while(ripeti.equalsIgnoreCase("si"));
	  System.out.println("Grazie, Arrivederci ");
	  		
		
			scan.close();
	
		}	
	

	}  

		
	       

 

	



