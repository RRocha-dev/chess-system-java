/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.rickrocha.chess.system;

import br.com.rickrocha.chess.ChessMatch;
import br.com.rickrocha.chess.system.boardgame.Board;
import br.com.rickrocha.chess.system.boardgame.Position;

/**
 *
 * @author rickelme
 */
public class ChessSystem {

    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        
        UI.printBoard(chessMatch.getPieces());

    }
}
