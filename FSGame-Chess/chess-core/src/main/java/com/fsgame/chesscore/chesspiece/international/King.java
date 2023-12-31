package com.fsgame.chesscore.chesspiece.international;

import com.fsgame.chesscore.chessboard.Board;
import com.fsgame.chesscore.chessboard.WalkingRecords;
import com.fsgame.chesscore.chessboard.WalkingRecordsImpl;
import com.fsgame.chesscore.chesspiece.PieceMove;
import com.fsgame.chesscore.chesspiece.international.movespecific.Castling;
import com.fsgame.chesscore.enums.BaseEnum;
import com.fsgame.chesscore.enums.international.IntlBehaviorEnum;
import com.fsgame.chesscore.enums.international.IntlPieceEnum;
import com.fsgame.chesscore.utils.DirectionUtil;

/**
 * @Author: root
 * @Date: 2023/12/4 15:01
 * @Description:
 */
public class King extends AbstractIntlChessPiece {

    public King(Board board, int[] coord) {
        super(board, coord);
    }

    @Override
    protected void initAllowDirection() {
        allowDirectionSet.clear();
        DirectionUtil.allDirection(allowDirectionSet);
    }

    @Override
    protected void initAllowMoveBehavior() {
        super.initAllowMoveBehavior();
        allowMoveBehaviorList.add(board.getPieceMoveBehavior().get(IntlBehaviorEnum.CASTLING.getCode()));
    }

    @Override
    public IntlPieceEnum getType() {
        return IntlPieceEnum.K;
    }

    @Override
    public WalkingRecords move(int[] coord) {
        if (!super.allowMove(coord)) {
            return null;
        }
        for (PieceMove pieceMove : allowMoveBehaviorList) {
            WalkingRecords walkingRecords = pieceMove.move(board, this.coord, coord);
            if (walkingRecords != null) {
                return walkingRecords;
            }
        }
        if (stepNum(coord) > 1 || (board.getPiece(coord) != null && getRole().equals(board.getPiece(coord).getRole()))) {
            return null;
        }
        WalkingRecords.Record kingRecord = new WalkingRecords.RecordImpl(this, this.coord.clone(), coord.clone());
        board.swap(this.coord, coord);
        stepCount++;
        return new WalkingRecordsImpl.Builder()
                .record(kingRecord)
                .behavior(IntlBehaviorEnum.MOVE)
                .build();
    }
}
