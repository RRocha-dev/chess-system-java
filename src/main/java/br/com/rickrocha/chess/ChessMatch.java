/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rickrocha.chess;

import br.com.rickrocha.chess.pieces.King;
import br.com.rickrocha.chess.pieces.Rook;
import br.com.rickrocha.chess.system.boardgame.Board;
import br.com.rickrocha.chess.system.boardgame.Position;

/**
 *
 * @author rickelme
 */
public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup() {
        placeWhitePieces();
        placeBlackPieces();
    }

    private void placeWhitePieces() {
        board.placePiece(new Rook(Color.WHITE, board), new Position(2, 1));
        board.placePiece(new King(Color.WHITE, board), new Position(7, 4));
    }

    private void placeBlackPieces() {
        board.placePiece(new King(Color.BLACK, board), new Position(0, 4));
    }
}
