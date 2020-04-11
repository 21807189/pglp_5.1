package mou;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.time.LocalDate;

public final class Personnel extends Equipe implements Serializable  {
	private final String  nom;
	private final String prenom;
	private final java.time.LocalDate dateNaissance;
	private final List<Integer> numTelephone;

	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private List<Integer> numTelephone;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance) {
			
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			
			numTelephone = new ArrayList<Integer>();
		}
		
		public Builder numeroTelephone(final  List<Integer> numTelephone) {
			this.numTelephone = numTelephone;
			return this;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	
	private Personnel(final Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numTelephone = builder.numTelephone;
	}
	public String getNom() {
		return this.nom;
		
	}
	
	public List<Integer> getTel(){
		
		return Collections.unmodifiableList(this.numTelephone);
		
	}
	
	public java.time.LocalDate getLocalDate(){
		
		return this.dateNaissance;
	}
	

	public void printNom() {
		System.out.println(this.nom);
	}
}
