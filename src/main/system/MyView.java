package main.system;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View{
  public MyView(Context screen_context){
    super(screen_context);
  }

  @Override
  public void onDraw(Canvas canvas){
    super.onDraw(canvas);

    Paint paint = new Paint();
    canvas.drawColor(Color.DKGRAY);
    paint.setARGB(255 / 2, 100, 100, 255);
    paint.setTextSize(32);
    paint.setAntiAlias(true);
    canvas.drawText("hello world", 50, 300, paint);
  }
}