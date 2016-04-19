package com.fortsolution.lyonmag.adapter;

import java.util.List;

import com.fortsolution.lyonmag.R;
import com.fortsolution.lyonmag.model.Forum;
import com.fortsolution.lyonmag.model.Theme;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AdapterForMainScreenListView extends ArrayAdapter<Theme> {
	int textViewResourceid;
	LayoutInflater inflater;
	Context context;

	public AdapterForMainScreenListView(Context context, int textViewResourceId, List<Theme> objects) {

		super(context, textViewResourceId, objects);
		this.context = context;
		textViewResourceid = textViewResourceId;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = null;
		final Theme item = getItem(position);
		if (position == 0) {
			inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.alaunehomefragmentimageitem, parent, false);
		TextView txtimageheader = (TextView) row.findViewById(R.id.txtheader);
		TextView txtimagedetail = (TextView) row.findViewById(R.id.txtdetail);
		txtimageheader.setText(item.getImageheadertxt());
		txtimagedetail.setText(item.getImageheaderdetail());
		} else {
			Theme item2 = getItem(position);
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.mainlistitems, parent, false);
			TextView txtheader = (TextView) row.findViewById(R.id.a_la_itemheader);
			TextView txtdetail = (TextView) row.findViewById(R.id.a_la_itemdetail);
			txtheader.setText(item2.getHeaderthem());
			txtdetail.setText(item2.getHeaderdetail());
			return row;
		}
		return row;

	}
}
