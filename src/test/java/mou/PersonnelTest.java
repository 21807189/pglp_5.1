package mou;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PersonnelTest {

    @Test
    public void constructeurTest() {
        Personnel p = new Personnel.Builder("Nom", "Prenom",
                LocalDate.of(2000, 01, 05),
                new telephone("0600000001", "portable"))
                .build();
        assertEquals("Nom", p.getNom());
        assertEquals("Prenom", p.getPrenom());
        assertEquals(LocalDate.of(2000, 01, 05), p.getDateNaissance());

        assertEquals(1, p.getnumTelephone().size());
        assertEquals(new telephone("0600000001", "portable"), p.getnumTelephone().get(0));
    }

    @Test
    public void constructeurTest2() {
        Personnel p = new Personnel.Builder("Nom", "Prenom",
                LocalDate.of(2000, 01, 05),
                new telephone("0700000001", "portable"))
                //.addnumTelephone(new telephone("0900000001", "fixe"))                
                .build();
        assertEquals("Nom", p.getNom());
        assertEquals("Prenom", p.getPrenom());
        assertEquals(LocalDate.of(2000, 01, 05), p.getDateNaissance());
        

       assertEquals(2, p.getnumTelephone().size());
       // assertEquals(new telephone("0100000001", "fixe"), p.getnumTelephone().get(1));
        assertEquals(new telephone("0700000001", "portable"), p.getnumTelephone().get(0));
    }

   
}
