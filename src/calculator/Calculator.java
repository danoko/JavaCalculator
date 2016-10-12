
package calculator;


public class Calculator {

    public static void main(String[] args) {
        //CalculatorForm form = new CalculatorForm();
        //form.setVisible(true);
        StackParser parser = new StackParser();
        StringBuilder sb = new StringBuilder("45.98+(9.0-11)-(9*9)");
        parser.setStringToParse(sb);
        parser.parse();
    }
}
