/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rickrocha.chess.pieces;

import br.com.rickrocha.chess.ChessPiece;
import br.com.rickrocha.chess.Color;
import br.com.rickrocha.chess.system.boardgame.Board;
import br.com.rickrocha.chess.system.boardgame.Piece;

/**
 *
 * @author rickelme
 */
public class Rook extends ChessPiece {

    public Rook(Color color, Board board) {
        super(color, board);
    }

    @Override
    public String toString() {
        return "R";
    }

}
