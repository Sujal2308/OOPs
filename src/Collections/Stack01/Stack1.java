package Collections.Stack01;

import java.util.List;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args){
        Stack<Integer> stackOfNumbers = new Stack<>();
        stackOfNumbers.push(10);
        stackOfNumbers.push(20);
        stackOfNumbers.push(30); //* top of stack
        System.out.println(stackOfNumbers);
        stackOfNumbers.pop(); //* removes top of stack
        System.out.println(stackOfNumbers);

        stackOfNumbers.addAll(List.of(100,200,300,500));
        System.out.println(stackOfNumbers.peek());

        System.out.println(stackOfNumbers.empty());//! false

        //stackOfNumbers.removeAll(stackOfNumbers);
        System.out.println(stackOfNumbers.empty());//! true

        System.out.println(stackOfNumbers.get(1));//! 10

        System.out.println(stackOfNumbers.search(5000)); //-1
        //? searches item from top using 1 based indexing and return index
        //? if found otherwise -1
    }
}
