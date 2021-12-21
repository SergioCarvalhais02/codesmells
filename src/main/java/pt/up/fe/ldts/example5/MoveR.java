package pt.up.fe.ldts.example5;

public class MoveR extends Move {
    public MoveR(Position p) {
        super(p);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') getPosition().setDirection('E');
        else if (getPosition().getDirection() == 'E') getPosition().setDirection('S');
        else if (getPosition().getDirection() == 'S') getPosition().setDirection('W');
        else if (getPosition().getDirection() == 'W') getPosition().setDirection('N');
        return getPosition();
    }
}
