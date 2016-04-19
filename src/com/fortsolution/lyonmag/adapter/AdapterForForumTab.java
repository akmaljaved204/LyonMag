package com.fortsolution.lyonmag.adapter;

import java.util.List;

import com.fortsolution.lyonmag.R;
import com.fortsolution.lyonmag.model.Forum;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AdapterForForumTab extends ArrayAdapter<Forum>{
	int textViewResourceid;
	LayoutInflater inflater;
	TextView txtofforum;
	public AdapterForForumTab(Context context, int resource, List<Forum> objects) {
		super(context, resource, objects);
		textViewResourceid = resource;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v;
		Forum item = getItem(position);
		v = inflater.inflate(textViewResourceid, parent, false);
		txtofforum = (TextView) v.findViewById(R.id.forumtxt);
		txtofforum.setText(item.getForumdetail());
		
		
		
		
		return v;
	}

}
