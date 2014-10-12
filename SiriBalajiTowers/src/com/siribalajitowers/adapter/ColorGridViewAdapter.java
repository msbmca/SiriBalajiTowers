package com.siribalajitowers.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;

import com.siribalajitowers.R;

public class ColorGridViewAdapter extends BaseAdapter {
	
	private Context context;
	private TypedArray colors ;

	public ColorGridViewAdapter(Context context, TypedArray colors) {
		
		this.context = context;
		this.colors = colors;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View row = convertView;

		if (row == null) {
			
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(R.layout.color_grid_item, parent, false);
			
		} 
		
		RelativeLayout color = (RelativeLayout) row.findViewById(R.id.color_row_REl_color);
		color.setBackgroundDrawable(getRect(colors.getColor(position, 0)));
//		color.setBackgroundDrawable(getOval(colors.getColor(position, 0)));

		return row;

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return colors.length();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
	
	
	private ShapeDrawable getRect(int color){
		
		Drawable myDrawable = context.getResources().getDrawable(R.drawable.color_holder);
		Bitmap thePic = ((BitmapDrawable) myDrawable).getBitmap();
		
		 float[] outR = new float[] {6,6,6,6,6,6,6,6};   
         ShapeDrawable d = new ShapeDrawable(new RoundRectShape(outR, null, null));  
         d.setIntrinsicHeight(thePic.getWidth());  
         d.setIntrinsicWidth(thePic.getHeight());  
         d.getPaint().setColor(color);  
         d.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);  
         
         return d;
	}
	
	private ShapeDrawable getOval(int color){
		
		Drawable myDrawable = context.getResources().getDrawable(R.drawable.color_holder);
		Bitmap thePic = ((BitmapDrawable) myDrawable).getBitmap();
		ShapeDrawable d = new ShapeDrawable (new OvalShape());   
		d.setIntrinsicHeight(thePic.getWidth());  
		d.setIntrinsicWidth(thePic.getHeight()); 
		d.getPaint().setColor(color);   
		return d;
		
	}
	
}