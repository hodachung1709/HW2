package vn.com.hunghd.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivChessBoard;
    private ChessBoard chessBoard;


    private int rowQty = 3;//
    private int colQty = 3;//

    private int bitmapWidth;//
    private int bitmapHeight;//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivChessBoard = findViewById(R.id.ivChessBoard);
        chessBoard = new ChessBoard(this,rowQty, colQty,
                ivChessBoard.getWidth(),ivChessBoard.getHeight());

        ivChessBoard.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return chessBoard.onTouch(view, motionEvent);
            }
        });


    }
}
