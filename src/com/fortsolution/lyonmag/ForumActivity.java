package com.fortsolution.lyonmag;

import java.util.ArrayList;
import java.util.List;

import com.fortsolution.lyonmag.adapter.AdapterForForumTab;
import com.fortsolution.lyonmag.model.Forum;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class ForumActivity extends Activity {
	ListView listview;
	List<Forum> forumitems = new ArrayList<Forum>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forum_tab);
	 
 
       
        listview = (ListView) findViewById(R.id.forumlist);
        Forum f1 = new Forum();
        f1.setForumdetail("nous di pain di nous ly ly maza nous");
        forumitems.add(f1);
        Forum f2 = new Forum();
        f2.setForumdetail("nous di pain di nous ly ly maza nous");
        forumitems.add(f2);
        Forum f3 = new Forum();
        f3.setForumdetail("nous di pain di nous ly ly maza nous");
        forumitems.add(f3);
        Forum f4 = new Forum();
        f4.setForumdetail("nous di pain di nous ly ly maza nous");
        forumitems.add(f4);
       AdapterForForumTab adapter = new AdapterForForumTab(this, R.layout.forumitemslayout, forumitems);
       listview.setAdapter(adapter);
      
}
	}
