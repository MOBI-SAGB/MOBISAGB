package com.sagb.mobisagb.insemination;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.sagb.mobisagb.R;
import com.sagb.model.CertInsemArt;


public class InsemArtificielActivity extends AppCompatActivity implements  InsemArtificiel_Init.OnFragmentInteractionListener{

private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;
    private Context context;
    private  Bundle args ;

    public final static int INTERACTION_NEXT_PAGE = 1;
    public final static int INTERACTION_PREV_PAGE = 4;
    public final static int INTERACTION_UPDATE_DETAILS_CERT=2;
    public final static int INTERACTION_UPDATE_LIST_CERT_IA=3;
    public final static int FRAG_DET  = 1;
    public final static int FRAG_INIT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insem_artificiel);

        Toolbar toolbar = (Toolbar) findViewById(R.id.Insemtoolbar);
        setSupportActionBar(toolbar);

         args = new Bundle();


        context = InsemArtificielActivity.this;

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        // disable Pager Sweeping
        mViewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mViewPager.setCurrentItem(mViewPager.getCurrentItem());
                return true;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.activity_tarvel_actions, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) { return true; }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(int action, long uri, CertInsemArt certInsemArt) {


        switch (action){

            case INTERACTION_UPDATE_DETAILS_CERT :
                InsemArtificiel_Init.newInstance(context).updateTableIA(uri);
                break;

            case INTERACTION_NEXT_PAGE :
                InsemArtificiel_Init.newInstance(context).setCertIA(certInsemArt);
                       mViewPager.setCurrentItem(1);
                break;

            case INTERACTION_PREV_PAGE :
                       mViewPager.setCurrentItem(0);
                break;

            case INTERACTION_UPDATE_LIST_CERT_IA :
                InsemArtificiel_Det.getInstance().initListNumCertIA();
                InsemArtificiel_Det.getInstance().initListDetCertInsemArt();
                break;

        }

    }




    /**
     * A placeholder fragment containing a simple view.
     */


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }



        @Override
        public Fragment getItem(int position) {

            return getPage(position);

        }

        @Override
        public int getCount() {
            // Show 2 total pages.

            return 2;
        }



    }

    public Fragment getPage(int position){
        Log.i("PAGE POS : ",position+"");

        Fragment fragment=null;
        switch(position){
            case 0:
                args.putLong(InsemArtificiel_Det.CODE_OPER,1);
                args.putLong(InsemArtificiel_Det.CODE_UP,2);
                fragment = InsemArtificiel_Det.newInstance(context) ;
                fragment.setArguments(args);
               break;
            case 1 :

                fragment =  InsemArtificiel_Init.newInstance(context);
                break;
        }
        return fragment; //if you use default, you would not need to return
    }


}
