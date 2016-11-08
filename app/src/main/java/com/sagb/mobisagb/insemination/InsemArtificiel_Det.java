package com.sagb.mobisagb.insemination;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;

import com.sagb.mobisagb.R;

/**
 * Created by USER on 07/11/16.
 */

public class InsemArtificiel_Det  extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */

     private  String date="";
    private  TextView dateCertIA_tv;
    private Spinner numCertIA_sp;
    private Spinner modeReglement_sp;

    private static   Context context;

        public InsemArtificiel_Det() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static InsemArtificiel_Det newInstance(Context context) {

            InsemArtificiel_Det fragment = new InsemArtificiel_Det();
            InsemArtificiel_Det.context = context;
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_insem_artificiel_det, container, false);

            dateCertIA_tv  = (TextView) rootView.findViewById(R.id.dateCertIA);
            numCertIA_sp = (Spinner) rootView.findViewById(R.id.NumCertIA_sp);
            modeReglement_sp = (Spinner) rootView.findViewById(R.id.modeReglement_sp);

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InsemArtificiel_Det.context,
                    R.array.planets_array,  android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            numCertIA_sp.setAdapter(adapter);


            dateCertIA_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final Dialog dialog =  new Dialog(context);

                    dialog.setContentView(R.layout.calendar);
                    CalendarView cal=(CalendarView)dialog.findViewById(R.id.calendarView1);
                    Button pickDate=(Button)dialog.findViewById(R.id.pickDateTime);
                    pickDate.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            dateCertIA_tv.setText(date);
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
