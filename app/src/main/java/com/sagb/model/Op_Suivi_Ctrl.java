package com.sagb.model;

import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by USER on 06/11/16.
 */

public class Op_Suivi_Ctrl {

    private long CodeOper;
    private long Id_SessCL;

    @ToOne(joinProperty = "CodeOper")
    private Operateur operateur;

    @ToOne(joinProperty = "Id_SessCL")
    private SessionControle sessionControle;


}
