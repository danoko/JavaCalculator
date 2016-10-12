
package calculator;

public enum State{
        START(0),NUM(1),COMA(2),PLUS(3),MINUS(4),
        MULT(5),DIV(6),MOD(7),POW(8),LParen(9),RParen(10),ZERO(11),OPER(12);
        private int s;
        State(int s){
            this.s = s;
        }
        public int getS() {
            return s;
        }
    }
