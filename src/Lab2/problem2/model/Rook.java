package Lab2.problem2.model;

public class Rook extends Piece {

    public Rook(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position pos) {
        if (isSamePosition(pos)) {
            return false;
        }

        return this.pos.getRow() == pos.getRow() || this.pos.getCol() == pos.getCol();
    }
}
