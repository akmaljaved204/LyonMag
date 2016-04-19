package com.fortsolution.lyonmag.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
	private List<Fragment> fragments;
	public PageAdapter(FragmentManager fm, List<Fragment> fragments) {
		super(fm);
		this.fragments = fragments;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return this.fragments.get(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.fragments.size();
	}

}
