package Lab2.problem2.model;

public class Pawn extends Piece {
    public Pawn(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position pos) {
        if (isSamePosition(pos)) {
            return false;
        }

        return pos.getRow() == this.pos.getRow() - 1 && pos.getCol() == this.pos.getCol();
    }
}
