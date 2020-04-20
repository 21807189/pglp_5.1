package mou;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PersonnelTest {

    @Test
    public void constructeurTest() {
        Personnel p = new Personnel.Builder("Houssein", "mouwafak",
                LocalDate.of(1900,12,12),
                new telephone("0600000001", "portable"))
                .build();
        assertEquals("houssein", p.getNom());
        assertEquals("mouwafak", p.getPrenom());
        assertEquals(LocalDate.of(2000, 01, 05), p.getDateNaissance());

        assertEquals(1, p.getnumTelephone().size());
        assertEquals(new telephone("0600000001", "portable"), p.getnumTelephone().get(0));
    }

    private void assertEquals(telephone telephone, Integer size) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(LocalDate of, LocalDate dateNaissance) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String string, String nom) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void constructeurTest2() {
        Personnel p = new Personnel.Builder("houssein", "mouwafak",
                LocalDate.of(1900, 12, 12),
                new telephone("0700000001", "portable"))
                //.addnumTelephone(new telephone("0900000001", "fixe"))                
                .build();
        assertEquals("houssein", p.getNom());
        assertEquals("mouwafak", p.getPrenom());
        assertEquals(LocalDate.of(1900, 12, 12), p.getDateNaissance());
        

       assertEquals(2, p.getnumTelephone().size());
       // assertEquals(new telephone("0100000001", "fixe"), p.getnumTelephone().get(1));
        assertEquals(new telephone("0700000001", "portable"), p.getnumTelephone().get(0));
    }

   
}
