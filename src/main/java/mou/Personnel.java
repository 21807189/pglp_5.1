package mou;

import java.util.ArrayList;
import java.util.Collections;
import java.awt.List;
import java.time.LocalDate;

public final class Personnel implements Composant{
	private final String  nom;
	private final String prenom;
	private final java.time.LocalDate dateNaissance;
	private final ArrayList<Integer> numTelephone;

	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private ArrayList<Integer> numTelephone;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance, final telephone num) {
			
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

		public Builder addnumTelephone(telephone telephone) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	private Personnel(final Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numTelephone = builder.numTelephone;
	}

	public ArrayList<String> hierarchie() {
		// TODO Auto-generated method stub
		return null;
	}
	
	   public String getNom() {
	        return nom;
	    }

	   
	    public String getPrenom() {
	        return prenom;
	    }

	    public LocalDate getDateNaissance() {
	        return dateNaissance;
	    }
	    public java.util.List<Integer> getnumTelephone() {
	        return Collections.unmodifiableList(numTelephone);
	    }

}
