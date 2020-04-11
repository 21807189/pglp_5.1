package mou;

import java.time.LocalDate;


public final class Main {
	
	private Main() {
	}
	
    public static void main(final String[] args) {
        Personnel p = new Personnel.Builder("Mouwafal", "HOUSSEIN AHMED", LocalDate.of(1996,05,17)).build();
        System.out.println(p);
    }
}
