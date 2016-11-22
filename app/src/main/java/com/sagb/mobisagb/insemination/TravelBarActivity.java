package com.sagb.mobisagb.insemination;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.sagb.mobisagb.R;


public class TravelBarActivity extends FragmentActivity  {

	// action bar
	private ActionBar actionBar;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insem_artificiel);

		actionBar = getActionBar();

		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setTitle("bar_title");
		useSelectedFragment(InsemArtificiel_Init.newInstance(TravelBarActivity.this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_tarvel_actions, menu);

		return super.onCreateOptionsMenu(menu);
	}

	/**
	 * On selecting action bar icons
	 * */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Take appropriate action for each action item click
		Fragment fragment=null;

		switch (item.getItemId()) {
		case R.id.action_add_travel:
			fragment=InsemArtificiel_Init.newInstance(TravelBarActivity.this);
			break ;
	
		case R.id.action_show_travels:
			fragment= InsemArtificiel_Init.newInstance(TravelBarActivity.this);
			break ;
			
		default:
			return super.onOptionsItemSelected(item);
		}
		
		if(fragment!=null){
			useSelectedFragment(fragment);
			return true;
		}else
			return false;
	}
	private void useSelectedFragment(Fragment fragment) {

		if(fragment!=null){
			FragmentManager fm= getSupportFragmentManager();
			fm.beginTransaction().replace(R.id.frame_container, fragment).commit();		
		}
	}
}
