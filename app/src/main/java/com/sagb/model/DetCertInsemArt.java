package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by USER on 08/11/16.
 */

@Entity
public class DetCertInsemArt {

    @Id
    private long Id_DetCertIA;

    @Property(nameInDb = "Id_Semence")
    private  long Id_Semence;

    @Property(nameInDb = "OrdreIA")
    private  long OrdreIA;

    @Property(nameInDb = "SignChal")
    private  String SignChal;

    @Property(nameInDb = "PrixSem")
    private  double PrixSem;

    @Property(nameInDb = "Id_Animal")
    private  long Id_Animal;

    @Property(nameInDb = "Id_CertIA")
    private  long Id_CertIA;

    @Property(nameInDb = "NumLact")
    private  long NumLact;

    @Property(nameInDb = "Export")
    private  long export;

    @Property(nameInDb = "Motif_Reset")
    private  long motifReset;

    @Property(nameInDb = "SNIT")
    private  boolean snit;

    @Property(nameInDb = "Modif")
    private  boolean modif;


    @ToOne(joinProperty = "Id_CertIA")
    private  CertInsemArt certInsemArt;

    @ToOne(joinProperty = "Id_Semence")
    private  Semence semence;


}
