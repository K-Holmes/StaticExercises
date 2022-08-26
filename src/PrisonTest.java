//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest {
    public static void main(String[] args){
        Cell cellA1 = new Cell("A1", false, 1234);
        Cell cellB1 = new Cell("B1", false, 1234);
        Cell cellC1 = new Cell("C1", false, 1234);
        Cell cellD1 = new Cell("D1", false, 1234);

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cellA1);
        bubba.display();
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3, cellB1);
        twitch.display();
        Prisoner franky = new Prisoner("Franky", 1.64, 12, cellC1);
        franky.display();
        Prisoner stripes = new Prisoner("Stripes", 1.97, 6, cellD1);
        stripes.display();
        System.out.println(franky.getPrisonerCount());


    }
}
