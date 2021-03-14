package vn.com.hunghd.hw;

import android.content.Context;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.View;

public class ChessBoard {

    private Bitmap bitmap;
    private Canvas canvas;
    private Paint paint;

    private int rowQty;//
    private int colQty;//

    private int bitmapWidth;//
    private int bitmapHeight;//

    private int[][] board;
    private int player;

    private Bitmap cross;
    private Bitmap tick;

    private Context context;//

    public ChessBoard() {
    }

    public ChessBoard(Context context, int rowQty
                      , int colQty, int bitmapWidth
                      , int bitmapHeight){

    }

    public void init(){

    }

    public Bitmap drawChessBoard(){
        return null;
    }

    public boolean checkWin(int player){
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent){
        return true;
    }

    public void reset(){

    }





}
