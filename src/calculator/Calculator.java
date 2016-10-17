
package calculator;


public class Calculator {

    public static void main(String[] args) {
        
        try{
            CalculatorForm form = new CalculatorForm();
            form.setVisible(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
