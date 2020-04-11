package mou;

import java.util.ArrayList;
import java.time.LocalDate;

public final class Personnel {
	private final String  nom;
	private final String prenom;
	private final java.time.LocalDate dateNaissance;
	private final ArrayList<Integer> numTelephone;

	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private ArrayList<Integer> numTelephone;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance) {
			
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			
			numTelephone = new ArrayList<Integer>();
		}
		
		public Builder numeroTelephone(final  ArrayList<Integer> numTelephone) {
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
}
