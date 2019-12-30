package BArbre;

		import java.security.acl.LastOwnerException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.RootPaneContainer;

import BArbre.Analyzer;
import BArbre.BTree;


		
		public class BM {
			public static int sz;
			
			public static void main(String[] args)
			{
				
				
				int n =70;		
				  int i; 
				  ArrayList<Integer> tab = new ArrayList<Integer> ();
				  
				  BTree tree = new BTree(n);      
				  
			        // Analyse du temps pris par les op�rations.
			        Analyzer time_analysis = new Analyzer();
			        // Analyse du nombre de copies faites par les op�rations.
			        Analyzer copy_analysis = new Analyzer();
				// Analyse de l'espace m�moire inutilis�.
				Analyzer memory_analysis = new Analyzer();
			        long before, after;	       
			        

		          
			        for(i = 0; i < 100; i++){
			        	
			        	
			        	double p= 0.8;
			        	double x=(double)((Math.random()*(1 - 0)));
			           	
			        	
			        	if(x<=p){
			        		int temp= (int)((Math.random()*(11927356)));
			            	 before = System.nanoTime();
			        		 tree.insert(tree,temp);
		                     after = System.nanoTime();	
		                     sz =sz+1;
		                     tab.add(temp);		                     
			        	}
		                     else{
		                    	              	       
		                    	 int zz = tab.size();		                 	                    	   	
		                 	    int zzz=tab.get(zz-1);
		                 	    
		            	            before = System.nanoTime();
		            	            tree.deleteKey(tree,zzz);
		            	           
		            	            after = System.nanoTime();
		            	            sz=sz-1;
		                     }
				           
		                        
		                     /*
		                        System.out.println("2. Print the whole  Tree in preorder");
		                        tree.print(tree.root);
								
		                        
		                        System.out.println("3. Search for a Key and print the Node it belongs to");
								tree.SearchPrintNode(tree,key2);

							
								System.out.println("4. Delete a key from the leaf");
								


								
								tree.print(tree.root);*/
								

								
		                           
								
								
								
								
								
					

					           
					            
					        
					           
						    
		                     time_analysis.append(after - before);
						    memory_analysis.append( BTree.capacit� - sz );
						    
					        }

					        // Affichage de quelques statistiques sur l'exp�rience.
					        System.err.println("Total cost : "+time_analysis.get_total_cost());
					        System.err.println("Average cost : "+time_analysis.get_average_cost());
					        System.err.println("Variance :"+time_analysis.get_variance());
					        System.err.println("Standard deviation :"+time_analysis.get_standard_deviation());
					        System.err.println("la taille est :"+sz);
					        

					        // Sauvegarde les donn�es de l'exp�rience: temps et nombre de copies effectu�es par op�ration.
					        time_analysis.save_values("C:/Users/VMI/Desktop/BArbres//time.plot");
					        //copy_analysis.save_values("C:/Users/VMI/Desktop/BArbres/copy.plot");
						memory_analysis.save_values("C:/Users/VMI/Desktop/BArbres/memory.plot");
					    
					}}

						

		//�efficacit� en temps et en m�moire
		//uniquement des ajouts
		//puis des ajouts et des suppressions
		//insertion des valeurs croissantes et al�atoires.
		//Etudiez l�effet du choix du degr� minimum t sur l�efficacit� des op�rations.(creation, insertion , recherche ,suppression)
			 			
					
