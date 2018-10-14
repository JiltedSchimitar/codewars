import org.junit.Test;

import com.codeba.dna.DNAStrand;

import static org.junit.Assert.assertEquals;


public class DnaStrandTest {
    @Test
    public void test01() {
       assertEquals("TTTT", DNAStrand.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
       assertEquals("TAACG", DNAStrand.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
       assertEquals("CATA", DNAStrand.makeComplement("GTAT"));
    }    
}