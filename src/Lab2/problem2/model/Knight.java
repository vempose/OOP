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

        int dr = rowDiff(pos);
        int dc = colDiff(pos);

        return (dr == 2 && dc == 1) || (dr == 1 && dc == 2);
    }
}
