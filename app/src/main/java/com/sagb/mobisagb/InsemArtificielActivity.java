package com.sagb.mobisagb;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import com.sagb.mobisagb.insemination.InsemArtificiel_Init;

import static com.sagb.mobisagb.R.layout.insem_artificiel_fragment_p1;

public class InsemArtificielActivity extends AppCompatActivity {

SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;
    private static final String ARG_SECTION_NUMBER = "section_number";
     static Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_lait);
        context = InsemArtificielActivity.this;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_controle_lait, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) { return true; }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        String date="";


        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {



            PlaceholderFragment fragment = new PlaceholderFragment();

            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);

            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_insem_artificiel_det, container, false);

            final TextView dateCertIA  = (TextView) rootView.findViewById(R.id.dateCertIA);

            dateCertIA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    final Dialog dialog =  new Dialog(context);

                    dialog.setContentView(R.layout.calendar);
                    CalendarView cal=(CalendarView)dialog.findViewById(R.id.calendarView1);
                    Button pickDate=(Button)dialog.findViewById(R.id.pickDateTime);
                    pickDate.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            dateCertIA.setText(date);
                            dialog.dismiss();

                        }
                    });
                    cal.setHorizontalScrollBarEnabled(true);
                cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

                        @Override
                        public void onSelectedDayChange(CalendarView view, int year, int month,int dayOfMonth) {

                            date=dayOfMonth+" / "+month+" / "+year;

                        }
                    });

                    dialog.show();

                }
            });


            return rootView;

        }
    }
    public static class MyFragment  extends Fragment{

        public static MyFragment newInstance(int sectionNumber) {

            MyFragment fragment = new MyFragment();

            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);

            return fragment;

        }

        //The MyFragment is the constructor method of our class, let it stay empty and public
        public MyFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(insem_artificiel_fragment_p1, container, false);

            return rootView;
        }

    }
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

            switch(position){
                case 0: return   PlaceholderFragment.newInstance(position);
                case 1 : return   InsemArtificiel_Init.newInstance();

            }
            return null; //if you use default, you would not need to return
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
            }
            return null;
        }
    }
}
