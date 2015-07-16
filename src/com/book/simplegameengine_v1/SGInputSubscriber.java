package com.book.simplegameengine_v1;

import android.view.MotionEvent;

public interface SGInputSubscriber {
	
	public void onDown(MotionEvent envent);
	
	public void onScroll(MotionEvent downEvent, MotionEvent moveEvent, float distanceX, float distanceY);
	
	public void onUp(MotionEvent event);
	
	public void onLongPress(MotionEvent event);

}
