package com.fortsolution.lyonmag;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class ALaUneHomeScreen extends Activity
		implements OnClickListener, NavigationDrawerFragment.NavigationDrawerCallbacks {

	ListView listView;
	ImageView menubergur, menudots;
	Button alertbtn, forumbtn;
	Fragment fragment = null;
	private NavigationDrawerFragment mNavigationDrawerFragment;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alaunehomelayout);
		alertbtn = (Button) findViewById(R.id.alertbtn);
		forumbtn = (Button) findViewById(R.id.forumbtn);
		menudots = (ImageView) findViewById(R.id.menu_dots);
		// listView = (ListView) findViewById(R.id.themelistview);
		menubergur = (ImageView) findViewById(R.id.menu_bergur);
		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout),
				(RelativeLayout) findViewById(R.id.container), ALaUneHomeScreen.this);

		menubergur.setOnClickListener(this);
		alertbtn.setOnClickListener(this);
		menudots.setOnClickListener(this);
		// forumbtn.setOnClickListener(this);
		
		if (savedInstanceState == null) {
			// on first time display view for first nav item

			displayView();
		}
	}

	private void displayView() {
		if (fragment != null) {
			FragmentManager fragmentManager = getFragmentManager();
			fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();
			// update selected item and title, then close the drawer

		} else {
			// error in creating fragment
			Log.e("MainActivity", "Error in creating fragment");
			fragment = new ALaUneHomeFragment();
			displayView();
		}
	}

	

	@Override
	public void onClick(View v) {

		if (v == menubergur) {
			mNavigationDrawerFragment.openDrawer();
		}

		if (v == alertbtn) {
			fragment = new AlertActivity();
			displayView();
		}
		if (v == menudots) {
			try {
				mNavigationDrawerFragment.openDrawer();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void onALaUneClick() {
		if(fragment!= null){
			if(!(fragment instanceof ALaUneHomeFragment)){
				fragment = new ALaUneHomeFragment();
				displayView();
			}	
		}
	}
	
	@Override
	public void onNavigationDrawerItemSelected(int position) {
		
	}

}