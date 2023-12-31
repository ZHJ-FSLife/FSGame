package com.fsgame.chesscore.chesspiece;

import com.fsgame.chesscore.chessboard.WalkingRecords;
import com.fsgame.chesscore.enums.BaseEnum;

/**
 * @Author: root
 * @Date: 2023/12/4 14:51
 * @Description:
 */
public interface Piece {

    void updateCoord(int[] coord);

    void updateCoord(int x, int y);

    BaseEnum getType();

    void setRole(BaseEnum roleEnum);

    BaseEnum getRole();

    int getStepCount();

    boolean allowMove(int[] coord);

    WalkingRecords move(int[] coord);

    int stepNum(int[] coord);

    int stepNum(int[] source, int[] target);

    int[] getCoord();
}
