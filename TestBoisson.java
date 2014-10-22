public class TestBoisson{
	public static void main(String[] args){
		try{
		Boisson drink1= new Boisson("Cola", 0.75, Boisson.SOFT);
		drink1.ajouter(44);
		Boisson drink2= new Boisson("Hoegarden", 0.75, Boisson.BIERE, 24);
		System.out.println(drink1+"\n"+drink2);
		}catch(ArgumentInvalideException e){ 
			System.out.println(e.getMessage());}

	}
}