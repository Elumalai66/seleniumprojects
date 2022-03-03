package week3.Assignment;

public class Sports {
	
	//over Load
	
	public void achevier(String Name, int medalCount) {
		
		System.out.println("Name           :"+"  "+Name);
		System.out.println("MedalCount     :"+"  "+medalCount);
	}
	
    public void achevier(String Country, String SportsName,int Rank) {
		
		System.out.println("Country        :"+"  "+Country);
		System.out.println("SportsName     :"+"  "+SportsName);
		System.out.println("Rank           :"+"  "+Rank);
	}

     public void achevier(float Weight,int Height,long ContactNo) {
	
	     System.out.println("Weight         :"+"  "+Weight);
	     System.out.println("Height         :"+"  "+Height);
	     System.out.println("ContactNo      :"+"  "+ ContactNo);
    }
     public void achevier(String TournmentName,long PrizeMoney) {
 		
 		System.out.println("TournmentName  :"+"  "+TournmentName);
 		System.out.println("PrizeMoney     :"+"  "+PrizeMoney);
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sports s = new Sports();
		s.achevier("Bobby",2);
		s.achevier("India", "FootBall", 01);
		s.achevier(65f,160, 9629189345L);
		s.achevier("FIFA WORLD CUP", 25000000L);
		
		
		
		

	}

}
