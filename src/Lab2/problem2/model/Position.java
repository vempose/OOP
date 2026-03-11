package Lab2.problem2.model;

public class Position {
    private final int row;
    private final int col;

    public Position(int row, int col) {
        if (row < 0 || row > 7 || col < 0 || col > 7) {
            throw new IllegalArgumentException("Position must be between 0 and 7");
        }
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean sameAs(Position otherPos) {
        return this.row == otherPos.row && this.col == otherPos.col;
    }

    @Override
    public String toString() {
        return String.format("row %d, col %d", getRow(), getCol());
    }
}