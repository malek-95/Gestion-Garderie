package miniprojet;

import java.util.Scanner;
import java.util.Vector;
import java.util.*;
import java.text.*;

public class Directeur  {

	private Vector<Animateur> listeAnimateur = new Vector<>();
	private Vector<Eleve> listeEleve = new Vector<Eleve>();
	private Vector<Classe> listeClasse = new Vector<Classe>();
	private Vector<Activité> listeActivite = new Vector<Activité>();
    private Vector<String> payeeSep = new Vector<>();
	private Vector<String> payeeOct = new Vector<>();
	private Vector<String> payeeNov = new Vector<>();
	private Vector<String> payeeDec = new Vector<>();
	private Vector<String> payeeJan = new Vector<>();
	private Vector<String> payeeFev = new Vector<>();
	private Vector<String> payeeMar = new Vector<>();
	private Vector<String> payeeAvr = new Vector<>();
	private Vector<String> payeeMai = new Vector<>();
	private Vector<String> payeeJui = new Vector<>();

	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		int choix = 0;
		
		do {
			System.out.println("\n********** BIENVENU AU MENU PRINCIPALE ****************");
			System.out.println("\n\t 0 - Quitter L'application");
			System.out.println("\n\t 1 - Gestion Animateur");
			System.out.println("\n\t 2 - Gestion Eleve ");
			System.out.println("\n\t 3 - Gestion Classe ");
			System.out.println("\n\t 4 - Gestion Activite/Cours");
			System.out.println("\n\t 5 - Gestion Payment");
			System.out.println("\n\t 6 - Statistique \n");

			System.out.print("\nTapez le numero correspondant à votre choix : ");
			choix = sc.nextInt();
			switch(choix) {
			case 0:
				System.out.println("\nFERMETURE DE L'APPLICATION.....");
				System.exit(0);
				break;
			case 1:
				GestionAnimateur();break;
			case 2:
				GestionEleve();break;
			case 3:
				GestionClasse();break;
			case 4:	
				GestionActivite_Cours();break;
			case 5:	
				GestionPayment();break;
			case 6:	
				Statistique();break;
				
			default:
				System.out.println("\nCHOIX INVALID");
				break;
			}

		}while(choix!=0);
	}
	

	
	     public void GestionAnimateur()
	     {
	    	 int choixAnimateur = 0;
	    	 
	    	 do {
	    		 System.out.println("\n************** BIENVENU AU MENU GESTION DES ANIMATEUR *************");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - Ajouter");
	    		 System.out.println("\n\t 2 - Modifier");
	    		 System.out.println("\n\t 3 - Supprimer");
	    		 System.out.println("\n\t 4 - Lister \n");
	    		 
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 choixAnimateur=sc.nextInt();
	    		 
	    		 switch(choixAnimateur) {
	    		 case 0: menu();break;
	    		 case 1: ajouterAnimateur();break;
	    		 case 2: modifierAnimateur();break;
	    		 case 3: supprimerAnimateur();break;
	    		 case 4: listerAnimateur();break;
	    		 default: System.out.println("\nCHOIX INVALID");break;
	    		 }
	    	 }while(choixAnimateur!=0);
	     }
	     
	     
	     public static boolean validateJavaDate(String strDate)
	     {
	    	    	    	   
	    	 
		  	if (strDate.trim().equals("") )
			  	{
			  	    return true;
			  	}
			  	
		  	else
		  	{
		  	    
		  	    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		  	    format.setLenient(false);
		  	   
		  	    try
			  	    {
			  	        @SuppressWarnings("unused")
						Date javaDate = format.parse(strDate); 
				  	        
			  	    }
		  	 
		  	    catch (ParseException e)
			  	    {
			  	        System.err.println(" La date : "+ strDate +" est invalid ");
			  	        return false;
			  	    }
		  	  
		  	    return true;
		  	 }
	     }
	     
	   
	     public void ajouterAnimateur()
	     {
	    	 int length = 8,cin=0,tel=0,codePostale=0;
	    	 String date,adresse,choix;
	    	 
	    	 do {
		    	 System.out.println("\nVeuillez saisir les informations d'un nouveau Animateur : \n");
		    	 System.out.print("Nom : ");
		    	 String nom = sc.next().toUpperCase();
		    	 sc.nextLine();
		    	 
		    	 System.out.print("Prenom : ");
		    	 String prenom = sc.next().toUpperCase();	 
		  	     sc.nextLine();
		    	 
		    	 System.out.print("Adresse : ");
		    	 adresse = sc.nextLine().toUpperCase();
		    	 
		    	 Boolean a ;
		    	 
		    	 do {
		    		System.out.print("Telephone : "); 
		    	    if(a=sc.hasNextInt()) {
		    			 
				    	 do {	    		 
						    	 tel = sc.nextInt();			    	 	 
						    	 length = String.valueOf(tel).length();
						    	 if(length != 8) {
						    		 System.err.println("Numero de telephone doit contenire 8 chiffre ");
						    	 }
					    	 
					    	 }while(length != 8);
			    	  }else {
			    		  System.err.println("Saisie invalid le numero de telephone doit contenire 8 chiffres");
			    	  }
			    	 sc.nextLine();}while(!a);
			    	 
		    	 do {
			    	 System.out.print("Date Naissance (jj/mm/aaaa) : ");
			    	 date = sc.next();
			    	 
		    	 }while(!validateJavaDate(date));
		    	 
		    	 System.out.print("Prenom Pere : ");
		    	 String prenomPere = sc.next().toUpperCase();
		    	 
		    	 System.out.print("Ville : ");
		    	 String ville = sc.next().toUpperCase();
		    	 sc.nextLine();
		    	 
		    	 do {
		    		System.out.print("Code Postale : "); 
		    	    if(a=sc.hasNextInt()) {
					    	 do {
					    	 
					    	 codePostale = sc.nextInt();
					    	 length = String.valueOf(codePostale).length();
					    	 if(length != 4) {
					    		 System.err.println("Code Posatle doit contenire 4 chiffres ");
					    	 }
					    	 }while(length != 4);
		    	      }else {
		    		  System.err.println("Saisie invalid le code Posatle doit contenire 4 chiffres");
		    	  }
			    	 sc.nextLine();}while(!a);
		    	 
		    	 System.out.print("Gouvernorat : ");
		    	 String gouvernorat = sc.nextLine().toUpperCase();
		    	 
		    	 do {
			    		System.out.print("CIN : "); 
			    	    if(a=sc.hasNextInt()) {
				    	 do {			    	 
				    	 cin = sc.nextInt();
				    	 length = String.valueOf(cin).length();
				    	 if(length != 8) {
				    		 System.err.println("Numero de CIN doit contenire 8 chiffres ");
				    	 }
				    	 }while(length != 8);
		    	    }else {
		    		  System.err.println("Saisie invalid le cin doit contenire 8 chiffres");
		    	    }
				    	 sc.nextLine();}while(!a);
		    	 	    	     	 
		    	 Animateur A = new Animateur(nom, prenom, adresse, date, prenomPere,ville,codePostale,gouvernorat, tel,cin);
		    	 this.listeAnimateur.add(A);
		    	 this.listeAnimateur.toArray();
		    	 
		    	 System.out.println("\nAnimateur ajouté avec succés........\n");
		    	 do {
			    	 System.out.print("\nVoulez vous ajouter un autre animateur ? (Y/N) ");
		
			    	 choix = sc.next().toUpperCase();
			    	 if(choix.contentEquals("N")) {
			    		 GestionAnimateur();
			    	 }
			    	 if(!choix.contentEquals("Y") && !choix.contentEquals("N")) {
			    		 System.err.println("Saisie Invalid!");
			    	 }
			     }while(!choix.contentEquals("Y") && !choix.contentEquals("N"));

	    	 }while(!choix.contentEquals("N"));
 
	     }
	     
	     
	     public void modifierAnimateur()
	     {
	    	 
	    	 int elementmodifier = 0;
	    	 
	    	 do {
	    		 System.out.println("\nVeuillez choisire l'élèment à modifier : ");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - nom");
	    		 System.out.println("\n\t 2 - prenom");
	    		 System.out.println("\n\t 3 - cin");
	    		 System.out.println("\n\t 4 - adresse");
	    		 System.out.println("\n\t 5 - tel");
	    		 System.out.println("\n\t 6 - date");
	    		 System.out.println("\n\t 7 - prenomPere");
	    		 System.out.println("\n\t 8 - gouvernorat");
	    		 System.out.println("\n\t 9 - telephone");
	    		 System.out.println("\n\t 10 - code postale");
	    		 
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 elementmodifier=sc.nextInt();
	    		 
	    		 switch(elementmodifier) {
	    		 case 0: menu();break;
	    		 case 1: AnimateurupdateNom() ;break;
	    		 case 2: AnimateurupdatePrenom();break;
	    		 case 3: AnimateurupdateCin();break;
	    		 case 4: AnimateurupdateAdresse();break;
	    		 case 5: AnimateurupdateTel();break;
	    		 case 6: AnimateurupdateDate();break;
	    		 case 7: AnimateurupdatePrenomPere();break;
	    		 case 8: AnimateurupdateGouvernorat();break;
	    		 case 9: AnimateurupdateTel();break;
	    		 case 10: AnimateurupdateCodeP();break;
	    		 default: System.out.println("CHOIX INVALID");break;
	    		 }
	    	 }while(elementmodifier!=0);
	    	 
	    	 
	     }
	     
	     public void AnimateurupdateNom(){
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
	    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
	    		 choix = sc.next().toUpperCase();
	    		 if(choix.contentEquals("Y")) {
	    			 ajouterAnimateur();
	    		 }else {
	    			 if(choix.contentEquals("N"))
	    				 GestionAnimateur();
	    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
	    			 System.err.println("Saisie invalid");
	    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    		 
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("\nEntrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau nom : "); 
		    	 String Nom = sc.next().toUpperCase();
		    	 this.listeAnimateur.get(indice).setNom(Nom);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
		    	 
	     }
	     
	     public void AnimateurupdatePrenom(){
	    	 
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    		 
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau prenom : "); 
		    	 String Prenom = sc.next().toUpperCase();
		    	 this.listeAnimateur.get(indice).setPrenom(Prenom);;
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void AnimateurupdateAdresse(){
	    	 
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 sc.nextLine();
		    	 System.out.print("Saisie la nouvelle adresse : "); 
		    	 String Adresse = sc.nextLine().toUpperCase();
		    	 this.listeAnimateur.get(indice).setAdresse(Adresse);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void AnimateurupdateDate(){
	    	 String Date;	    	 
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 do {
		    	 System.out.print("Saisie la nouvelle date de naissance (jj/mm/aaaa) : "); 
		    	 Date = sc.next();}while(!validateJavaDate(Date));
		    	 this.listeAnimateur.get(indice).setDateNaissance(Date);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void AnimateurupdatePrenomPere(){
	    	 
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau prenom du pere : "); 
		    	 String PrenomPere = sc.next().toUpperCase();
		    	 this.listeAnimateur.get(indice).setPerePrenom(PrenomPere);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void AnimateurupdateVille(){
	    	 
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie la nouvelle ville : "); 
		    	 String Ville = sc.next().toUpperCase();
		    	 this.listeAnimateur.get(indice).setVille(Ville);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void AnimateurupdateCodeP(){
	    	 int Code,length;	    	 
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 do {
		    	 System.out.print("Saisie le nouveau code postale : "); 
		    	 Code = sc.nextInt();
		    	 length = String.valueOf(Code).length();
		    	 if (length != 4) {
		    		 System.err.println("Code Posatle doit contenire 4 chiffres ");
		    	 }}while(length != 4);
		    	 this.listeAnimateur.get(indice).setCodePostale(Code);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
	    	 
	     }
	     
	     
	     public void AnimateurupdateGouvernorat(){
	    	 
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 sc.nextLine();
		    	 System.out.print("Saisie la nouvelle gouvernorat : "); 
		    	 String Gouv = sc.nextLine().toUpperCase();
		    	 this.listeAnimateur.get(indice).setGouvernorat(Gouv);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
		    	 
	     }
	     
	     public void AnimateurupdateTel(){
	    	 int Tel,length;
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 do {
		    	 System.out.print("Saisie le nouveau numero de telephone : "); 
		    	 Tel = sc.nextInt();
		    	 length = String.valueOf(Tel).length();
		    	 if(length != 8) {
		    		 System.err.println("Numero de telephone doit centenire 8 chiffres");
		    	 }}while(length != 8);
		    	 this.listeAnimateur.get(indice).setTelephone(Tel);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void AnimateurupdateCin(){
	    	 int Cin,length;
	    	 String choix;
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 if(listeAnimateur.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un animateur!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterAnimateur();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionAnimateur();
		    		 }if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'animateur à modifier : ");
		    	 System.out.print("Entrer l'indice du l'animateur : ");
		    	 int indice = sc.nextInt();
		    	 do {
		    	 System.out.print("Saisie la nouvelle cin : "); 
		    	 Cin = sc.nextInt();
		    	 length = String.valueOf(Cin).length();
		    	 if(length !=8) {
		    		 System.err.println("Numero de cin doit centenir 8 chiffres");
		    	 }}while(length != 8);
		    	 this.listeAnimateur.get(indice).setCin(Cin);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Animateur)listeAnimateur.get(indice));
		    	 System.out.println("\nAnimateur modifier avec success......");
		    	 }
	    	 
	     }
	     

	     
	     public void supprimerAnimateur()
	     {
	    	 String choix ;
	    	 System.out.println("\nChoisire l'animateur à supprimer : ");
	    	 for (int i=0;i<this.listeAnimateur.size();i++)
	    		 System.out.println(i +"- "+listeAnimateur.get(i).getNom()+" "+listeAnimateur.get(i).getPrenom());
	    	 System.out.print("Entrer l'indice de l'animateur : ");
	    	 int indice = sc.nextInt();
	    	 do {
	    	 System.out.print("Etes vous sure de vouloir supprimer cette animateur ? (Y/N) ");
	    	 choix = sc.next().toUpperCase();
	    	 if(choix.contentEquals("Y")) {
	    	 this.listeAnimateur.remove(indice);
	    	 System.out.println("\nAnimateur supprimer avec success....");
	    	 }else {
	    		 if(choix.contentEquals("N"))
	    			 GestionAnimateur();
	    	 }
	    	 if(!choix.contentEquals("Y") && !choix.contentEquals("N"))
	    		 System.err.println("Saisie Invalid");
	    	 }while(!choix.contentEquals("Y") && !choix.contentEquals("N"));
	    	
	     }
	     
	     public void listerAnimateur()
	     {
	    	 System.out.println("\nListe des Animateurs : \n");
	    	 for (int i=0 ; i<this.listeAnimateur.size() ; i++) {
	    		 System.out.println(i +"- "+(Animateur)listeAnimateur.get(i));
	    	     
	    	     }
	     }

	     public void GestionEleve()
	     {
	    	 
	    	 int choixEleve = 0;
	    	 
	    	 do {
	    		 System.out.println("\n************** BIENVENU AU MENU GESTION DES ELEVE *************");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - Ajouter");
	    		 System.out.println("\n\t 2 - Modifier");
	    		 System.out.println("\n\t 3 - Supprimer");
	    		 System.out.println("\n\t 4 - Lister \n");
	    		 
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 choixEleve=sc.nextInt();
	    		 
	    		 switch(choixEleve) {
	    		 case 0: menu();break;
	    		 case 1: ajouterEleve();break;
	    		 case 2: modifierEleve();break;
	    		 case 3: supprimerEleve();break;
	    		 case 4: listerEleve();break;
	    		 default: System.out.println("CHOIX INVALID");break;
	    		 }
	    	 }while(choixEleve!=0);
	    	 
	     }
	     
    	 public void ajouterEleve()
	     {
    		 int length,cinPere=0,telPere=0,codePostale=0;
    		 int niveauScolaire;
    		 String date,adresse,choix;
    		 int[] niveau= {1,2,3,4,5,6};
    		 Boolean a ;
    		 
    		 do {
		    	 System.out.println("\nVeuillez saisir les informations d'un nouveau Eleve : \n");
		     	 System.out.print("Nom : ");
		    	 String nom = sc.next().toUpperCase();
		    	 sc.nextLine();
		    	 
		    	 System.out.print("Prenom : ");
		    	 String prenom = sc.next().toUpperCase();	 
		  	     sc.nextLine();
		    	 
		    	 System.out.print("Adresse : ");
		    	 adresse = sc.nextLine().toUpperCase();
	
		    	 do {
			    	 System.out.print("Date Naissance (jj/mm/aaaa) : ");
			    	 date = sc.next();
			    	 
		    	 }while(!validateJavaDate(date));
		    	 
		    	 System.out.print("Prenom Pere : ");
		    	 String prenomPere = sc.next().toUpperCase();
		    	 
		    	 System.out.print("Ville : ");
		    	 String ville = sc.next().toUpperCase();
		    	 sc.nextLine();
		    	 
		    	 do {
			    		System.out.print("Code Postale : "); 
			    	    if(a=sc.hasNextInt()) {
						    	 do {
						    	 
						    	 codePostale = sc.nextInt();
						    	 length = String.valueOf(codePostale).length();
						    	 if(length != 4) {
						    		 System.err.println("Code Posatle doit contenire 4 chiffres ");
						    	 }
						    	 }while(length != 4);
			    	      }else {
			    		  System.err.println("Saisie invalid le code Posatle doit contenire 4 chiffres");
			    	  }
				    	 sc.nextLine();}while(!a);
		    	 
		    	 System.out.print("Gouvernorat : ");
		    	 String gouvernorat = sc.nextLine().toUpperCase();
		    	 
		    	 System.out.print("Prenom GrandPere : ");
		    	 String prenomGrandpere = sc.next().toUpperCase();
		    	 
		    	 System.out.print("Nom Mere: ");
		    	 String nomMere = sc.next().toUpperCase();
		    	 
		    	 System.out.print("Prenom Mere : ");
		    	 String prenomMere = sc.next().toUpperCase();
		    	 sc.nextLine();
		    	 
		    	 do {
			    		System.out.print("CIN Pere : "); 
			    	    if(a=sc.hasNextInt()) {
				    	 do {			    	 
			    		 cinPere = sc.nextInt();
				    	 length = String.valueOf(cinPere).length();
				    	 if(length != 8) {
				    		 System.err.println("Numero de CIN doit contenire 8 chiffres ");
				    	 }
				    	 }while(length != 8);
		    	    }else {
		    		  System.err.println("Saisie invalid le cin doit contenire 8 chiffres");
		    	    }
				    	 sc.nextLine();}while(!a);
		    	 
		    	 do {
			    		System.out.print("Telpere : "); 
			    	    if(a=sc.hasNextInt()) {
			    			 
					    	 do {	    		 
					    		 telPere = sc.nextInt();			    	 	 
							    	 length = String.valueOf(telPere).length();
							    	 if(length != 8) {
							    		 System.err.println("Numero de telephone doit contenire 8 chiffre ");
							    	 }
						    	 
						    	 }while(length != 8);
				    	  }else {
				    		  System.err.println("Saisie invalid le numero de telephone doit contenire 8 chiffres");
				    	  }
				    	 sc.nextLine();}while(!a);
		    	 
		    	 do {
			    	 System.out.print("Niveau Scolaire (Niveau 1 - Niveau 2 - Niveau 3 ) : ");
			    	 niveauScolaire = sc.nextInt();
			    	 if(niveauScolaire != niveau[0] && niveauScolaire != niveau[1] && niveauScolaire != niveau[2] &&
			    			 niveauScolaire != niveau[3] && niveauScolaire != niveau[4] && niveauScolaire != niveau[5]) {
			    		 System.err.println("Saisie Invalide");
		
			    	    }
			    	 	    	 
		    	 }while(niveauScolaire != niveau[0] && niveauScolaire != niveau[1] && niveauScolaire != niveau[2] &&
		    			 niveauScolaire != niveau[3] && niveauScolaire != niveau[4] && niveauScolaire != niveau[5]);
		    	 
		    	 
		    	 Eleve E = new Eleve (nom, prenom, adresse, date, prenomPere,ville, codePostale ,gouvernorat,
		    			 prenomGrandpere,nomMere,prenomMere,cinPere,telPere,niveauScolaire);
		    	 this.listeEleve.add(E);
		    	 System.out.println("\nEleve ajouté avec succés........\n");
		    	 do {
			    	 System.out.print("\nVoulez vous ajouter un autre éleve ? (Y/N) ");
	
			    	 choix = sc.next().toUpperCase();
			    	 if(choix.contentEquals("N")) {
			    		 GestionEleve();
			    	 }
			    	 if(!choix.contentEquals("Y") && !choix.contentEquals("N")) {
			    		 System.err.println("Saisie Invalid!");
			    	 }
			      }while(!choix.contentEquals("Y") && !choix.contentEquals("N"));

		    }while(!choix.contentEquals("N"));
	     }
    	 
    	 public void modifierEleve()
	     {
    		 	int elementmodifier = 0;
	    	 
	    	 do {
	    		 System.out.println("\nVeuillez choisire l'élèment à modifier : ");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - nom");
	    		 System.out.println("\n\t 2 - prenom");
	    		 System.out.println("\n\t 3 - date de naissance ");
	    		 System.out.println("\n\t 4 - adresse");
	    		 System.out.println("\n\t 5 - prenom de la mere ");
	    		 System.out.println("\n\t 6 - nom de la mere");
	    		 System.out.println("\n\t 7 - prenom du Pere");
	    		 System.out.println("\n\t 8 - gouvernorat");
	    		 System.out.println("\n\t 9 - telephone du pere");
	    		 System.out.println("\n\t 10 - cin du pere ");
	    		 System.out.println("\n\t 11 - prenom de grand pere ");
	    		 System.out.println("\n\t 12 - niveau scolaire ");
	    		 System.out.println("\n\t 13 - ville ");
	    		 System.out.println("\n\t 14 - code postale ");
	    		 
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 elementmodifier=sc.nextInt();
	    		 
	    		 switch(elementmodifier) {
	    		 case 0: menu();break;
	    		 case 1: EleveupdateNom() ;break;
	    		 case 2: EleveupdatePrenom();break;
	    		 case 3: EleveupdateDate();break;
	    		 case 4: EleveupdateAdresse();break;
	    		 case 5: EleveupdatePrenomMere();break;
	    		 case 6: EleveupdateNomMere();break;
	    		 case 7: EleveupdatePrenomPere();break;
	    		 case 8: EleveupdateGouvernorat();break;
	    		 case 9: EleveupdateTelPere();break;
	    		 case 10: EleveupdateCinPere();break;
	    		 case 11: EleveupdatePrenomGrandP();break;
	    		 case 12: EleveupdateNiveauScolaire();break;
	    		 case 13: EleveupdateVille();break;
	    		 case 14: EleveupdateCodeP();break;
	    		 default: System.out.println("CHOIX INVALID");break;
	    		 }
	    	 }while(elementmodifier!=0);
	    	 
	     }
    	 
    	 public void EleveupdateNom(){
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
	    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
	    		 choix = sc.next().toUpperCase();
	    		 if(choix.contentEquals("Y")) {
	    			 ajouterEleve();
	    		 }else {
	    			 if(choix.contentEquals("N"))
	    				 GestionEleve();
	    		 }
	    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
	    			 System.err.println("Saisie invalid");
	    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    			
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau nom : "); 
		    	 String Nom = sc.next().toUpperCase();
		    	 this.listeEleve.get(indice).setNom(Nom);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdatePrenom(){
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau prenom : "); 
		    	 String Prenom = sc.next().toUpperCase();
		    	 this.listeEleve.get(indice).setPrenom(Prenom);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdateAdresse(){
	    	 String Adresse;
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 sc.nextLine();
		    	 System.out.print("Saisie la nouvelle adresse : "); 
		    	 Adresse = sc.nextLine().toUpperCase();
		    	 this.listeEleve.get(indice).setAdresse(Adresse);
		    	 System.out.print("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdateDate(){
	    	 String Date;
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
			    	 do {
			    	 System.out.print("Saisie la nouvelle date de naissance : "); 
			    	 Date = sc.next();}while(!validateJavaDate(Date));
		    	 this.listeEleve.get(indice).setDateNaissance(Date);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdatePrenomPere(){
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 System.out.println("Saisie le nouveau prenom du pere : "); 
		    	 String PrenomPere = sc.next().toUpperCase();
		    	 this.listeEleve.get(indice).setPerePrenom(PrenomPere);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdateVille(){
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 System.out.println("Saisie la nouvelle ville : "); 
		    	 String Ville = sc.next().toUpperCase();
		    	 this.listeEleve.get(indice).setVille(Ville);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
		    	 
	     }
	     
	     public void EleveupdateCodeP(){
	    	 int Code,length;
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
			    	 do {
			    	 System.out.println("Saisie le nouveau code postale : "); 
			    	 Code = sc.nextInt();
			    	 length = String.valueOf(Code).length();
			    	 if(length != 4) {
			    		 System.err.println("Le code postale doit contenire 4 chiffres ");
			    	 }}while(length != 4);
		    	 this.listeEleve.get(indice).setCodePostale(Code);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     
	     public void EleveupdateGouvernorat(){
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 sc.nextLine();
		    	 System.out.print("Saisie la nouvelle gouvernorat : "); 
		    	 String Gouv = sc.nextLine().toUpperCase();
		    	 this.listeEleve.get(indice).setGouvernorat(Gouv);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdatePrenomMere(){
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 System.out.println("Saisie le nouveau prenom de la mere : "); 
		    	 String prenom = sc.next();
		    	 this.listeEleve.get(indice).setPrenomMere(prenom);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdateTelPere(){
	    	 int tel,length;
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
			    	 do {
			    	 System.out.print("Saisie le nouveau telephone du pere : "); 
			    	 tel = sc.nextInt();
			    	 length = String.valueOf(tel).length();
			    	 if(length != 8) {
			    		 System.err.println("Le numero de telephone doit contenire 8 chiffres ");
			    	 }}while(length != 8);
		    	 this.listeEleve.get(indice).setTelPere(tel);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdateCinPere(){
	    	 int cin,length;
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
			    	 do {
			    	 System.out.print("Saisie le nouveau numero de cin du pere : "); 
			    	 cin = sc.nextInt();
			    	 length = String.valueOf(cin).length();
			    	 if(length != 8) {
			    		 System.err.println("Le numero de cin doit contenire 8 chiffres ");
			    	 }}while(length != 8);
		    	 this.listeEleve.get(indice).setCINPere(cin);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
	     public void EleveupdatePrenomGrandP(){
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau prenom du grand pere : "); 
		    	 String prenom = sc.next();
		    	 this.listeEleve.get(indice).setPrenomGrandPere(prenom);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
		    	 
	     }
	     
	     public void EleveupdateNiveauScolaire(){
	    	 int niveauScolaire,indice;
	    	 int[] niveau= {1,2,3};
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
	    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
	    	 System.out.print("Entrer l'indice du l'eleve : ");
	    	 indice = sc.nextInt();
	    			 do {
	    		    	 System.out.print("Saisie le nouveau niveau scolaire (Niveau 1/2/3) : ");
	    		    	 niveauScolaire = sc.nextInt();
	    		    	 if(niveauScolaire != niveau[0] && niveauScolaire != niveau[1] && niveauScolaire != niveau[2]) {
	    		    		 System.err.println("Saisie Invalide");
	    	
	    		    	    }
	    		    	 	    	 
	    	    	 }while(niveauScolaire != niveau[0] && niveauScolaire != niveau[1] && niveauScolaire != niveau[2]);
			 System.out.println("La nouvelle liste apres modification : ");
	    	 System.out.println((Eleve)listeEleve.get(indice));
	    	 System.out.println("\nEleve modifier avec success......");
	    	 }

	     }
	     
	     public void EleveupdateNomMere(){
	    	 String choix;
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 if(listeEleve.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter un eleve!! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterEleve();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionEleve();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire l'eleve à modifier : ");
		    	 System.out.print("Entrer l'indice du l'eleve : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau nom de la mere : "); 
		    	 String nom = sc.next();
		    	 this.listeEleve.get(indice).setNomMere(nom);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Eleve)listeEleve.get(indice));
		    	 System.out.println("\nEleve modifier avec success......");
		    	 }
	    	 
	     }
	     
    	 
    	 
	     public void supprimerEleve()
	     {
	    	 String choix ;
	    	 System.out.println("\nChoisire l'éleve à supprimer : ");
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom()+" "+listeEleve.get(i).getPrenom());
	    	 System.out.print("Entrer l'indice de l'éleve : ");
	    	 int indice = sc.nextInt();
	    	 do {
	    	 System.out.print("Etes vous sure de vouloir supprimer cette éleve ? (Y/N) ");
	    	 choix = sc.next().toUpperCase();
	    	 if(choix.contentEquals("Y")) {
	    	 this.listeEleve.remove(indice);
	    	 System.out.println("\nEleve supprimer avec success....");
	    	 }else {
	    		 if(choix.contentEquals("N"))
	    			 GestionEleve();
	    	 }
	    	 if(!choix.contentEquals("Y") && !choix.contentEquals("N"))
	    		 System.err.println("Saisie Invalid");
	    	 }while(!choix.contentEquals("Y") && !choix.contentEquals("N"));
	    	 
	     }
	     
	     
	     public void listerEleve()
	     {
	    	 System.out.println("\nLa Liste des Eleves : \n");
	    	 for (int i=0;i<this.listeEleve.size();i++)
	    		 System.out.println(i + " - " +(Eleve)listeEleve.get(i));   	     
	     }
	     
	     
	     public void GestionClasse()
	     {

	    	 int choixClasse = 0;
	    	 
	    	 do {
	    		 System.out.println("\n************** BIENVENU AU MENU GESTION DES CLASSES *************");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - Ajouter");
	    		 System.out.println("\n\t 2 - Modifier");
	    		 System.out.println("\n\t 3 - Supprimer");
	    		 System.out.println("\n\t 4 - Liste d'éleves par classe ");
	    		 System.out.println("\n\t 5 - Liste d'activites par classe ");
	    		 System.out.println("\n\t 6 - Lister ");
	    		 
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 choixClasse=sc.nextInt();
	    		 
	    		 switch(choixClasse) {
	    		 case 0: menu();break;
	    		 case 1: ajouterClasse();break;
	    		 case 2: modifierClasse();break;
	    		 case 3: supprimerClasse();break;
	    		 case 4: AjouterEleveClasse();break;
	    		 case 5: AjouterActiviteClasse();break;
	    		 case 6: listerClasse();break;
	    		 default: System.out.println("\nCHOIX INVALID");break;
	    		 }
	    	 }while(choixClasse!=0);
	    	 
	     }
	     
	     public void ajouterClasse()
	     {
	    	 String choix;
	    	 
	    	 do {
		    	 System.out.println("\nVeuillez saisir les informations d'un nouveau Classe : \n");
		    	 
		    	 System.out.print("Nom de la classe : ");
		    	 String nom = sc.next();
	
		    	 System.out.print("Nom animateur responsable : ");
		    	 String animateurresp = sc.next().toUpperCase();
		    	 
		    	 Classe C = new Classe(nom,animateurresp, null, null);
		    	 this.listeClasse.add(C);
		    	 System.out.println("\nClasse ajouté avec succés........\n");
		    	 
		    	 do {
			    	 System.out.print("\nVoulez vous ajouter une autre classe ? (Y/N) ");
	
			    	 choix = sc.next().toUpperCase();
			    	 if(choix.contentEquals("N")) {
			    		 GestionClasse();
			    	 }
			    	 if(!choix.contentEquals("Y") && !choix.contentEquals("N")) {
			    		 System.err.println("Saisie Invalid!");
			    	 }
			     }while(!choix.contentEquals("Y") && !choix.contentEquals("N"));

		    }while(!choix.contentEquals("N"));
	     }
	     
    	 
    	 public void modifierClasse()
	     {
	    	 int choixClasse = 0;
	    	 
	    	 do {
	    		 System.out.println("\n************** BIENVENU AU MENU GESTION DES CLASSES *************");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - Nom ");
	    		 System.out.println("\n\t 2 - Animateur respensable ");	   
	    		 
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 choixClasse=sc.nextInt();
	    		 
	    		 switch(choixClasse) {
	    		 case 0: menu();break;
	    		 case 1: updateClasseNom();break;
	    		 case 2: updateClasseAnimateur();break;
	    		 default: System.out.println("\nCHOIX INVALID");break;
	    		 }
	    	 }while(choixClasse!=0);
    	     		 	    	 
	     }
    	 
    	 public void updateClasseNom() {
    		 
    		 String choix;		 
	    	 for (int i=0;i<this.listeClasse.size();i++)
	    		 System.out.println(i +"- "+listeClasse.get(i).getNom());
	    	 if(listeClasse.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter une classe! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter une nouvelle classe ?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterClasse();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionClasse();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
	    		 System.out.println("\nVeuillez choisire la classe à modifier : ");
		    	 System.out.print("Entrer l'indice de la classe : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau nom : "); 
		    	 String Nom = sc.next().toUpperCase();
		    	 this.listeClasse.get(indice).setNom(Nom);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Classe)listeClasse.get(indice));
		    	 System.out.println("\nClasse modifier avec success......");
		    	 }
	    		 
    	 }
    	 
    	 public void updateClasseAnimateur() {
    		 
    		 String choix;		 
	    	 for (int i=0;i<this.listeClasse.size();i++)
	    		 System.out.println(i +"- "+listeClasse.get(i).getNom());
	    	 if(listeClasse.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter une classe! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter une nouvelle classe ?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterClasse();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionClasse();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.println("\nVeuillez choisire la classe à modifier : ");
		    	 System.out.print("Entrer l'indice de la classe : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie le nouveau animateur respensable : "); 
		    	 String Animateur = sc.next().toUpperCase();
		    	 this.listeClasse.get(indice).setAnimateurresp(Animateur);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Classe)listeClasse.get(indice));
		    	 System.out.println("\nClasse modifier avec success......");
		    	 }
		    	 
    	 }
    	 
    	 
	     public void supprimerClasse()
	     {
	    	 String choix ;
	    	 System.out.println("\nChoisire la classe à supprimer : ");
	    	 for (int i=0;i<this.listeClasse.size();i++)
	    		 System.out.println(i +"- "+listeClasse.get(i).getNom());
	    	 System.out.print("Entrer l'indice de la classe : ");
	    	 int indice = sc.nextInt();
	    	 do {
	    	 System.out.print("Etes vous sure de vouloir supprimer cette classe ? (Y/N) ");
	    	 choix = sc.next().toUpperCase();
	    	 if(choix.contentEquals("Y")) {
	    	 this.listeClasse.remove(indice);
	    	 System.out.println("\nClasse supprimer avec success....");
	    	 }else {
	    		 if(choix.contentEquals("N"))
	    			 GestionClasse();
	    	 }
	    	 if(!choix.contentEquals("Y") && !choix.contentEquals("N"))
	    		 System.err.println("Saisie Invalid");
	    	 }while(!choix.contentEquals("Y") && !choix.contentEquals("N"));
	    	 
	     }
	     
	     public void AjouterEleveClasse() {
	    	 
	    	 String choix ;    	     
	    	 
    		 System.out.println("\nVeuillez choisire la classe a lister : ");
	    	 for (int i=0;i<this.listeClasse.size();i++)
	    		 System.out.println(i +"- "+listeClasse.get(i).getNom());
	    	 System.out.print("\n\tEntrer l'indice de la classe : ");
	    	 int indice = sc.nextInt();
	    	 System.out.println("\n  Liste d'éleves : "); 
	    	 for (int i=0;i<this.listeEleve.size();i++) {
	    		 System.out.println(i +"- "+listeEleve.get(i).getNom() + " " +listeEleve.get(i).getPrenom()
	    				 + " / NiveauScolaire "+listeEleve.get(i).getNiveauScolaire());		    		 		    		 
	    	 }
	    	 System.out.print("\n\tEntrer l'indice de l'éleve a ajouter : ");
	    	 int ind = sc.nextInt();
	    	 
	    	 listeClasse.get(indice).listeelève.add(0, listeEleve.get(ind).getNom()+" "+listeEleve.get(ind).getPrenom());
	    	 for (int i=0;i<this.listeClasse.size();i++)
	    		 System.out.println(i +"- "+listeClasse.get(i).getListeelève());
	    	 
	    	 System.out.println("\nL'éleve " + listeEleve.get(ind).getNom()+
	    			 " est ajouter a la classe "+listeClasse.get(indice).getNom()+" avec success.....");
	    	 
	    	 System.out.print("\nVoulez vous ajouter un autre éleve ? (Y/N) : ");
	    	 choix = sc.next().toUpperCase();
	    	 
	    	 if(choix.contentEquals("Y")) {
	    		 AjouterEleveClasse();
	    	 }
	    	
	   	 	     if(choix.contentEquals("N")) {
	   	 	    	 menu();
	   	 	     };	    	 	    
	     }
	     
	     
	     public void AjouterActiviteClasse() {
	    	 
	    	 String choix ;    	     
	    	 
    		 System.out.println("\nVeuillez choisire la classe a lister : ");
	    	 for (int i=0; i<listeClasse.size(); i++)
	    		 System.out.println(i +"- "+listeClasse.get(i).getNom());
	    	 System.out.print("\n\tEntrer l'indice de la classe : ");
	    	 int indice = sc.nextInt();
	    	 System.out.println("  Liste d'activité : "); 
	    	 for (int i=0; i<listeActivite.size(); i++) {
	    		 System.out.println(i +"- "+listeActivite.get(i).getDesignation() +
	    				 " animer par " + listeActivite.get(i).getAnimateurresp());		    		 		    		 
	    	 }
	    	 System.out.print("\n\tEntrer l'indice de l'activite a ajouter : ");
	    	 int ind = sc.nextInt();
	         
	    	 listeClasse.get(indice).listeactivité.add(0, listeActivite.get(ind).getDesignation()+
	    			 "--> Animateur: "+listeActivite.get(ind).getAnimateurresp());
	    	 
	    	 for (int i=0; i<listeClasse.size(); i++)
	    		 System.out.println("Classe "+listeClasse.get(i).getNom() +": "+listeClasse.get(i).getListeactivité());
	    	 
	    	 System.out.println("\nL'activité " + listeActivite.get(ind).getDesignation()+
	    			 " est ajouter a la classe "+listeClasse.get(indice).getNom()+" avec success.....");
	    	 
	    	 System.out.print("\nVoulez vous ajouter une autre activité ? (Y/N) : ");
	    	 choix = sc.next().toUpperCase();
	    	 
	    	 if(choix.contentEquals("Y")) {
	    		 AjouterActiviteClasse();
	    	 }
	    	
	   	 	     if(choix.contentEquals("N")) {
	   	 	    	 menu();
	   	 	     };
	    	 
	     }
	     
	     public void listerClasse()
	     
	     {
	    	 System.out.println("\nListe des Classe : \n");
	    	 for (int i=0;i<this.listeClasse.size();i++)
	    		 System.out.println((Classe)listeClasse.get(i));
	     }
	     
	     
	     public void GestionActivite_Cours()
	     {

	    	 int choixActivite = 0;
	    	 
	    	 do {
	    		 System.out.println("\n************** BIENVENU AU MENU GESTION DES ACTIVITE/COURS *************");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - Ajouter");
	    		 System.out.println("\n\t 2 - Modifier");
	    		 System.out.println("\n\t 3 - Supprimer");
	    		 System.out.println("\n\t 4 - Lister");
	    		 
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 choixActivite=sc.nextInt();
	    		 
	    		 switch(choixActivite) {
	    		 case 0: menu();break;
	    		 case 1: ajouterActivite();break;
	    		 case 2: modifierActivite();break;
	    		 case 3: supprimerActivite();break;
	    		 case 4: listerActivite();break;
	    		 default: System.out.println("\nCHOIX INVALID");break;
	    		 }
	    	 }while(choixActivite!=0);
	    	 
	     }
	     
	     public void ajouterActivite()
	     {
	    	 int code=1;
	    	 String choix;
	    	 
	    	 do {
		    	 System.out.println("\nVeuillez saisir les informations d'une nouvelle Activite : \n");
		    	 System.out.println("Id : (auto increment) ");
		    	 for (int i=0;i<this.listeActivite.size();i++) {
		    		  if(this.listeActivite.size()>0) {
		    			  this.listeActivite.get(i).setCode(code++);}}
		    		 
		    	 
		    	 System.out.print("Designation : ");
		    	 String designation = sc.next().toUpperCase();
		    	 
		    	 System.out.print("Animateur Responsable : ");
		    	 String animateurresp = sc.next().toUpperCase();
		    	 
		    	 
		    	 Activité A = new Activité(code,designation,animateurresp);
		    	 this.listeActivite.add(A);
		    	 System.out.println("\nActivite ajouté avec succés........\n");
		    	 do {
			    	 System.out.print("\nVoulez vous ajouter une autre activité ? (Y/N) ");
	
			    	 choix = sc.next().toUpperCase();
			    	 if(choix.contentEquals("N")) {
			    		 GestionActivite_Cours();
			    	 }
			    	 if(!choix.contentEquals("Y") && !choix.contentEquals("N")) {
			    		 System.err.println("Saisie Invalid!");
			    	 	}
			     }while(!choix.contentEquals("Y") && !choix.contentEquals("N"));

		     }while(!choix.contentEquals("N"));
	     }
    	 
    	 public void modifierActivite()
	     {
    		 	 int elementmodifier = 0;
	    	 
	    	 do {
	    		 System.out.println("\nVeuillez choisire l'élèment à modifier : ");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - designation");
	    		 System.out.println("\n\t 2 - animateur respensable ");
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 elementmodifier=sc.nextInt();
	    		 
	    		 switch(elementmodifier) {
	    		 case 0: menu();break;
	    		 case 1: AcitiviteupdateDesignation() ;break;
	    		 case 2: AcitiviteupdateAnimateurResp();break;
	    	
	    		 default: System.out.println("\nCHOIX INVALID");break;
	    		 }
	    	 }while(elementmodifier!=0);
    		 
	     }
    	 
    	 public void AcitiviteupdateDesignation() {
    		 
    		 String choix;
	    	 for (int i=0;i<this.listeActivite.size();i++)
	    		 System.out.println(i +"- "+listeActivite.get(i).getDesignation());
	    	 if(listeActivite.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter une activite! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter une nouvelle activite ?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterActivite();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionActivite_Cours();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
	    		 System.out.println("\nVeuillez choisire l'activite à modifier : ");
		    	 System.out.print("Entrer l'indice du l'activite : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie la nouvelle designation : "); 
		    	 String des = sc.next().toUpperCase();
		    	 this.listeActivite.get(indice).setDesignation(des);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Activité)listeActivite.get(indice));
		    	 System.out.println("\nActivité modifier avec success......");
		    	 }
	    		 
    	 }
    	 
    	 public void AcitiviteupdateAnimateurResp() {
    		 String choix;
	    	 for (int i=0;i<this.listeActivite.size();i++)
	    		 System.out.println(i +"- "+listeActivite.get(i).getAnimateurresp());
	    	 if(listeActivite.size() == 0) {
	    		 System.out.println("\nLa liste est vide veuillez ajouter une activite! ");
	    		 do {
		    		 System.out.print("\nVoulez-vous ajouter une nouvelle activite ?(Y/N)");
		    		 choix = sc.next().toUpperCase();
		    		 if(choix.contentEquals("Y")) {
		    			 ajouterActivite();
		    		 }else {
		    			 if(choix.contentEquals("N"))
		    				 GestionActivite_Cours();
		    		 }
		    		 if(!choix.contentEquals("Y")&& !choix.contentEquals("N"))
		    			 System.err.println("Saisie invalid");
		    		 }while(!choix.contentEquals("Y")&& !choix.contentEquals("N"));
	    	 }else {
		    	 System.out.print("Entrer l'indice du l'activite : ");
		    	 int indice = sc.nextInt();
		    	 System.out.print("Saisie e nouveau animateur respensable : "); 
		    	 String animateur = sc.next().toUpperCase();
		    	 this.listeActivite.get(indice).setAnimateurresp(animateur);
		    	 System.out.println("La nouvelle liste apres modification : ");
		    	 System.out.println((Activité)listeActivite.get(indice));
		    	 System.out.println("\nActivité modifier avec success......");
		    	 }
	    		 
    	 }
    	 
    	 
	     public void supprimerActivite()
	     {
	    	 String choix ;
	    	 System.out.println("\nChoisire l'activite à supprimer : ");
	    	 for (int i=0;i<this.listeActivite.size();i++)
	    		 System.out.println(i +"- "+listeActivite.get(i).getDesignation());
	    	 System.out.print("Entrer l'indice de l'activité : ");
	    	 int indice = sc.nextInt();
	    	 do {
	    	 System.out.print("Etes vous sure de vouloir supprimer cette activité ? (Y/N) ");
	    	 choix = sc.next().toUpperCase();
	    	 if(choix.contentEquals("Y")) {
	    	 this.listeActivite.remove(indice);
	    	 System.out.println("\nActivité supprimer avec success....");
	    	 }else {
	    		 if(choix.contentEquals("N"))
	    			 GestionActivite_Cours();
	    	 }
	    	 if(!choix.contentEquals("Y") && !choix.contentEquals("N"))
	    		 System.err.println("Saisie Invalid");
	    	 }while(!choix.contentEquals("Y") && !choix.contentEquals("N"));
	    	 
	     }
	     
	     public void listerActivite()
	     {
	    	 System.out.println("\nListe des Activite : \n");
	    	 for (int i=0;i<this.listeActivite.size();i++) {
	    		 if((this.listeActivite.get(i).getCode() - i == 1))
	    		 System.out.println(i+"- "+(Activité)listeActivite.get(i));
	    		 
		    	 if((this.listeActivite.get(i).getCode() - i == 2)) {
	  				  int inc = (this.listeActivite.get(i).getCode() - 1);
	  				  this.listeActivite.get(i).setCode(inc) ; 
	  				System.out.println(i+"- "+(Activité)listeActivite.get(i));}
		    	 }
	     
	     }
	    	 
	 	public void GestionPayment() {
	 		
	 		int elementmodifier = 0;
	    	 
	    	 do {
	    		 System.out.println("\nVeuillez choisire le mois : ");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - Septembre");
	    		 System.out.println("\n\t 2 - Octobre");
	    		 System.out.println("\n\t 3 - November");
	    		 System.out.println("\n\t 4 - December");
	    		 System.out.println("\n\t 5 - Janvier");
	    		 System.out.println("\n\t 6 - Fevrier");
	    		 System.out.println("\n\t 7 - Mars");
	    		 System.out.println("\n\t 8 - Avril");
	    		 System.out.println("\n\t 9 - Mai");
	    		 System.out.println("\n\t 10 - Juin");
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 elementmodifier=sc.nextInt();
	    		 
	    		 switch(elementmodifier) {
	    		 case 0: menu();break;
	    		 case 1:
	    			 String choix;
	    			 String[] argent = {"espece","cheque"};
	    			 System.out.println("\n\tAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    			 }
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice = sc.nextInt();	
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix = sc.next().toLowerCase();
	    			 if(choix != argent[0] && choix != argent[1]) {
	    				 System.err.println("\nChoix de mode de payment Invalide");
	    			 }
	    		 	 }while(!choix.equals(argent[0]) && !choix.equals(argent[1]));
	    			 payeeSep.add(listeEleve.get(indice).getNom() + " " + listeEleve.get(indice).getPrenom()+" : payement par "+choix);
	    			 System.out.println("\n"+payeeSep);	    			     			 
	    			 break;
	    		 case 2:	
	    			 String[] argent1 = {"espece","cheque"};
	    			 String choix1;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    			 }
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice1 = sc.nextInt();
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix1 = sc.next().toLowerCase();
	    		 	 }while(!choix1.equals(argent1[0]) && !choix1.equals(argent1[1]));
	    			 payeeOct.add(listeEleve.get(indice1).getNom() + " " + listeEleve.get(indice1).getPrenom()+" : payement par "+choix1);
	    			 System.out.println("\n"+payeeOct);
	    			 
	    			 break;
	    		 case 3:	
	    			 String[] argent2 = {"espece","cheque"};
	    			 String choix2;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice2 = sc.nextInt();
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix2 = sc.next().toLowerCase();
	    		 	 }while(!choix2.equals(argent2[0]) && !choix2.equals(argent2[1]));
	    			 payeeNov.add(listeEleve.get(indice2).getNom() + " " + listeEleve.get(indice2).getPrenom()+" : payement par "+choix2);
	    			 System.out.println("\n"+payeeNov);
	    			 }
	    			 break;
	    		 case 4:
	    			 String[] argent3 = {"espece","cheque"};
	    			 String choix3;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    			 }
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice3 = sc.nextInt();
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix3 = sc.next().toLowerCase();
	    		 	 }while(!choix3.equals(argent3[0]) && !choix3.equals(argent3[1]));
	    			 payeeDec.add(listeEleve.get(indice3).getNom() + " " + listeEleve.get(indice3).getPrenom()+" : payement par "+choix3);
	    			 System.out.println("\n"+payeeDec);
	    			 
	    			 break;
	    		 case 5:
	    			 String[] argent4 = {"espece","cheque"};
	    			 String choix4;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    			 }
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice4 = sc.nextInt();
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix4 = sc.next().toLowerCase();
	    		 	 }while(!choix4.equals(argent4[0]) && !choix4.equals(argent4[1]));
	    			 payeeJan.add(listeEleve.get(indice4).getNom() + " " + listeEleve.get(indice4).getPrenom()+" : payement par "+choix4);
	    			 System.out.println("\n"+payeeJan);
	    			 
	    			 break;
	    		 case 6:
	    			 String[] argent5 = {"espece","cheque"};
	    			 String choix5;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    			 }
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice5 = sc.nextInt();		
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix5 = sc.next().toLowerCase();
	    		 	 }while(!choix5.equals(argent5[0]) && !choix5.equals(argent5[1]));
	    			 payeeFev.add(listeEleve.get(indice5).getNom() + " " + listeEleve.get(indice5).getPrenom()+" : payement par "+choix5);
	    			 System.out.println("\n"+payeeFev);
	    			 
	    			 break;
	    		 case 7:
	    			 String[] argent6 = {"espece","cheque"};
	    			 String choix6;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    			 }
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice6 = sc.nextInt();	
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix6 = sc.next().toLowerCase();
	    		 	 }while(!choix6.equals(argent6[0]) && !choix6.equals(argent6[1]));
	    			 payeeMar.add(listeEleve.get(indice6).getNom() + " " + listeEleve.get(indice6).getPrenom()+" : payement par "+choix6);
	    			 System.out.println("\n"+payeeMar);
	    			 
	    			 break;
	    		 case 8:
	    			 String[] argent7 = {"espece","cheque"};
	    			 String choix7;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    			 }
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice7 = sc.nextInt();
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix7 = sc.next().toLowerCase();
	    		 	 }while(!choix7.equals(argent7[0]) && !choix7.equals(argent7[1]));
	    			 payeeAvr.add(listeEleve.get(indice7).getNom() + " " + listeEleve.get(indice7).getPrenom()+" : payement par "+choix7);
	    			 System.out.println("\n"+payeeAvr);
	    			 
	    			 break;
	    		 case 9:
	    			 String[] argent8 = {"espece","cheque"};
	    			 String choix8;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    			 }
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice8 = sc.nextInt();	
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix8 = sc.next().toLowerCase();
	    		 	 }while(!choix8.equals(argent8[0]) && !choix8.equals(argent8[1]));
	    			 payeeMai.add(listeEleve.get(indice8).getNom() + " " + listeEleve.get(indice8).getPrenom()+" : payement par "+choix8);
	    			 System.out.println("\n"+payeeMai);
	    			 
	    			 break;
	    		 case 10:
	    			 String[] argent9 = {"espece","cheque"};
	    			 String choix9;
	    			 System.out.println("\nAjouter payement : ");
	    			 for(int i=0; i<listeEleve.size(); i++) {
	    		 			System.out.println("\n" + i + " -" +listeEleve.get(i).getNom() + " " 
	    			                            + listeEleve.get(i).getPrenom());
	    		 			}
	    		 	 System.out.print("Choisir l'éleve correspendant :");		
	    		 	 int indice9 = sc.nextInt();	
	    		 	 do {
	    			 System.out.print("\nChoisir le mode de payement (par cheque / espece) :");
	    			 choix9 = sc.next().toLowerCase();
	    		 	 }while(!choix9.equals(argent9[0]) && !choix9.equals(argent9[1]));
	    			 payeeJui.add(listeEleve.get(indice9).getNom() + " " + listeEleve.get(indice9).getPrenom()+" : payement par "+choix9);
	    			 System.out.println("\n"+payeeJui);
	    			 
	    			 break;
	    	
	    		 default: System.out.println("\nCHOIX INVALID");break;
	    		 }
	    	 }while(elementmodifier!=0);
	 				
	 		}
	 		
	 	
	 	public void Statistique() {
	 		
	 		int choix = 0;
	    	 
	    	 do {
	    		 System.out.println("\n************** BIENVENU AU MENU GESTION DES STATISTIQUE *************");
	    		 System.out.println("\n\t 0 - Retour au menu principal");
	    		 System.out.println("\n\t 1 - Statistique personnes/activités/classe");
	    		 System.out.println("\n\t 2 - Statistique payement");
	    		 
	    		 System.out.print("\nTapez le numero correspondant à votre choix : ");
	    		 choix=sc.nextInt();
	    		 
	    		 switch(choix) {
	    		 case 0: menu();break;
	    		 case 1: 
	    			    System.out.println("\n  Le nombre totale des éléves     : ".toUpperCase()+listeEleve.size()); 
	    		 		System.out.println("\n  Le nombre totale des classes    : ".toUpperCase()+listeClasse.size()); 	
	    		 		System.out.println("\n  Le nombre totale des activités  : ".toUpperCase()+listeActivite.size());
	    		 		System.out.println("\n  Le nombre totale des animateurs : ".toUpperCase()+listeAnimateur.size());
	    		 		
	    			 break;
	    		 case 2: 
	    			 int p,a,b,pay;	    		
	    			 
	    			 System.out.print("\nSaisie le prix de payement : ");
	    			    pay = sc.nextInt();
	    			    
	    			    System.out.println("\n--> Totale payement par trimestre : ");
	    			    System.out.println("\n- Septembre / Octobre / November / Decembre ");
	    		 	    p = ( payeeSep.size() + payeeOct.size() + payeeNov.size() + payeeDec.size() ) * pay ;
	    		 	    System.out.println("\n   Total : " + p + " DT");
	    		 	    System.out.println("\n   Total/mois : " + ( p / 4 ) + " DT");
	    		 	    
	    		 	    System.out.println("\n- Janvier / Fevrier / Mars ");
	    		 	    a = ( payeeJan.size() + payeeFev.size() + payeeMar.size() ) * pay ;
	    		 	    System.out.println("\n   Total : " + a + " DT");
	    		 	    System.out.println("\n   Total/mois : " + ( a / 3 ) + " DT");
	    		 	    
	    		 	    System.out.println("\n- Avril / Mai / Juin ");
	    		 	    b = ( payeeJan.size() + payeeFev.size() + payeeMar.size() ) * pay ;
	    		 	    System.out.println("\n   Total : " + b + " DT");
	    		 	    System.out.println("\n   Total/mois : " + ( b / 3 ) + " DT");
	    		 	    
	    		 	    System.out.print("\n--> Total payement par ans : " + (a + b + p) + " DT\n");

	    			 break;
	    			 
	    			     			 
	    		 default: System.out.println("\nCHOIX INVALID");break;
	    		 }
	    	 }while(choix!=0);

	 	}

	public static void main(String[] args) {
		Directeur d = new Directeur();
		d.menu();
		
	}

}