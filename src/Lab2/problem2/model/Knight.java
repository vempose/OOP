package Lab2.problem2.model;

public class Knight extends Piece {
    public Knight(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position pos) {
        if (isSamePosition(pos)) {
            return false;
        }

        int rowDiff = rowDiff(pos);
        int colDiff = colDiff(pos);

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
