package com.siribalajitowers;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.GridView;

import com.origamilabs.library.views.StaggeredGridView;
import com.siribalajitowers.adapter.ColorGridViewAdapter;

public class MainActivity extends Activity {

	private StaggeredGridView mGvColors;
	private ColorGridViewAdapter colorGridViewAdapter;
	private TypedArray colors;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mGvColors = (StaggeredGridView) findViewById(R.id.home_GV_home_items);

		colors = getResources().obtainTypedArray(R.array.participant);
		
		colorGridViewAdapter = new ColorGridViewAdapter(this, colors);
		mGvColors.setAdapter(colorGridViewAdapter);

//		onItemClick(StaggeredGridView parent, View view, int position, long id);
//
//		onItemLongClick(StaggeredGridView parent, View view, int position, long id);
		
	}

}

