/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rickrocha.chess;

import br.com.rickrocha.chess.system.boardgame.Board;
import br.com.rickrocha.chess.system.boardgame.Piece;

/**
 *
 * @author rickelme
 */
public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
