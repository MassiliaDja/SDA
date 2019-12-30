package Tas;

import java.util.ArrayList;


public class Main extends LeTas {

	public static void main(String[] args) {
		ArrayList<Integer> ta = new ArrayList<Integer>();
			     // Analyse du temps pris par les op�rations.
			        Analyzer time_analysis = new Analyzer();
			        // Analyse du nombre de copies faites par les op�rations.
			       // Analyzer copy_analysis = new Analyzer();
				// Analyse de l'espace m�moire inutilis�.
				Analyzer memory_analysis = new Analyzer();
			        long before, after;	       
			        

			         
			        
			      for(int i = 0; i <= 230; i++){	        	
			        
			       int tem=(int)((Math.random()*(11927356)));
			        	
			        	            
			        	    before = System.nanoTime();
		                    inserer(ta,i);
		                    after = System.nanoTime();
		                    
		                     
			                    
				 time_analysis.append(after - before);
				 memory_analysis.append( capacit� - ta.size() );
						    
					        }
					
			        

					        // Affichage de quelques statistiques sur l'exp�rience.
					        System.err.println("Total cost : "+time_analysis.get_total_cost());
					        System.err.println("Average cost : "+time_analysis.get_average_cost());
					        System.err.println("Variance :"+time_analysis.get_variance());
					        System.err.println("Standard deviation :"+time_analysis.get_standard_deviation());
					        System.err.println("la taille est :"+ta.size());
					       
					        
					        

					        // Sauvegarde les donn�es de l'exp�rience: temps et nombre de copies effectu�es par op�ration.
					        time_analysis.save_values("C:/Users/VMI/Desktop/Bin/time.plot");
					       // copy_analysis.save_values("C:/Users/VMI/Desktop//copy.plot");
						memory_analysis.save_values("C:/Users/VMI/Desktop/Bin/memory.plot");
				
					    
					}}
		

	

//ExtMin(ta);
//LeTas.affiche(ta);


