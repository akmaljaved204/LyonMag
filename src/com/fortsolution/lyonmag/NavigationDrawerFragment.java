package com.fortsolution.lyonmag;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment used for managing interactions for and presentation of a navigation
 * drawer. See the <a href=
 * "https://developer.android.com/design/patterns/navigation-drawer.html#Interaction"
 * > design guidelines</a> for a complete explanation of the behaviors
 * implemented here.
 */
public class NavigationDrawerFragment extends Fragment implements OnClickListener {

	/**
	 * Remember the position of the selected item.
	 */
	private static final String STATE_SELECTED_POSITION = "selected_navigation_drawer_position";
	private Context context;
	/**
	 * Per the design guidelines, you should show the drawer on launch until the
	 * user manually expands it. This shared preference tracks this.
	 */
	private static final String PREF_USER_LEARNED_DRAWER = "navigation_drawer_learned";

	/**
	 * A pointer to the current callbacks instance (the Activity).
	 */
	private NavigationDrawerCallbacks mCallbacks;

	/**
	 * Helper component that ties the action bar to the navigation drawer.
	 */
	private ActionBarDrawerToggle mDrawerToggle;
	View mDrawerListView;
	private DrawerLayout mDrawerLayout;
	private RelativeLayout mDrawerListViewa;
	private View mFragmentContainerView;

	private int mCurrentSelectedPosition = 0;
	private boolean mFromSavedInstanceState;
	private boolean mUserLearnedDrawer;
	private RelativeLayout relativeMain;
	private TextView txtaLaUne, txtfilInfo, txtcJazLyn, txtPolitique, txtSociete, txtSocial, txtEducation, txtSante,
			txtEnvironnement, txtCulture, txtHightech, txtJudiciare, txtFaitsdiver, txtSports, txtOlendirect, txtAsvel,
			txtLouendirect, txtEconomy, txtPeople, txtEtausilyon, txtMeteo;
	private Button btnSerch;
	private EditText edtSearch;
	private ImageView imgHomePage;
	// private SearchView search;
	private Activity activity;
	private ALaUneHomeScreen aLaUneHomeScreen;
	private TextView txtForSearch;

	public NavigationDrawerFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getActivity());
		mUserLearnedDrawer = sp.getBoolean(PREF_USER_LEARNED_DRAWER, true);

		if (savedInstanceState != null) {
			mCurrentSelectedPosition = savedInstanceState.getInt(STATE_SELECTED_POSITION);
			mFromSavedInstanceState = true;
		}
		// Select either the default item (0) or the last selected item.
		selectItem(mCurrentSelectedPosition);
	}

	public void openDrawer() {
		if (isDrawerOpen()) {

			mDrawerLayout.closeDrawer(Gravity.RIGHT);
		} else {
			mDrawerLayout.openDrawer(Gravity.LEFT);
		}
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		// Indicate that this fragment would like to influence the set of
		// actions in the action bar.
		setHasOptionsMenu(true);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mDrawerListView = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);

		txtaLaUne = (TextView) mDrawerListView.findViewById(R.id.a_la_un);
		txtfilInfo = (TextView) mDrawerListView.findViewById(R.id.fil_info);
		txtcJazLyn = (TextView) mDrawerListView.findViewById(R.id.c_jaz_lyn);
		txtPolitique = (TextView) mDrawerListView.findViewById(R.id.politique);
		txtSociete = (TextView) mDrawerListView.findViewById(R.id.societe);
		txtSocial = (TextView) mDrawerListView.findViewById(R.id.social);
		txtEducation = (TextView) mDrawerListView.findViewById(R.id.education);
		txtSante = (TextView) mDrawerListView.findViewById(R.id.sante);
		txtEnvironnement = (TextView) mDrawerListView.findViewById(R.id.environnement);
		txtCulture = (TextView) mDrawerListView.findViewById(R.id.culture);
		txtHightech = (TextView) mDrawerListView.findViewById(R.id.hightech);
		txtJudiciare = (TextView) mDrawerListView.findViewById(R.id.judiciare);
		txtFaitsdiver = (TextView) mDrawerListView.findViewById(R.id.faitsdiver);
		txtSports = (TextView) mDrawerListView.findViewById(R.id.sports);
		txtOlendirect = (TextView) mDrawerListView.findViewById(R.id.olendirect);
		txtAsvel = (TextView) mDrawerListView.findViewById(R.id.asvel);
		txtLouendirect = (TextView) mDrawerListView.findViewById(R.id.louendirect);
		txtEconomy = (TextView) mDrawerListView.findViewById(R.id.economy);
		txtPeople = (TextView) mDrawerListView.findViewById(R.id.people);
		txtEtausilyon = (TextView) mDrawerListView.findViewById(R.id.etausilyon);
		txtMeteo = (TextView) mDrawerListView.findViewById(R.id.meteo);

		txtaLaUne.setOnClickListener(this);
		txtfilInfo.setOnClickListener(this);
		txtcJazLyn.setOnClickListener(this);
		txtPolitique.setOnClickListener(this);
		txtSociete.setOnClickListener(this);
		txtSocial.setOnClickListener(this);
		txtEducation.setOnClickListener(this);
		txtSante.setOnClickListener(this);
		txtEnvironnement.setOnClickListener(this);
		txtCulture.setOnClickListener(this);
		txtHightech.setOnClickListener(this);
		txtJudiciare.setOnClickListener(this);
		txtFaitsdiver.setOnClickListener(this);
		txtSports.setOnClickListener(this);
		txtOlendirect.setOnClickListener(this);
		txtAsvel.setOnClickListener(this);
		txtLouendirect.setOnClickListener(this);
		txtEconomy.setOnClickListener(this);
		txtPeople.setOnClickListener(this);
		txtEtausilyon.setOnClickListener(this);
		txtMeteo.setOnClickListener(this);

		/*
		 * imgHomePage = (ImageView)
		 * mDrawerListView.findViewById(R.id.imageView1); search = (SearchView)
		 * mDrawerListView.findViewById(R.id.srchFromNews); search.clearFocus();
		 * getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams
		 * .SOFT_INPUT_STATE_ALWAYS_HIDDEN); txtNews = (RelativeLayout)
		 * mDrawerListView.findViewById(R.id.rlActulities); txtRadio =
		 * (RelativeLayout) mDrawerListView.findViewById(R.id.rlRadio);
		 * txtVideos = (RelativeLayout)
		 * mDrawerListView.findViewById(R.id.rlVideos); txtNewLetter =
		 * (RelativeLayout) mDrawerListView .findViewById(R.id.rlNewsLtr);
		 * txtRecherche = (RelativeLayout) mDrawerListView
		 * .findViewById(R.id.rlRecherch); txtPlus = (RelativeLayout)
		 * mDrawerListView.findViewById(R.id.rlPlus); rlHoroscope =
		 * (RelativeLayout) mDrawerListView.findViewById(R.id.rlHoroscope);
		 * txtForSearch= (TextView)
		 * mDrawerListView.findViewById(R.id.textView1); rlSearch =
		 * (RelativeLayout) mDrawerListView.findViewById(R.id.serachRl);
		 * edtSearch = (EditText) mDrawerListView.findViewById(R.id.edtSearch);
		 * btnSerch = (Button) mDrawerListView.findViewById(R.id.btnOk);
		 * 
		 * 
		 * txtEmission = (RelativeLayout) mDrawerListView
		 * .findViewById(R.id.rlEmission); txtFreuency = (RelativeLayout)
		 * mDrawerListView .findViewById(R.id.rlFreqncs); txtfavourite =
		 * (RelativeLayout) mDrawerListView .findViewById(R.id.rlFavoris);
		 * 
		 * txtdifusses = (RelativeLayout)
		 * mDrawerListView.findViewById(R.id.rltitrsDifss); txtBrodcast =
		 * (RelativeLayout) mDrawerListView.findViewById(R.id.rlPodcast);
		 */
		/*
		 * search.setOnClickListener(this); int id =
		 * search.getContext().getResources().getIdentifier(
		 * "android:id/search_src_text", null, null); TextView textView =
		 * (TextView) search.findViewById(id);
		 * textView.setTextColor(Color.WHITE); search.setOnQueryTextListener(new
		 * OnQueryTextListener() {
		 * 
		 * @Override public boolean onQueryTextChange(String newText) { //
		 * Log.e("onQueryTextChange", "called"); return false; }
		 * 
		 * @Override public boolean onQueryTextSubmit(String query) { if
		 * (getActivity() instanceof NewsActivity) { ((NewsActivity)
		 * activity).setsearchViewValue(query); } else { search.clearFocus();
		 * Intent intent = new Intent(getActivity(), NewsActivity.class);
		 * intent.putExtra("From", "SearchView"); intent.putExtra("ActivityFor",
		 * "searchView"); intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
		 * intent.putExtra("query", query); startActivity(intent);
		 * search.setQuery("", false); if (!(getActivity() instanceof
		 * RadioHomePage)) { getActivity().finish(); } }
		 * mDrawerLayout.closeDrawers(); return false; }
		 * 
		 * });
		 */
		/*
		 * txtRecherche.setOnClickListener(this);
		 * txtEmission.setOnClickListener(this);
		 * imgHomePage.setOnClickListener(this);
		 * txtNews.setOnClickListener(this); txtRadio.setOnClickListener(this);
		 * txtVideos.setOnClickListener(this);
		 * btnSerch.setOnClickListener(this);
		 * txtdifusses.setOnClickListener(this);
		 * txtfavourite.setOnClickListener(this);
		 * txtBrodcast.setOnClickListener(this);
		 * rlHoroscope.setOnClickListener(this);
		 * txtFreuency.setOnClickListener(this);
		 * txtNewLetter.setOnClickListener(this);
		 * txtPlus.setOnClickListener(this);
		 */
		return mDrawerListView;
	}

	public boolean isDrawerOpen() {
		return mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mFragmentContainerView);
	}

	public void setUp(int fragmentId, DrawerLayout drawerLayout, RelativeLayout relativeLayout, Activity activity) {
		mFragmentContainerView = getActivity().findViewById(fragmentId);
		mDrawerLayout = drawerLayout;
		relativeMain = relativeLayout;
		this.activity = activity;
		aLaUneHomeScreen =(ALaUneHomeScreen)activity;
		// set a custom shadow that overlays the main content when the drawer
		// opens

		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		// set up the drawer's list view with items and click listener

		mDrawerToggle = new ActionBarDrawerToggle(getActivity(), mDrawerLayout, R.drawable.ic_drawer,
				R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
			@Override
			public void onDrawerClosed(View drawerView) {
				super.onDrawerClosed(drawerView);
				if (!isAdded()) {
					return;
				}

				getActivity().invalidateOptionsMenu();
			}

			@Override
			public void onDrawerSlide(View drawerView, float slideOffset) {
				super.onDrawerSlide(drawerView, slideOffset);

				float xPositionOpenDrawer = mDrawerListView.getWidth();
				float xPositionWindowContent = (slideOffset * xPositionOpenDrawer);
				relativeMain.setX(xPositionWindowContent);

				// getActionBarView().setX(xPositionWindowContent);

			}

			@Override
			public void onDrawerOpened(View drawerView) {
				super.onDrawerOpened(drawerView);
				if (!isAdded()) {
					return;
				}

				if (!mUserLearnedDrawer) {

					mUserLearnedDrawer = true;
					SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getActivity());
					sp.edit().putBoolean(PREF_USER_LEARNED_DRAWER, true).apply();
				}

				getActivity().invalidateOptionsMenu(); // calls
														// onPrepareOptionsMenu()
			}
		};

		if (!mUserLearnedDrawer && !mFromSavedInstanceState) {
			mDrawerLayout.openDrawer(mFragmentContainerView);
		}
		mDrawerLayout.post(new Runnable() {
			@Override
			public void run() {
				mDrawerToggle.syncState();
			}
		});

		mDrawerLayout.setDrawerListener(mDrawerToggle);
	}

	public View getActionBarView() {
		Window window = getActivity().getWindow();
		final View decorView = window.getDecorView();
		final String packageName = "android";
		final int resId = this.getResources().getIdentifier("action_bar_container", "id", packageName);
		final View actionBarView = decorView.findViewById(resId);
		return actionBarView;
	}

	private void selectItem(int position) {

	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mCallbacks = (NavigationDrawerCallbacks) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException("Activity must implement NavigationDrawerCallbacks.");
		}
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mCallbacks = null;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(STATE_SELECTED_POSITION, mCurrentSelectedPosition);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Forward the new configuration the drawer toggle component.
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

		if (mDrawerLayout != null && isDrawerOpen()) {
			

		}
		super.onCreateOptionsMenu(menu, inflater);
	}

	public static interface NavigationDrawerCallbacks {

		void onNavigationDrawerItemSelected(int position);
	}

	public void hideKeyBoard() {
		InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(edtSearch.getWindowToken(), 0);

	}

	@Override
	public void onClick(View v) {
		if (v == txtaLaUne) {
			mDrawerLayout.closeDrawers();
			aLaUneHomeScreen.onALaUneClick();
		}
	}
}