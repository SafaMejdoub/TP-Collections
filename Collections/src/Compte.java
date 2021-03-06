import java.util.Objects;

public class Compte implements Comparable<Compte>{
	private int numero;
	private double solde;

	Compte(int numC) {
		this.numero = numC;
	}

	int getNumero() {
		return this.numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	void retrait(double m) {
		solde = solde - m;
	}

	void depot(double m) {
		solde = solde + m;
	}

	@Override
	public String toString() {
		String s = "num compte: " + this.numero + " solde: " + this.solde;
		return s;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		Compte c = (Compte) o;
		if (this.numero == c.numero)
			return true;
		return false;
	}
	@Override
	public int hashCode()
	{
	return Objects.hash(numero);
	}
	
	@Override
	public int compareTo(Compte c)
	{
		return(c.getNumero() - this.getNumero());
	}
}
