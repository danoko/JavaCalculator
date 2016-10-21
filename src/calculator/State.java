
package calculator;

public enum State{
        START(0),NUM(1),COMA(2),PLUS(3),MINUS(4),LPAREN(5),
        RParen(6),ZERO(7),OPER(8),RESULT(9);
        private int s;
        State(int s){
            this.s = s;
        }
        public int getS() {
            return s;
        }
    }
