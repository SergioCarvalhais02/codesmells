package pt.up.fe.ldts.example5;

public class Turtle {
    Position pos;
    public void setPos(Position pos) {
        this.pos = pos;
    }
    public Turtle(int row, int column, char direction) {
        this.pos=new Position(row,column,direction);
    }
    public int getRow() {
        return pos.getRow();
    }
    public int getColumn() {
        return pos.getColumn();
    }
    public char getDirection() {
        return pos.getDirection();
    }
    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            setPos(new MoveL(pos).execute());
        } else if (command == 'R') { // ROTATE RIGHT
            setPos(new MoveR(pos).execute());
        } else if (command == 'F'){ // MOVE FORWARD
            setPos(new MoveF(pos).execute());
        }
    }
}
