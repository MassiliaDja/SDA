package BArbre;





	import java.io.*;
	import java.util.ArrayList;

	/**
	    Classe utilis�e pour faire des statistiques �l�mentaires
	    sur une s�quence d'op�rations.
	 */
	public class Analyzer {

	    /**
	        Constructeur de la classe analyse
	        Complexit� en temps/espace, pire et meilleur cas : O(1)
	     */
	    public Analyzer() {
	        cost = new ArrayList<Double>();
	        cumulative_cost = new ArrayList<Double>();
	        cumulative_square = 0.;
	    }

	    /**
	        Ajoute un co�t, une valeur � l'analyse.
	        Complexit� en temps/espace, pire cas : O(size)
	        Complexit� en temps/espace, meilleur cas : O(1)
	        Complexit� amortie : O(1)
	        @param x est la valeur que l'on souhaite ajouter � l'analyse.
	     */
	    void append(double  x){
	        cost.add(x);
	        cumulative_cost.add( (!cumulative_cost.isEmpty()) ? cumulative_cost.get(cumulative_cost.size()-1)+x : x);
	        cumulative_square += x*x;
	    }

	    /**
	        Renvoie la somme des co�ts enregistr�s dans cette analyse.
	        Complexit� en temps/espace, meilleur cas : O(1)
	        @returns la somme des co�ts enregistr�s dans cette analyse.
	     */
	    double get_total_cost(){
	        return cumulative_cost.get(cumulative_cost.size()-1);
	    }

	    /**
	        Renvoie le co�t amorti d'une op�ration.
	        Complexit� en temps/espace, meilleur cas : O(1)
	        @param pos est l'indice de l'op�ration pour laquelle on veut conna�tre le co�t amorti.
	        @returns le co�t amorti d'une op�ration.
	     */
	    double get_amortized_cost(int pos){
	        return (pos > 0)? cumulative_cost.get(pos)/pos : cumulative_cost.get(pos);
	    }

	    /**
	        Renvoie la moyenne des co�ts de toutes les op�rations enregistr�es dans l'analyse.
	        Complexit� en temps/espace, meilleur cas : O(1)
	        @returns la moyenne des co�ts de toutes les op�rations enregistr�es dans l'analyse.
	     */
	    double get_average_cost(){
	        if(cumulative_cost.isEmpty())
	            throw new RuntimeException("List is empty");
	        return cumulative_cost.get(cumulative_cost.size()-1)/cumulative_cost.size();
	    }

	    /**
	        Renvoie la variance des co�ts de toutes les op�rations enregistr�es dans l'analyse.
	        Complexit� en temps/espace, meilleur cas : O(1)
	        @returns la variance des co�ts de toutes les op�rations enregistr�es dans l'analyse.
	     */
	    double get_variance(){
	        double mean, mean_square;
	        mean = get_average_cost();
	        mean_square = mean * mean;
	        return cumulative_square - mean_square;
	    }

	    /**
	        Renvoie l'�cart-type des co�ts de toutes les op�rations enregistr�es dans l'analyse.
	        Complexit� en temps/espace, meilleur cas : O(1)
	        @returns l'�cart-type des co�ts de toutes les op�rations enregistr�es dans l'analyse.
	     */
	    double get_standard_deviation(){
	        return Math.sqrt(get_variance());
	    }

	    /**
	        Sauvegarde la liste des co�ts et des co�ts amortis dans un fichier.
	        Complexit� en temps, meilleur/pire cas : O(size)
	        @param path est le chemin du fichier dans lequel la sauvegarde est faite.
	     */
	    
	    void save_values(String path){
	    	
	        int i;
	        File file = new File(path);
	        FileWriter fr = null;
	        try {
	            fr = new FileWriter(file);
	            for (i = 0; i < cost.size(); ++i){
	                fr.write(i+" "+cost.get(i)+" "+get_amortized_cost(i)+"\n");
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	            //close resources
	            try {
	                fr.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    /**
	        Affiche la liste des co�ts et des co�ts amortis sur la sortie standard.
	        Complexit� en temps, meilleur/pire cas : O(size)
	     */
	    void plot_values(){
	        int i;
	        for (i = 0; i < cost.size(); ++i){
	            System.out.println(i+" "+cost.get(i)+" "+get_amortized_cost(i));
	        }
	    }


	    // Co�t de chaque op�ration. Peut repr�senter du temps ou une autre mesure.
	    private ArrayList<Double> cost;
	    // Co�t cumulatif. La case i contient la somme des co�ts des i premi�res op�rations.
	    // Permet de calculer le co�t amorti d'une op�ration.
	    private ArrayList<Double> cumulative_cost;
	    // Carr� du co�t cumulatif. Sert � calculer la variance. On ne garde que la derni�re valeur.
	    private double cumulative_square;


	}




