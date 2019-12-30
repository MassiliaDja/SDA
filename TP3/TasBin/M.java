package TasBin;



public class M {

	public static void main(String[] args) {

			
			
			BinomialHeap bh = new BinomialHeap();
			


	     // Analyse du temps pris par les opérations.
	        Analyzer time_analysis = new Analyzer();
	        // Analyse du nombre de copies faites par les opérations.
	       // Analyzer copy_analysis = new Analyzer();
		// Analyse de l'espace mémoire inutilisé.
		Analyzer memory_analysis = new Analyzer();
	        long before, after;	       
		
		
		
		
		
		   for(int i = 1000; i >= 0; i--){
	        	//si on fait plus de suppression on obtient des erreur(arbre vide ? ou) 
	        	//si on fait plus d'insertion le resultat est bon
	        	//la suppression n'est pas possible tout le temps car les noeud ne sont pas tjr feuille et 
	        	
	        	
	        	double x=(double)((Math.random()*(1- 0)));
	        	double p= 0.8;
	        	
	        	if(x<=p){
	        		//int tem=(int)((Math.random()*(11927356)));	        	
	        	
	        	            
	        		 before = System.nanoTime();
	        		 bh.inserer(i);        		 
                    after = System.nanoTime();
	        	}
	        	
	        	else{
	        				                 	    
           	            before = System.nanoTime();
           	         bh.ExtraireMin();
           	            after = System.nanoTime();}
	        	
         		
                 
                 
                    // Enregistrement du temps pris par l'opération
		            time_analysis.append(after - before);
		            // Enregistrement du nombre de copies efféctuées par l'opération.
		            // S'il y a eu réallocation de mémoire, il a fallu recopier tout le tableau.
		            
		            
		        
		           //copy_analysis.append( ( memory alloc = true)? i: 1);//devient arraylist_size(a) :1
			    
		           // Enregistrement de l'espace mémoire non-utilisé.
			    memory_analysis.append( BinomialHeap.capacité - bh.getSize() );
			    
		        }
        

		        // Affichage de quelques statistiques sur l'expérience.
		        System.err.println("Total cost : "+time_analysis.get_total_cost());
		        System.err.println("Average cost : "+time_analysis.get_average_cost());
		        System.err.println("Variance :"+time_analysis.get_variance());
		        System.err.println("Standard deviation :"+time_analysis.get_standard_deviation());
		        System.err.println("la taille est :"+bh.getSize());
		        

		        // Sauvegarde les données de l'expérience: temps et nombre de copies effectuées par opération.
		        time_analysis.save_values("C:/Users/VMI/Desktop/Binomial/time.plot");
		       // copy_analysis.save_values("C:/Users/VMI/Desktop//copy.plot");
			memory_analysis.save_values("C:/Users/VMI/Desktop/Binomial/memory.plot");
		    
		}}

			

//efficacité en temps et en mémoire
//uniquement des ajouts
//puis des ajouts et des suppressions
//insertion des valeurs croissantes et aléatoires.
//Etudiez l’effet du choix du degré minimum t sur l’efficacité des opérations.(creation, insertion , recherche ,suppression)
 			
               
