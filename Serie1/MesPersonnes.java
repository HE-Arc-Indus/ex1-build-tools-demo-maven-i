package Serie1;
import Serie1.Personne;

class MesPersonnes{
	
	public static void main(String[] args){

		Personne pers1 = new Personne();
		Personne pers2 = new Personne();
	
		pers1.setNom("toto");
		pers1.setPrenom("otot");

		pers2.setNom("tutu");
		pers2.setPrenom("utut");
		
		pers1.sePresenter();
		pers2.sePresenter();		
	}
}