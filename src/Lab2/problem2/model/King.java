package Lab2.problem2.model;

public class King extends Piece {
    public King(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position pos) {
        if (isSamePosition(pos)) {
            return false;
        }

        return rowDiff(pos) <= 1 && colDiff(pos) <= 1;
    }
}