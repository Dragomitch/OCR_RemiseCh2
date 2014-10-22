public class Boisson{
	public final static String SOFT= "soft";
	public final static String BIERE= "biere";
	public final static String VIN= "vin";
	private String nom, typeDeBoisson;
	private double contenance;
	private int stock;

	public Boisson(String nom, double contenance, String typeDeBoisson)throws ArgumentInvalideException{
		if(nom== null || nom.equals("") ||contenance<= 0.25 || typeDeBoisson== null)
			throw new ArgumentInvalideException("Paramètres invalides");
		if(!typeDeBoisson.equals(SOFT) && !typeDeBoisson.equals(BIERE) && !typeDeBoisson.equals(VIN))
			throw new ArgumentInvalideException("Le type doit être: "+SOFT+ " ou "+BIERE+" ou "+VIN);
		this.nom= nom;
		this.contenance= contenance;
		this.typeDeBoisson= typeDeBoisson;
	}

	public Boisson(String nom, double contenance, String typeDeBoisson, int stock)throws ArgumentInvalideException{
		this(nom, contenance, typeDeBoisson);
		if(stock<= 0)
			throw new ArgumentInvalideException("La quantite doit être >0");
		this.stock= stock;
	}

	public boolean estEgalA(Boisson boisson){
		if(boisson.nom == nom && boisson.contenance== contenance)
			return true;
		return false;
	}

	public String getNom(){
		return nom;
	}

	public String getTypeBoisson(){
		return typeDeBoisson;
	}

	public double getContenance(){
		return contenance;
	}

	public int getStock(){
		return stock;
	}

	public void ajouter(int nb)throws ArgumentInvalideException{
		if(nb<= 0) 
			throw new ArgumentInvalideException("Le nombre à ajouter doit être > 0");
		stock+= nb;
	}

	public void retirer(int nb)throws ArgumentInvalideException{
		if(nb<= 0|| stock-nb <=0) 
			throw new ArgumentInvalideException("Le nombre à retirer doit être <0."
			+"Le nombre restant doit être <=0");
		stock-= nb;
	}

	public String toString(){
		return nom+" en "+contenance+ " cl - "+stock+" en stock";
	}
}