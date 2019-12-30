

 
	import java.util.ArrayList;

	/**
	 Cette classe est un proxy pour les ArrayList, c'est � dire les tableaux dynamiques en Java.
	 On utilise cette classe afin d'avoir le contr�le sur la gestion de la m�moire.
	 */
	public class ArrayListProxy<T> {

	    /**
	        Constructeur de la classe des tableaux dynamiques.
	        Complexit� en temps/espace, pire et meilleur cas : O(1)
	     */
	    public ArrayListProxy() {
	        this.capacity = 4;
	        this.data = new ArrayList<T>(this.capacity);
	    }

	    /**
	     Ajoute une valeur dans le tableau.
	     Complexit� en temps/espace, pire cas : O(size)
	     Complexit� en temps/espace, meilleur cas : O(1)
	     Complexit� amortie : O(1)
	     @param x est la valeur que l'on souhaite ajouter.
	     @returns true si le tableau a �t� agrandit, false sinon
	     ici if prends double complexite
	     */
	    public boolean append(T x){
	        boolean memory_allocation = false;
	        if( do_we_need_to_enlarge_capacity() ){
	            memory_allocation = true;
		    enlarge_capacity();
	        }
	        data.add(x);
	        return memory_allocation;
	    }

	    /**
	     Supprime la derni�re valeur du tableau.
	     Complexit� en temps, pire cas : O(size)
	     Complexit� en temps, meilleur cas : O(1)
	     Complexit� amortie : O(1)
	     @returns true si le tableau a �t� r�duit, false sinon
	     */
	    boolean pop_back(){
	        boolean memory_reduction = false;
	        if(!data.isEmpty()){
	            if( do_we_need_to_reduce_capacity() ){
	                memory_reduction = true;
			reduce_capacity();
	            }
	            data.remove(data.size()-1);
	        }
	        return memory_reduction;
	    }

	    /**
	     Renvoie la valeur situ�e � la position donn�e par l'utilisateur.
	     Complexit� en temps/espace, pire cas : O(1)
	     @param pos est la l'indice de la case on l'utilisateur veut conna�tre la valeur.
	     @returns la valeur situ�e � la position donn�e par l'utilisateur.
	     */
	    T get(int pos){
	        return data.get(pos);
	    }

	    /**
	     Renvoie le nombre d'�l�ments stock�s dans le tableau.
	     Complexit� en temps/espace, pire cas : O(1)
	     @returns le nombre d'�l�ments stock�s dans le tableau.
	     */
	    int size(){
	        return data.size();
	    }

	    /**
	     Renvoie la capacit� de stockage du tableau.
	     Complexit� en temps/espace, pire cas : O(1)
	     @returns le nombre d'�l�ments stock�s dans le tableau.
	    */
	    int capacity(){
	        return capacity;
	    }
	    
	    /**
	     Cette fonction d�termine la r�gle selon laquelle un espace m�moire plus grand sera allou� ou non.
	     @returns true si le tableau doit �tre agrandi, false sinon.
	     */
	    private boolean do_we_need_to_enlarge_capacity() {
	        return data.size() >= capacity;
	    }

	    /**
	       Cette fonction augmente la capacit� du tableau.
	    */
	    private void enlarge_capacity(){
	    
		capacity = capacity+(int)Math.sqrt(capacity);
		data.ensureCapacity( capacity);
	    }

	    /**
	     Cette fonction d�termine la r�gle selon laquelle un espace m�moire plus petit sera allou� ou non.
	     @returns true si le tableau doit �tre r�duit, false sinon.
	     */
	    private boolean do_we_need_to_reduce_capacity(){
	        return data.size() < capacity/2 && data.size() >4;
	    }

	    /**
	       Cette fonction reduit la capacit� du tableau.
	    */
	    void reduce_capacity(){
		capacity = capacity-(int)Math.sqrt(capacity);;
		data.ensureCapacity( capacity );
	    }
	    
	    // Tableau dynamique en Java. Sa capacit� r�elle est masqu�e, mais on peut avoir un contr�le dessus.
	    private ArrayList<T> data;
	    // Capacit� r�elle du tableau data.
	    private int capacity;
	}


