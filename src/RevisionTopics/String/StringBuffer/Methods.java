package RevisionTopics.String.StringBuffer;

public class Methods {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Saikumar");
        System.out.println(name);

        //1.append Method
        name = name.append(" Laveti");
        System.out.println(name); //Saikumar Laveti

        //2.insert Method
        name = name.insert(3,"hello");
        System.out.println(name); //Saihellokumar Laveti

        //3.replace Method
        StringBuffer name1 =new StringBuffer( "Sanju");
        name1 = name1.replace(1,3,"@@@");
        System.out.println(name1);  //S@@@ju

        //4.delete Method
        name1 = name1.delete(0,2);
        System.out.println(name1); //@@ju

        //5.reverse Method
        StringBuffer sb = new StringBuffer("saikumar");
        System.out.println(sb.reverse()); //ramukias

        //6.capacity
        System.out.println(sb.capacity()); //24

        //7.ensureCapacity


        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        StringBuffer s1 = new StringBuffer("Sai");
        StringBuffer s2 = new StringBuffer("Sai");
        System.out.println(s1 == s2);//false (different references)

        String names = "Saikumar";
        String namess = "Saikumar";
        System.out.println(names == namess); //true(same references)


        System.out.println(sb1.equals(sb2)); // Output: false (different references)
        System.out.println(sb1 == sb2);     // Output: false (differen

    }
}


