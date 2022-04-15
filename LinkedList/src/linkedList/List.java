package linkedList;

import java.util.*;

public class List {
 
	public static void main(String[] args) {
		
		Favoritos fav = new Favoritos();
		LinkedList<String> favorito = new LinkedList<String>();
        
		favorito.add(fav.a);
        favorito.add(fav.b);
        favorito.add(fav.c);
   
        System.out.println(favorito);
        
        favorito.remove(fav.a);
        favorito.add(fav.d);
        favorito.remove(fav.c);
                
        System.out.println(favorito);
        
	}    
		
	
	
}