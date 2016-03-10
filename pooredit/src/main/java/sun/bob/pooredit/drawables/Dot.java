package sun.bob.pooredit.drawables;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/**
 * Created by bob.sun on 15/12/2.
 */
public class Dot extends Drawable {

    private Paint paint;
    private static Dot instance;
    private Dot(){
        paint = new Paint();
        paint.setColor(Color.BLACK);
    }

    public static Dot getInstance() {
        if (instance == null)
            instance = new Dot();
        return instance;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, 10, paint);
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }
}
