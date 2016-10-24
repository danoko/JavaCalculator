
package calculator;


import java.util.Stack;


public class StackParser {
    private StringBuilder stringToParse;
    private StringBuilder parsedString = new StringBuilder();
    private Stack<Character> operatorStack = new Stack<Character>();
    private Stack<Double>valueStack = new Stack<Double>();
    private char lastOp;
    private double x=0, y=0;
   
    
    public Stack<Double> getValueStack() {
        return valueStack;
    }

    public double getY() {
        return y;
    }
    
    public char getLastOp() {
        return lastOp;
    }
    
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
            case '~':
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
    private void performOperation(char c){
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
            case '~':
                y = valueStack.pop();
                valueStack.push(-y);
                break;
        }
        
    }
    
    private boolean itIsUMinus(){
        switch(lastOp){
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
            default:
                return false;
        }
    }
    
    public void parse(){
        int i = 0;
        StringBuilder num = new StringBuilder("");
        
        while(i<stringToParse.length()){
            if((i==0&&stringToParse.charAt(i)=='-')||itIsUMinus() && stringToParse.charAt(i)=='-'){
                putOnOperatorStack('~');
                i++;
                continue;
            }
            while(Character.isDigit(stringToParse.charAt(i))|| stringToParse.charAt(i)=='.'){
              parsedString.append(stringToParse.charAt(i));
              i++;

            }
            parsedString.append(" ");
            if(isOper(stringToParse.charAt(i))){
                putOnOperatorStack(stringToParse.charAt(i));
                lastOp=stringToParse.charAt(i);
            }
            i++;
        }
        while(!operatorStack.empty()){
            parsedString.append(operatorStack.pop());
        }
        parsedString.append("\0");
        
    }
    public void evaluate(){
        int i=0;
        char c;
        StringBuilder num = new StringBuilder();
        while(i<parsedString.length()){
            num.setLength(60);
            c = parsedString.charAt(i);
            if(Character.isDigit(c)){
                while(Character.isDigit(c)|| c=='.'){
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
        
    }
}
