package TasBin;



public class Main {

	public static void main(String[] args) {

			
			
			BinomialHeap bh = new BinomialHeap();
			


	     // Analyse du temps pris par les op�rations.
	        Analyzer time_analysis = new Analyzer();
	        // Analyse du nombre de copies faites par les op�rations.
	       // Analyzer copy_analysis = new Analyzer();
		// Analyse de l'espace m�moire inutilis�.
		Analyzer memory_analysis = new Analyzer();
	        long before, after;	       
	        

	        
	        for(int i = 100; i >=00; i--){
	        	
	        
	        	int tem=(int)((Math.random()*(11927356)));
	        	
	        	            
	        		 before = System.nanoTime();
	        		 bh.inserer(i); 
	        		
                     after = System.nanoTime();
                    
	        
	           
	                    
                    // System.out.println(bh.getSize());
             		//bh.ExtraireMin();
             		//bh.affiche();
             		
                     
                     
	                    // Enregistrement du temps pris par l'op�ration
			            time_analysis.append(after - before);
			            // Enregistrement du nombre de copies eff�ctu�es par l'op�ration.
			            // S'il y a eu r�allocation de m�moire, il a fallu recopier tout le tableau.
			            
			            
			        
			           //copy_analysis.append( ( memory alloc = true)? i: 1);//devient arraylist_size(a) :1
				    
			           // Enregistrement de l'espace m�moire non-utilis�.
				    memory_analysis.append( BinomialHeap.capacit� - bh.getSize() );
				    
			        }
	        

			        // Affichage de quelques statistiques sur l'exp�rience.
			        System.err.println("Total cost : "+time_analysis.get_total_cost());
			        System.err.println("Average cost : "+time_analysis.get_average_cost());
			        System.err.println("Variance :"+time_analysis.get_variance());
			        System.err.println("Standard deviation :"+time_analysis.get_standard_deviation());
			        System.err.println("la taille est :"+bh.getSize());
			       
			        
			        

			        // Sauvegarde les donn�es de l'exp�rience: temps et nombre de copies effectu�es par op�ration.
			        time_analysis.save_values("C:/Users/VMI/Desktop/Binomial/time.plot");
			       // copy_analysis.save_values("C:/Users/VMI/Desktop//copy.plot");
				memory_analysis.save_values("C:/Users/VMI/Desktop/Binomial/memory.plot");
		
			    
			}}

				

//efficacit� en temps et en m�moire
//uniquement des ajouts
//puis des ajouts et des suppressions
//insertion des valeurs croissantes et al�atoires.
//Etudiez l�effet du choix du degr� minimum t sur l�efficacit� des op�rations.(creation, insertion , recherche ,suppression)
	 			
	               
		