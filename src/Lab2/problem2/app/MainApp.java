package Lab2.problem2.app;

import Lab2.problem2.model.*;

public class MainApp {
    static void main() {
        Piece rook = new Rook(new Position(3, 3));
        System.out.println("Initial position: " + rook.getPosition());
        System.out.println("Rook to (3,7): " + rook.isLegalMove(new Position(3, 7)));
        System.out.println("Rook to (5,5): " + rook.isLegalMove(new Position(5, 5)) + "\n");

        Piece bishop = new Bishop(new Position(2, 2));
        System.out.println("Initial position: " + bishop.getPosition());
        System.out.println("Bishop to (5,5): " + bishop.isLegalMove(new Position(5, 5)));
        System.out.println("Bishop to (2,5): " + bishop.isLegalMove(new Position(2, 5)) + "\n");

        Piece queen = new Queen(new Position(4, 4));
        System.out.println("Initial position: " + queen.getPosition());
        System.out.println("Queen to (4,1): " + queen.isLegalMove(new Position(4, 1)));
        System.out.println("Queen to (1,1): " + queen.isLegalMove(new Position(2, 1)) + "\n");

        Piece king = new King(new Position(4, 4));
        System.out.println("Initial position: " + king.getPosition());
        System.out.println("King to (5,5): " + king.isLegalMove(new Position(5, 5)));
        System.out.println("King to (6,6): " + king.isLegalMove(new Position(6, 6)) + "\n");

        Piece knight = new Knight(new Position(4, 4));
        System.out.println("Initial position: " + knight.getPosition());
        System.out.println("Knight to (6,5): " + knight.isLegalMove(new Position(6, 5)));
        System.out.println("Knight to (5,5): " + knight.isLegalMove(new Position(5, 5)) + "\n");

        Piece whitePawn = new Pawn(new Position(6, 3));
        System.out.println("Initial position: " + whitePawn.getPosition());
        System.out.println("White pawn to (5,3): " + whitePawn.isLegalMove(new Position(5, 3)));
        System.out.println("White pawn to (4,3): " + whitePawn.isLegalMove(new Position(4, 3)) + "\n");

        Piece blackPawn = new Pawn(new Position(1, 3));
        System.out.println("Initial position: " + blackPawn.getPosition());
        System.out.println("Black pawn to (2,3): " + blackPawn.isLegalMove(new Position(2, 3)));
        System.out.println("Black pawn to (3,3): " + blackPawn.isLegalMove(new Position(3, 3)) + "\n");
    }
}
