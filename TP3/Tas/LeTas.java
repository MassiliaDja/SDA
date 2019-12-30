package Tas;

import java.io.Console;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;

import javax.xml.ws.handler.MessageContext;

public class LeTas {
	
	static int xy,x,min,minn,s;
	 static int capacité = 1000;
	
	
	
    
public LeTas(){ 
	
	
	
}
	
	
	
	public static void inserer ( ArrayList<Integer> ta, int z)
		
	{
		
	
		
		ta.add(z);
		diminuerCle(ta);
		
		
	
	 }


	
	
	

	public static void diminuerCle ( ArrayList<Integer> ta)
	{	 int j=parent(ta.size()-3);
		  while(j>=0){
					  
		 if( ta.get(gauche(j)) < ta.get(j)){
		min =ta.get(gauche(j));
		x=gauche(j);
		  }
		else{
		 min = ta.get(j);}
		
			
	  if( ta.get(droit(j)) < min ){
		 min = ta.get(droit(j));
	  x=droit(j);}
		  	  
		if( min != ta.get(j) ){
			xy=ta.get(j);
			ta.set(j, min);
			ta.set(x,xy); }
		j--;
		  }}
	
	
	
	public static void ExtMin (ArrayList<Integer> ta){
	if(ta.size()< 1){
		System.out.println("liste vide");
	}
	else{
		
		minn=ta.get(0);
		for(int x=1;x<ta.size()-1;x++){				
		
		if (ta.get(x)<min){
			min=ta.get(x);
			s=x;
		}}
		
		ta.remove(s);		
		diminuerCle (ta);
		
		
		
	}}
		
		
	
		
	
	
	
	public static void  affiche(ArrayList<Integer> ta){
		 for(int c=0;c<ta.size();c++){
		  System.out.println(ta.get(c)+" et mon parent cest " + ta.get(parent(c)));
		  
				  }}

	public static int gauche(int v){
		
		return (v=2*v+1);
	}
	public static int droit(int a){
		
		return (a=2*a+2);
	}
	public static int parent(int b){
		
		return (b=((b-1)/2));
		
	}
	
		}

