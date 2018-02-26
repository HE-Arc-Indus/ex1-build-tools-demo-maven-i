package Serie1;

class Personne{
	private String nom;
	private String prenom;

	public Personne(){
		nom = null;
		prenom = null;
	}	
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public void setNom(String p_Nom){
		nom = p_Nom;
	}

	public void setPrenom(String p_Prenom){
		prenom = p_Prenom;
	}	
	
	public void sePresenter(){
		System.console().writer().println("Bonjour, je m'appel "+prenom+" "+nom+".");
	}
}