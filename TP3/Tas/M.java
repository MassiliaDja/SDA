package Tas;

import java.util.ArrayList;

public class M extends LeTas {

	public static void main(String[] args) {
		
				
					     // Analyse du temps pris par les op�rations.
					        Analyzer time_analysis = new Analyzer();
					        // Analyse du nombre de copies faites par les op�rations.
					       // Analyzer copy_analysis = new Analyzer();
						// Analyse de l'espace m�moire inutilis�.
						Analyzer memory_analysis = new Analyzer();
					        long before, after;	       
					        

					         ArrayList<Integer> ta = new ArrayList<Integer>();
					        
					        for(int i = 230; i >=0; i--){	        	
					        	double x=(double)((Math.random()*(1- 0)));
		        	        	double p= 0.8;
		        	        	
		        	        	if(x<=p){
					        	//int tem=(int)((Math.random()*(11927356)));
					        	
					        	            
					        	    before = System.nanoTime();
				                    inserer(ta,i);
				                    
				                    after = System.nanoTime();}
				                 
				        	        	else{
				        	        				                 	    
				                   	            before = System.nanoTime();
				                   	             ExtMin(ta);
				                   	             
				                   	            after = System.nanoTime();}
				        	        	
				                 		
				                    
				                     
					                    // Enregistrement du temps pris par l'op�ration
							            time_analysis.append(after - before);
							            // Enregistrement du nombre de copies eff�ctu�es par l'op�ration.
							            // S'il y a eu r�allocation de m�moire, il a fallu recopier tout le tableau.
							            
							            
							        
							           //copy_analysis.append( ( memory alloc = true)? i: 1);//devient arraylist_size(a) :1
								    
							           // Enregistrement de l'espace m�moire non-utilis�.
								    memory_analysis.append( LeTas.capacit� - ta.size() );
								    
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
				

			

		


	
