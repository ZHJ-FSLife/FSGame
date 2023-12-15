package com.fsgame.chess.rule.chesspiece.international.movespecific;

import com.fsgame.chess.rule.chessboard.Board;
import com.fsgame.chess.rule.chessboard.WalkingRecords;
import com.fsgame.chess.rule.chessboard.WalkingRecordsImpl;
import com.fsgame.chess.rule.chesspiece.Piece;
import com.fsgame.chess.rule.enums.international.IntlBehaviorEnum;

/**
 * @Author: root
 * @Date: 2023/12/7 20:14
 * @Description:
 */
public class Capture extends AbstractIntlPieceMove {

    @Override
    public WalkingRecords move(Board board, int[] source, int[] target) {
        Piece sourcePiece = board.getPiece(source);
        Piece targetPiece = board.getPiece(target);
        if (sourcePiece == null || targetPiece == null) {
            return null;
        }

        // 俩棋子不能为同一色
        if (targetPiece != null && sourcePiece.getRole().equals(targetPiece.getRole())) {
            return null;
        }

        WalkingRecords.Record pieceRecord = new WalkingRecords.RecordImpl(sourcePiece, source.clone(), target.clone());
        board.swap(source, target);
        board.updateBoard(source, null);
        return new WalkingRecordsImpl.Builder()
                .record(pieceRecord)
                .behavior(IntlBehaviorEnum.CAPTURE)
                .build();
    }
}
