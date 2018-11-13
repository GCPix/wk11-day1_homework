public class Printer {

//    Printer
//    Create a Printer class that has a property for number of sheets of paper left.
//    Add a method to print that takes in a number of pages and number of copies.
//    The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//    Create a method to refill the printer paper.
//    Add a toner volume property to the class.
//    Modify the printer so that it reduces the toner by 1 for each page printed.

    private int sheetsleft = 500;
    private int tonerLevel = 100;

    public Printer(){
        this.sheetsleft = sheetsleft;
        this.tonerLevel = tonerLevel;
    }

    public int getSheetsleft(){
        return this.sheetsleft;
    }
    public int getTonerLevel(){
        return this.tonerLevel;
    }

    public boolean print(int noOfCopies, int noOfPages){
        int totalPages = noOfCopies*noOfPages;
        if(this.sheetsleft>totalPages) {
            if (this.tonerLevel > totalPages) {
                reducePaper(totalPages);
                reduceToner(totalPages);
                return true;
            }
        }
        return false;

    }

    public void refillPrinter(){
        this.sheetsleft = 500;
    }

    public void reducePaper(int totalPages){
        this.sheetsleft = this.sheetsleft - totalPages;
    }
    public void reduceToner(int totalPages){
        this.tonerLevel = this.tonerLevel - totalPages;
    }
}
