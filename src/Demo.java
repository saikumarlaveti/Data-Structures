import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;

class Demo{
    public static void main(String[] args) {
        LinkedList<Integer> element = new LinkedList<>();

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.push(1);
        list1.push(2);
        list1.push(4);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.push(1);
        list2.push(3);
        list2.push(4);

        while( !list1.isEmpty() && ! list2.isEmpty()){
            element.push(list2.pop());
            element.push(list1.pop());

        }
        Consumer<List<Integer>> list = i->System.out.println(i);
//        list.accept(list1);
//        list.accept(list2);
        list.accept(element);
    }
}

