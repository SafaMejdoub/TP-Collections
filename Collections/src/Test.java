
public class Test {

	public static void main(String[] args) {
		Titulaire t=new Titulaire("safa");
		t.ajouterCompte(new Compte(1));
		t.ajouterCompte(new Compte(2));
		t.ajouterCompte(new Compte(3));
		t.affiche();
		Compte c= new Compte(1);
		t.retrait(1, 20);
		t.retrait(2, 5);
		
		t.affiche();
		t.afficheMaxCompte();
	}

}
