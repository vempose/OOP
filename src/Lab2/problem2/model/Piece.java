package Lab2.problem2.model;

public abstract class Piece {
    protected Position pos;

    public Piece(Position pos) {
        this.pos = pos;
    }

    public Position getPosition() {
        return pos;
    }

    public void setPosition(Position a) {
        this.pos = a;
    }

    public abstract boolean isLegalMove(Position b);

    protected int rowDiff(Position b) {
        return Math.abs(pos.getRow() - b.getRow());
    }

    protected int colDiff(Position b) {
        return Math.abs(pos.getCol() - b.getCol());
    }

    protected boolean isSamePosition(Position b) {
        return pos.sameAs(b);
    }
}
