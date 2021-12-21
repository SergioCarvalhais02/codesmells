package pt.up.fe.ldts.example5;

public abstract class Move {
    Position position;

    public Move(Position p){
        this.position=p;
    }
    public abstract Position execute();
    public void setPosition(Position p){
        this.position=p;
    }
    public Position getPosition() {
        return position;
    }
}
