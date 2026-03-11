package Lab2.problem2.model;

public abstract class Piece {
    protected Position pos;

    public Piece(Position pos) {
        this.pos = pos;
    }

    public Position getPosition() {
        return pos;
    }

    public void setPosition(Position pos) {
        this.pos = pos;
    }

    public abstract boolean isLegalMove(Position pos);

    protected int rowDiff(Position pos) {
        return Math.abs(this.pos.getRow() - pos.getRow());
    }

    protected int colDiff(Position pos) {
        return Math.abs(this.pos.getCol() - pos.getCol());
    }

    protected boolean isSamePosition(Position pos) {
        return this.pos.sameAs(pos);
    }
}
