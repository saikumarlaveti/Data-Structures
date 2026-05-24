package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.util.function.Consumer;

public class Consumer_03 {
    public static void main(String[] args) {

        //1.accept()
        Consumer<String> display = name-> System.out.println(name);
        display.accept("Saikumar");  //Saikumar
        display.accept("Santosh"); //Santosh

        //2.andThen()

        Consumer<String> goodMorning = wish ->System.out.print(wish);
        Consumer<String> goodNight	 = wish ->System.out.print("  Good Night");

        Consumer<String> print = goodMorning.andThen(goodNight);

        print.accept("Saikumar Laveti"); //Saikumar Laveti Good Night

    }
}
