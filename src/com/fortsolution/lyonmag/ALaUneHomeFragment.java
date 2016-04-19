package com.fortsolution.lyonmag;

import java.util.ArrayList;
import java.util.List;

import com.fortsolution.lyonmag.adapter.AdapterForMainScreenListView;
import com.fortsolution.lyonmag.model.Theme;
import com.fortsolution.lyonmag.utils.Library;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;

public class ALaUneHomeFragment extends Fragment implements OnClickListener {
	private Library library;
	ListView listview;
	List<Theme> mainlistitems = new ArrayList<Theme>();
	@Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
		
		library = new Library(getActivity());
	        View rootView = inflater.inflate(R.layout.alaunehomefragmentmainlayout, container, false);
	        listview = (ListView) rootView.findViewById(R.id.alaunehomelistview);
	        Theme t1 = new Theme();
	        t1.setImageheadertxt("Lorem ipssum dolor si amet");
	        t1.setImageheaderdetail("hffieufijvm eofke ek koef k");
			t1.setHeaderthem("THEME");
			t1.setHeaderdetail("theme is been creatyed");
			mainlistitems.add(t1);
			Theme t2 = new Theme();
			
			t2.setHeaderthem("THEME");
			t2.setHeaderdetail("theme is been creatyed");
			mainlistitems.add(t2);
			Theme t3 = new Theme();
			
			t3.setHeaderthem("THEME");
			t3.setHeaderdetail("theme is been creatyed");
			mainlistitems.add(t3);
			Theme t4 = new Theme();
			t4.setHeaderthem("THEME");
			t4.setHeaderdetail("theme is been creatyed");
			mainlistitems.add(t4);
			Theme t5 = new Theme();
			t5.setHeaderthem("THEME");
			t5.setHeaderdetail("theme is been creatyed");
			mainlistitems.add(t5);
			Theme t6 = new Theme();
			t6.setHeaderthem("THEME");
			t6.setHeaderdetail("theme is been creatyed");
			mainlistitems.add(t6);
			adapterForALaUneHomeScreenList();
			return rootView;
	}
	private void adapterForALaUneHomeScreenList() {
		AdapterForMainScreenListView adapter = new AdapterForMainScreenListView(getActivity(), android.R.layout.simple_list_item_1, mainlistitems);
		listview.setAdapter(adapter);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
