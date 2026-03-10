package Lab2.problem2.model;

public class Bishop extends Piece {
    public Bishop(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position pos) {
        if (isSamePosition(pos)) {
            return false;
        }

        return rowDiff(pos) == colDiff(pos);
    }
}
