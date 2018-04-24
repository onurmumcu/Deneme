package cbt;


	
	public class ArrayLooping {

		public static void main(String[] args) {
			
			String[] shoppingList = new String[6]; 
			shoppingList[0] = "clothes" ; 
			shoppingList[1] = "playstation" ; 
			shoppingList[2] = "tv" ; 
			shoppingList[3] = "book" ; 
			shoppingList[4] = "macbook" ; 
			shoppingList[5] = "mac pro" ; 
			
			System.out.println("My shopping list are : ");
		
			for(int i=0; i<shoppingList.length ; i++){
				
				System.out.println(shoppingList[i] );
				
			}
			
			
			
			

		}



}
