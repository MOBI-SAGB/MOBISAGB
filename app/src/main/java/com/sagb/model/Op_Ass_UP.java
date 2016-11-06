package com.sagb.model;

import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by USER on 06/11/16.
 */

public class Op_Ass_UP {

    private  long CodeUP;
    private  long CodeOper;

    @ToOne(joinProperty = "CodeOper")
    private Operateur operateur;

    @ToOne(joinProperty = "CodeUP")
    private UniteProduction uniteProduction;
}
