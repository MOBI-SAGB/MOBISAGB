package com.sagb.mobisagb;

import android.app.Application;
import android.text.TextUtils;

/**
 * Created by S.HOUSNI on 08/11/2016.
 */

public class Cluser  extends Application{

    public LoginManager getLoginManager() {
        return loginManager;
    }

    private LoginManager loginManager;

    @Override
    public void onCreate() {
        super.onCreate();
        loginManager  = new LoginManager();
    }

    class LoginManager {
        private long codeOper;
        private String username;
        private String fullname;
        private int ifonction;

        public LoginManager(){
            this.username = "";
            this.fullname = "";
            this.ifonction = 0;
            this.codeOper = 0;
        }

        public void SaveLogin(long codeOper, String username, String fullname, int ifonction) {
            this.username = username;
            this.fullname = fullname;
            this.ifonction = ifonction;
            this.codeOper = codeOper;
        }

        public boolean isNotLoggedIn(){
            return TextUtils.isEmpty(username) ||
                    codeOper == 0;
        }

        public void logout() {
            this.username = "";
            this.fullname = "";
            this.ifonction = 0;
        }
    }
}
