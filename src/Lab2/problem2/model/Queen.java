package Lab2.problem2.model;

public class Queen extends Piece {

    public Queen(Position pos) {
        super(pos);
    }

    @Override
    public boolean isLegalMove(Position pos) {
        if (isSamePosition(pos)) {
            return false;
        }

        boolean rookMove = this.pos.getRow() == pos.getRow() || this.pos.getCol() == pos.getCol();
        boolean bishopMove = rowDiff(pos) == colDiff(pos);

        return rookMove || bishopMove;
    }
}
