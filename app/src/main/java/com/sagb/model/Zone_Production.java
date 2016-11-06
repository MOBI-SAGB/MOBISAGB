package com.sagb.model;

import org.greenrobot.greendao.annotation.Property;

/**
 * Created by USER on 06/11/16.
 */

public class Zone_Production {

    @Property(nameInDb = "Code_Zone") private long  Code_Zone;
           @Property(nameInDb = "Libelle") private String  Libelle;
           @Property(nameInDb = "Ref") private String Ref;
           @Property(nameInDb = "Id_Province") private long Id_Province;

}
