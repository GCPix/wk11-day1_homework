import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PrinterTest {
    private Printer printer;
    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void printCanPrintReducePaper(){

        assertTrue("This didn't return true", printer.print(1,1));
        assertEquals(499, printer.getSheetsleft());
    }
    @Test
    public void printCannotPrintPaperLow(){
        assertFalse("This didn't return false", printer.print(100,100));
        assertEquals(500, printer.getSheetsleft());
    }
    @Test
    public void canRefillPrinter(){
        printer.print(10,1);
        assertEquals(490, printer.getSheetsleft());
        printer.refillPrinter();
        assertEquals(500, printer.getSheetsleft());
    }

    @Test
    public void printCanPrintReduceTonerLevel(){
        printer.print(10,1);
        assertEquals(90, printer.getTonerLevel());

    }

    @Test
    public void printCannotPrintTonerLow(){
        printer.print(10,10);
        assertEquals(100, printer.getTonerLevel());
    }
}
