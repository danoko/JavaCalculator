
package calculator;


import java.util.Stack;


public class StackParser {
    private StringBuilder stringToParse;
    private StringBuilder parsedString = new StringBuilder();
    private State state;
    private Stack<Character> operatorStack = new Stack<Character>();
    private Stack<Double>valueStack = new Stack<Double>();
    
    private boolean isOper(char c){
        switch(c){
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
            case '%':
                return true;
            case '^':
                return true;
            case '(':
                return true;
            case ')':
                return true;
            default: return false;
        }
    }
    private int evalPrecedence(char c){
        switch(c){
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            case '%':
                return 2;
            case '^':
                return 3;
            case '(':
                return 4;
            case '~':
                return 5;
        }
        return 0;
    }
    private void putOnOperatorStack(char c){
        if(operatorStack.empty() || c=='(' || operatorStack.peek()=='('){
            operatorStack.push(c);
        }
        else if(evalPrecedence(c)>evalPrecedence(operatorStack.peek())){
            operatorStack.push(c);
        }
        else if(c == ')'){
            while(!operatorStack.empty()&&operatorStack.peek()!='('){
                parsedString.append(operatorStack.pop());
            }
            operatorStack.pop();
        }
        else {
                parsedString.append(operatorStack.pop());
                putOnOperatorStack(c);
        }
    }
    
    public void setStringToParse(StringBuilder stringToParse) {
        this.stringToParse = stringToParse.append("\0");
    }

    public StackParser() {
        state = State.START;
    }
    private void performOperation(char c){
        double x,y;
        switch(c){
            case '+':
                y = valueStack.pop();
                x = valueStack.pop();
                valueStack.push(x+y);
                break;
            case '-':
                y = valueStack.pop();
                x = valueStack.pop();
                valueStack.push(x-y);
                break;
            case '*':
                y = valueStack.pop();
                x = valueStack.pop();
                valueStack.push(x*y);
                break;
            case '/':
                y = valueStack.pop();
                x = valueStack.pop();
                if(y==0)
                    throw new IllegalArgumentException("ARG 0!");
                valueStack.push(x/y);
                break;
            case '%':
                y = valueStack.pop();
                x = valueStack.pop();
                valueStack.push(x%y);
                break;
            case '^':
                y = valueStack.pop();
                x = valueStack.pop();
                valueStack.push(Math.pow(x, y));
                break;
        }
    }
    public void parse(){
        int i = 0;

        StringBuilder num = new StringBuilder("");
        while(i<stringToParse.length()){
            if(state == State.OPER && stringToParse.charAt(i)=='-'){
                putOnOperatorStack('~');
                i++;
                continue;
            }
            while(Character.isDigit(stringToParse.charAt(i))|| stringToParse.charAt(i)=='.'){
              parsedString.append(stringToParse.charAt(i));
              i++;
              state = State.NUM;
            }
            parsedString.append(" ");
            if(isOper(stringToParse.charAt(i))){
                
                putOnOperatorStack(stringToParse.charAt(i));
                state = State.OPER;
            
            }
            i++;
            
        }
        while(!operatorStack.empty()){
            parsedString.append(operatorStack.pop());
        }
        parsedString.append("\0");
        System.out.println(parsedString);
        evaluate();
    }
    public void evaluate(){
        int i=0;
        char c;
        StringBuilder num = new StringBuilder();
        while(i<parsedString.length()){
            num.setLength(60);
            c = parsedString.charAt(i);
            if(Character.isDigit(c)){
                while(Character.isDigit(c)){
                    num.append(c);
                    i++;
                    c = parsedString.charAt(i);
                } 
                valueStack.push(Double.parseDouble(num.toString()));
            }//end of isDigit test
            if (isOper(c)){
                performOperation(c);
            }
            i++;    
        } //end of evaluating loop
        System.out.println(valueStack.peek());
    }

   
}
