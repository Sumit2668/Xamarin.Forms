package com.xamarin.forms.platform.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.*;


public class FormsViewGroup extends ViewGroup {

	public FormsViewGroup(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public FormsViewGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public FormsViewGroup(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public void measureAndLayout (int widthMeasureSpec, int heightMeasureSpec, int l, int t, int r, int b)
	{
		measure (widthMeasureSpec, heightMeasureSpec);
		layout (l, t, r, b);
	}
	
	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
	}

	boolean inputTransparent;
	
	protected void setInputTransparent (boolean value)
	{
		inputTransparent = value;
	}
	
	protected boolean getInputTransparent ()
	{
		return inputTransparent;
	}
	
	@Override
	public boolean onInterceptTouchEvent (MotionEvent ev)
	{
		if (inputTransparent)
			return false;
		
		return super.onInterceptTouchEvent(ev);
	}
	
	@Override
	public boolean onTouchEvent (MotionEvent ev)
	{
		if (inputTransparent)
			return false;
		
		return super.onTouchEvent(ev);
	}
	
	public void sendBatchUpdate (
			float pivotX,
			float pivotY,
			int visibility,
			boolean enabled,
			float opacity,
			float rotation, 
			float rotationX, 
			float rotationY,
			float scale,
			float translationX,
			float translationY){
		setPivotX (pivotX);
		setPivotY (pivotY);
		
		if (getVisibility () != visibility)
			setVisibility (visibility);
		
		if (isEnabled () != enabled)
			setEnabled (enabled);
		
		setAlpha (opacity);
		setRotation (rotation);
		setRotationX (rotationX);
		setRotationY (rotationY);
		setScaleX (scale);
		setScaleY (scale);
		setTranslationX (translationX);
		setTranslationY (translationY);
	}
}
