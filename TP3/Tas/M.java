package Tas;

import java.util.ArrayList;

public class M extends LeTas {

	public static void main(String[] args) {
		
				
					     // Analyse du temps pris par les opérations.
					        Analyzer time_analysis = new Analyzer();
					        // Analyse du nombre de copies faites par les opérations.
					       // Analyzer copy_analysis = new Analyzer();
						// Analyse de l'espace mémoire inutilisé.
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
				        	        	
				                 		
				                    
				                     
					                    // Enregistrement du temps pris par l'opération
							            time_analysis.append(after - before);
							            // Enregistrement du nombre de copies efféctuées par l'opération.
							            // S'il y a eu réallocation de mémoire, il a fallu recopier tout le tableau.
							            
							            
							        
							           //copy_analysis.append( ( memory alloc = true)? i: 1);//devient arraylist_size(a) :1
								    
							           // Enregistrement de l'espace mémoire non-utilisé.
								    memory_analysis.append( LeTas.capacité - ta.size() );
								    
							        }
							
					        

							        // Affichage de quelques statistiques sur l'expérience.
							        System.err.println("Total cost : "+time_analysis.get_total_cost());
							        System.err.println("Average cost : "+time_analysis.get_average_cost());
							        System.err.println("Variance :"+time_analysis.get_variance());
							        System.err.println("Standard deviation :"+time_analysis.get_standard_deviation());
							        System.err.println("la taille est :"+ta.size());
							        
							       
							        
							        

							        // Sauvegarde les données de l'expérience: temps et nombre de copies effectuées par opération.
							        time_analysis.save_values("C:/Users/VMI/Desktop/Bin/time.plot");
							       // copy_analysis.save_values("C:/Users/VMI/Desktop//copy.plot");
								memory_analysis.save_values("C:/Users/VMI/Desktop/Bin/memory.plot");
						
							    
							}}
				

			

		


	
