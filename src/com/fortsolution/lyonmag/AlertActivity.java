package com.fortsolution.lyonmag;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


public class AlertActivity extends Fragment implements OnClickListener {
	 private Button btNenvoyer;
	@Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	        View rootView = inflater.inflate(R.layout.alerte_tab, container, false);
	        btNenvoyer=(Button) rootView.findViewById(R.id.envoyerbutton);
	        return rootView;
	
	}
	@Override
	public void onClick(View v) {
				
	}

}
