
package calculator;

public enum State{
        START(0),NUM(1),COMA(2),PLUS(3),MINUS(4),
        RParen(5),ZERO(6),OPER(7);
        private int s;
        State(int s){
            this.s = s;
        }
        public int getS() {
            return s;
        }
    }
