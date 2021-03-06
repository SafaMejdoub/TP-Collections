import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Titulaire {
	String nom;
	HashSet<Compte> SetCompte;

	Titulaire(String n) {
		nom = n;
		SetCompte = new HashSet<>();
		//TreeSet<Compte> s= new TreeSet<>(SetCompte);
		
	}

	void ajouterCompte(Compte c) {
		SetCompte.add(c);
	}

	void affiche() {
		System.out.println("Comptes du titulaire: " + this.nom);
		Iterator<Compte> it = this.SetCompte.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
	void retrait(int numC, double montant)
	{
		for(Compte c:this.SetCompte)
			if(c.getNumero()== numC)
			{
				c.retrait(montant);
				return;
			}
	
	}
	void afficheMaxCompte()
	{
		TreeSet<Compte> t=new TreeSet<Compte>(SetCompte);
		System.out.println(t);
	}

}
