import java.util.Stack;

public class CTCISortStack {
    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack<Integer>();
        Stack<Integer> helperStack = new Stack<Integer>();
        mainStack.add(1);
        mainStack.add(3);
        mainStack.add(8);
        mainStack.add(5);

        //Sorting portion
        boolean noSwapLoop = true;
        while(noSwapLoop){
            boolean swapOccurred = false;
            while(mainStack.size() > 1){
                helperStack.push(mainStack.pop());
                if(helperStack.peek() > mainStack.peek()){
                    int tempNum = helperStack.pop();
                    helperStack.push(mainStack.peek());
                    mainStack.pop();
                    mainStack.push(tempNum);
                    swapOccurred = true;
                }
            }
            while(helperStack.size() > 0){
                mainStack.push(helperStack.pop());
            }
            noSwapLoop = swapOccurred;
        }
        System.out.println(mainStack);
    }
}