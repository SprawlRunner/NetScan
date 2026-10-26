package netscan;
import java.util.Scanner;
import java.util.Arrays;
//import java.io.*;

/**
 * Menu console, lecture des arguments, orchestration générale. Ne fait aucun travail technique elle-même.
 * @author SprawlRunner
 * @date 26/10/2026
 */

public class NetScan {
    
    static void afficheMenu(){
        System.out.println(
        """
        ==============================
          NetScan - MENU PRINCIPAL
        ==============================
        Choisir le numéro d'une tâche
        1. Scanner une plage
        2. Scanner un hôte
        3. Inventaire
        4. Rapport
        5. Comparer
        0. Quitter
        """);
    }

    static void scannerPlage(){System.out.println("Pas encore implémenté");}
    static void scannerHote(){System.out.println("Pas encore implémenté");}
    static void afficherInventaire(){System.out.println("Pas encore implémenté");}
    static void exporterRapport(){System.out.println("Pas encore implémenté");}
    static void faireComparaison(){System.out.println("Pas encore implémenté");}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quitter = false;

        //affichage des paramètres via un tableau de string
        if(args.length>0){System.out.println(Arrays.toString(args));}

        while(quitter!=true){

            //affichage du menu
            afficheMenu();

            //lecture du choix de la tâche via le scanner puis appel de la fonction correspondante. hasNextInt vérifie que l'entrée est bien un integer.
            if(sc.hasNextInt()){
                int choixTache = sc.nextInt();
                sc.nextLine(); //vide le buffer
                switch (choixTache) {
                    case 0:
                        quitter = true;
                        break;
                    case 1:
                        scannerPlage();
                        break;
                    case 2:
                        scannerHote();
                        break;
                    case 3:
                        afficherInventaire();
                        break;
                    case 4:
                        exporterRapport();
                        break;
                    case 5:
                        faireComparaison();
                        break;
                    default:
                        System.out.println("Nombre non reconnu");
                        break;
                }
            }
            else{
                sc.next();
                System.out.println("Saisi invalide, saisissez un nombre");
            }
        }

        sc.close();
    }
}
