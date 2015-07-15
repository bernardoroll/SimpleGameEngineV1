package com.book.simplegameengine_v1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class SGRenderer {
	
	private Canvas mTempCanvas;
	private Paint mTempPaint = new Paint();
	private RectF mTempDstRect = new RectF();
	
	public SGRenderer() {
		
	}
	
	public void beginDrawing(Canvas canvas, int backgroundColor) {
		mTempCanvas = canvas;
		canvas.drawColor(backgroundColor);
	}
	
	public void endDrawing(){
		
	}
	
	public void drawRect(Rect source, int color, int alpha) {
		mTempPaint.setColor(color);
		mTempPaint.setAlpha(alpha);
		mTempPaint.setStyle(Paint.Style.FILL);
		mTempCanvas.drawRect(source, mTempPaint);
	}
	
	public void drawRect(RectF source, int color, int alpha) {
		mTempPaint.setColor(color);
		mTempPaint.setAlpha(alpha);
		mTempPaint.setStyle(Paint.Style.FILL);
		mTempCanvas.drawRect(source, mTempPaint);
	}
	
	public void drawOutlineRect(Rect worldSpaceDestination, int color, int alpha) {
		mTempPaint.setColor(color);
		mTempPaint.setAlpha(alpha);
		mTempPaint.setStyle(Paint.Style.STROKE);
		mTempPaint.setStrokeWidth(0);
		
		mTempDstRect.set(worldSpaceDestination);
		mTempDstRect.right -= 1;
		mTempDstRect.bottom -= 1;
		mTempCanvas.drawRect(mTempDstRect, mTempPaint);
	}
	
	public void drawOutlineRect(RectF worldSpaceDestination, int color, int alpha) {
		mTempPaint.setColor(color);
		mTempPaint.setAlpha(alpha);
		mTempPaint.setStyle(Paint.Style.STROKE);
		mTempPaint.setStrokeWidth(0);
		
		mTempDstRect.set(worldSpaceDestination);
		mTempDstRect.right -= 1;
		mTempDstRect.bottom -= 1;
		mTempCanvas.drawRect(mTempDstRect, mTempPaint);
	}
	
	public void drawImage(SGImage image, Rect source, RectF destination) {
		if(image != null) {
			Bitmap bitmap = image.getBitmap();
			mTempCanvas.drawBitmap(bitmap, source, destination, mTempPaint);
		}
		else {
			drawRect(destination, Color.RED, 156);
		}
	}

}
