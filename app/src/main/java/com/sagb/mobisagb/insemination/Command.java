package com.sagb.mobisagb.insemination;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import static android.content.DialogInterface.BUTTON_NEGATIVE;
import static android.content.DialogInterface.BUTTON_POSITIVE;

/**
 * Created by USER on 10/11/16.
 */

abstract public class Command implements DialogInterface.OnClickListener {
    @Override
    public final void onClick(DialogInterface dialog, int which) {
        switch (which){
            case  BUTTON_POSITIVE:  execute();break;
            case  BUTTON_NEGATIVE:  executeNegative();break;
        }

        dialog.dismiss();
    }

    abstract public void execute();
    abstract public void executeNegative();

    public void displayYesNoDialog(Context context, int messageId ) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(context.getString(messageId));
        builder.setPositiveButton("Continuer", this);
        builder.setNegativeButton("No",this);
        builder.show();
    }

}