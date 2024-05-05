/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package kampus;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author En Tay
 */
public class DosenTest {
    
    public DosenTest() {
    }

    @Test
    public void testTambah() {
        System.out.println("tambah");
        Dosen instance = new Dosen();
        instance.nid = "1115";
        instance.nama = "YUGA";
        boolean expResult = true;
        boolean result = instance.tambah();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBaca() {
        System.out.println("baca");
        String nid = "1115";
        Dosen instance = new Dosen();
        boolean expResult = true;
        boolean result = instance.baca(nid);
        assertEquals(expResult, result);
    }

    

        
}
