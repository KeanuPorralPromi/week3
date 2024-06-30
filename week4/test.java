package week4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] userNames = {"Dragon123", "Racer16", "Keanu12", "gamer19"};
		
		userNameUsed("Keanu12", userNames);
		userNameUsed("Kaype12", userNames);
		
		
		
		
}	
		
		
		public static void userNameUsed(String newUserName ,String[] userNames) { 
			boolean itExists = true;
			boolean notExists = true;
			
			for(int i = 0; i < userNames.length; i++) {
				if(newUserName.equals(userNames[i])) {
					 itExists = true;
				}	else	{
					 itExists = false;
				}	
				
			
			
			for (int j = 0; j < userNames.length; j++) {
				if(newUserName.equals(userNames[j])) {
					 notExists = true;
				} else {
				notExists = false;
				}
			
			}
			if(itExists == true) {
				System.out.println("Username exists");
			} else {
				System.out.println("Username is good");
			}	
}			
			}}

