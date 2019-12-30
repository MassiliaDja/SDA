package TasFixe;
public class LeM {


		

			public static void main(String[] args) {
				
				
				
							        Analyzer time_analysis = new Analyzer();
							       	Analyzer memory_analysis = new Analyzer();
							        long before, after;	       
							        

							        
							        LeTasFixe m = new LeTasFixe(231); 
		                            	
		                             
							        for(int i = 0; i <= 230; i++){	        	
							        	double xx=(double)((Math.random()*(1- 0)));
				        	        	double p= 0.8;
				        	        	
				        	        	if(xx<=p){
							        	//int tem=(int)((Math.random()*(11927356)));
							        	
							        	            
							        	    before = System.nanoTime();
							        	    m.insert(i); 
						                    					                    
						                    after = System.nanoTime();}
						                 
						        	        	else{
						        	        				                 	    
						                   	            before = System.nanoTime();
						                   	         m.remove(); 
						                   	             
						                   	            after = System.nanoTime();}
						        	        	
						                 		
						                    
						                     
							                     time_analysis.append(after - before);
									           
										  memory_analysis.append( m.maxsize - m.size );
										    
									        }
							       
									
							        

									        // Affichage de quelques statistiques sur l'expérience.
									        System.err.println("Total cost : "+time_analysis.get_total_cost());
									        System.err.println("Average cost : "+time_analysis.get_average_cost());
									        System.err.println("Variance :"+time_analysis.get_variance());
									        System.err.println("Standard deviation :"+time_analysis.get_standard_deviation());
									        System.err.println("la taille est :"+m.size);
									        
									       
									        
									        

									        // Sauvegarde les données de l'expérience: temps et nombre de copies effectuées par opération.
									        time_analysis.save_values("C:/Users/VMI/Desktop/BinFixe/time.plot");
									       // copy_analysis.save_values("C:/Users/VMI/Desktop//copy.plot");
										memory_analysis.save_values("C:/Users/VMI/Desktop/BinFixe/memory.plot");
								
									    
									}}
						

					




			


	
