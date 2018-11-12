import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void printCanPrint(){

        assertEquals(true, printer.print(1,1));
        assertEquals(499, printer.getSheetsleft());
    }
    @Test
    public void printCannotPrint(){
        assertEquals(false, printer.print(100,100));
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
    public void willReduceTonerLevel(){
        printer.print(10,1);
        assertEquals(90, printer.getTonerLevel());

    }

    @Test
    public void tonerLevelTooLow(){
        printer.print(10,10);
        assertEquals(100, printer.getTonerLevel());
    }
}
