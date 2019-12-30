package Premierepartie;

import java.io.RandomAccessFile;
import java.util.Random;


	public class Main {

	    public static void main(String[] args) {
	        int i, time_ind = 0, pop_ind = 0;
	        // Tableau dynamique.
	        ArrayListProxy<Integer> a = new ArrayListProxy<Integer>();
	        // Analyse du temps pris par les op�rations.
	        Analyzer time_analysis = new Analyzer();
	        // Analyse du nombre de copies faites par les op�rations.
	        Analyzer copy_analysis = new Analyzer();
		// Analyse de l'espace m�moire inutilis�.
		Analyzer memory_analysis = new Analyzer();
	        long before, after;
	        // Bool�en permettant de savoir si une allocation a �t� effectu�e.
	        boolean memory_allocation;
           //ici mettre le random


	        for(i = 0; i < 1000000 ; i++){
	            // Ajout d'un �l�ment et mesure du temps pris par l'op�ration.
	            before = System.nanoTime();
	            memory_allocation = a.append(i);
	            after = System.nanoTime();

	            // Enregistrement du temps pris par l'op�ration
	            time_analysis.append(after - before);
	            // Enregistrement du nombre de copies eff�ctu�es par l'op�ration.
	            // S'il y a eu r�allocation de m�moire, il a fallu recopier tout le tableau.
	        
	           copy_analysis.append( (memory_allocation == true)? i: 1);//devient arraylist_size(a) :1
		    
	           // Enregistrement de l'espace m�moire non-utilis�.
		    memory_analysis.append( a.capacity() - a.size() );
	        }

	        // Affichage de quelques statistiques sur l'exp�rience.
	        System.err.println("Total cost : "+time_analysis.get_total_cost());
	        System.err.println("Average cost : "+time_analysis.get_average_cost());
	        System.err.println("Variance :"+time_analysis.get_variance());
	        System.err.println("Standard deviation :"+time_analysis.get_standard_deviation());
	        System.err.println("la taille est :" +a.size() );

	        // Sauvegarde les donn�es de l'exp�rience: temps et nombre de copies effectu�es par op�ration.
	        time_analysis.save_values("C:/Users/VMI/Desktop/sda/plots/dynamic_array_time_java.plot");
	        copy_analysis.save_values("C:/Users/VMI/Desktop/sda/plots/dynamic_array_copy_java.plot");
		memory_analysis.save_values("C:/Users/VMI/Desktop/sda/plots/dynamic_array_memory_java.plot");
	    }
	}


