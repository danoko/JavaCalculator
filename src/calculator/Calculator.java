
package calculator;


public class Calculator {

    public static void main(String[] args) {
        //CalculatorForm form = new CalculatorForm();
        //form.setVisible(true);
        try{
            StackParser parser = new StackParser();
            StringBuilder sb = new StringBuilder("4-1+11*(3+3)/2^2");
            parser.setStringToParse(sb);
            parser.parse();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
