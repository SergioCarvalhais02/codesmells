package pt.up.fe.ldts.example5;

public class MoveF extends Move {
    public MoveF(Position p) {
        super(p);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') getPosition().setRow(getPosition().getRow() - 1);
        if (getPosition().getDirection() == 'S') getPosition().setRow(getPosition().getRow() + 1);
        if (getPosition().getDirection() == 'W') getPosition().setColumn(getPosition().getColumn() - 1);
        if (getPosition().getDirection() == 'E') getPosition().setColumn(getPosition().getColumn() + 1);
        return getPosition();
    }
}
