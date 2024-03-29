package com.fsgame.chessdesktop;


import com.fsgame.chesscore.chessboard.Board;
import com.fsgame.chesscore.chessboard.international.IntlChessBoard;
import com.fsgame.chesscore.enums.international.IntlRoleEnum;
import com.fsgame.chessdesktop.international.HomeUI;

public class ChessDesktopApplication {

    public static void main(String[] args) {

        new HomeUI();

        /*Board board = new IntlChessBoard(IntlRoleEnum.W);

        board.move(new int[]{7, 1}, new int[]{5, 2});
        board.move(new int[]{1, 0}, new int[]{2, 0});

        board.move(new int[]{6, 1}, new int[]{5, 1});
        board.move(new int[]{1, 1}, new int[]{2, 1});

        board.move(new int[]{7, 2}, new int[]{5, 0});
        board.move(new int[]{1, 2}, new int[]{2, 2});

        board.move(new int[]{6, 3}, new int[]{4, 3});
        board.move(new int[]{1, 3}, new int[]{2, 3});

        board.move(new int[]{7, 3}, new int[]{6, 3});
        board.move(new int[]{1, 4}, new int[]{2, 4});


        board.move(new int[]{7, 4}, new int[]{7, 2});
        board.move(new int[]{1, 5}, new int[]{2, 5});


        board.move(new int[]{5, 0}, new int[]{2, 3});

        System.out.println(board);*/


        // board.move(new int[]{7, 4}, new int[]{7, 0}); // 我方白向左异位
        // board.move(new int[]{0, 4}, new int[]{0, 0}); // 敌方黑向左异位
        // board.move(new int[]{7, 4}, new int[]{7, 7}); // 我方白向右异位
        // board.move(new int[]{0, 4}, new int[]{0, 7}); // 敌方黑向左异位

        // board.move(new int[]{7, 3}, new int[]{7, 0}); // 我方黑向左异位
        // board.move(new int[]{0, 3}, new int[]{0, 0}); // 敌方白向左异位
        // board.move(new int[]{7, 3}, new int[]{7, 7}); // 我方黑向右异位
        // board.move(new int[]{0, 3}, new int[]{0, 7}); // 敌方白向左异位
    }

}
