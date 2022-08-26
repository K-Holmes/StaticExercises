//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner {
    //Fields
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    private static int prisonerCount=0;
    private int bookingNumber = prisonerCount;

    //Constructor
    public Prisoner(String name, double height, int sentence, Cell cell){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
        prisonerCount++;
        bookingNumber = prisonerCount;
    }

    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        //if made static all non-static variables/methods have an error
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell().getName());
        System.out.println("Prisoner Count: "+prisonerCount);
        System.out.println("Booking Number: "+bookingNumber);
    }

    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public Cell getCell() {
        return cell;
    }
    public static int getPrisonerCount(){return prisonerCount;}
//    public int getBookingNumber(){return bookingNumber;}

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
