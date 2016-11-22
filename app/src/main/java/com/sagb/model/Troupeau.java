package com.sagb.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.io.Serializable;
import java.util.Date;

@Entity(nameInDb = "Troupeau")
public class Troupeau implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Property(nameInDb = "id_animal")
	private long id_animal;

	private String codeup;
	private String codeetat;
	private String id_raceanim;
	private String id_origanim;
	@Property(nameInDb = "NNI_BOVIN")
	private String nni_bovin;
	private String statut;
	private String numlact;
	private String numctrl;
	private Date datedervel;
	private String codeoper;
	private String id_origmere;
	private String id_origpere;

	@Property(nameInDb = "id_origGPM")
	private String id_origGPM;

	@Property(nameInDb = "NumAncien")
	private String NumAncien;

	@Property(nameInDb = "NumTravail")
	private String NumTravail;
	@Property(nameInDb = "NumCarte")
	private String NumCarte;
	@Property(nameInDb = "DateIdent")
	private Date DateIdent;
	@Property(nameInDb = "DateNaiss")
	private Date DateNaiss;
	@Property(nameInDb = "DateEntree")
	private Date DateEntree;
	@Property(nameInDb = "NNI_Mere")
	private String NNI_Mere;
	@Property(nameInDb = "NomPere")
	private String NomPere;
	@Property(nameInDb = "NomGPM")
	private String NomGPM;
	@Property(nameInDb = "LieuIdent")
	private String LieuIdent;
	@Property(nameInDb = "SexeAnim")
	private String SexeAnim;
	@Property(nameInDb = "DateDerCntr")
	private Date DateDerCntr;
	@Property(nameInDb = "DateDerCG")
	private Date DateDerCG;
	@Property(nameInDb = "DateDerInsem")
	private Date DateDerInsem;
	@Property(nameInDb = "OrdreInsem")
	private String OrdreInsem;
	@Property(nameInDb = "DateDerTaris")
	private Date DateDerTaris;
	@Property(nameInDb = "NV_NNI")
	private String NV_NNI;
	@Property(nameInDb = "Num_Travail_Snit")
	private String Num_Travail_Snit;
	@Property(nameInDb = "Snit_Mere")
	private String Snit_Mere;
	@Property(nameInDb = "Id_Mere")
	private String Id_Mere;
	
	public Troupeau() {
	
	
	}



	@Generated(hash = 1067185935)
	public Troupeau(long id_animal, String codeup, String codeetat,
									String id_raceanim, String id_origanim, String nni_bovin, String statut,
									String numlact, String numctrl, Date datedervel, String codeoper,
									String id_origmere, String id_origpere, String id_origGPM,
									String NumAncien, String NumTravail, String NumCarte, Date DateIdent,
									Date DateNaiss, Date DateEntree, String NNI_Mere, String NomPere,
									String NomGPM, String LieuIdent, String SexeAnim, Date DateDerCntr,
									Date DateDerCG, Date DateDerInsem, String OrdreInsem, Date DateDerTaris,
									String NV_NNI, String Num_Travail_Snit, String Snit_Mere,
									String Id_Mere) {
					this.id_animal = id_animal;
					this.codeup = codeup;
					this.codeetat = codeetat;
					this.id_raceanim = id_raceanim;
					this.id_origanim = id_origanim;
					this.nni_bovin = nni_bovin;
					this.statut = statut;
					this.numlact = numlact;
					this.numctrl = numctrl;
					this.datedervel = datedervel;
					this.codeoper = codeoper;
					this.id_origmere = id_origmere;
					this.id_origpere = id_origpere;
					this.id_origGPM = id_origGPM;
					this.NumAncien = NumAncien;
					this.NumTravail = NumTravail;
					this.NumCarte = NumCarte;
					this.DateIdent = DateIdent;
					this.DateNaiss = DateNaiss;
					this.DateEntree = DateEntree;
					this.NNI_Mere = NNI_Mere;
					this.NomPere = NomPere;
					this.NomGPM = NomGPM;
					this.LieuIdent = LieuIdent;
					this.SexeAnim = SexeAnim;
					this.DateDerCntr = DateDerCntr;
					this.DateDerCG = DateDerCG;
					this.DateDerInsem = DateDerInsem;
					this.OrdreInsem = OrdreInsem;
					this.DateDerTaris = DateDerTaris;
					this.NV_NNI = NV_NNI;
					this.Num_Travail_Snit = Num_Travail_Snit;
					this.Snit_Mere = Snit_Mere;
					this.Id_Mere = Id_Mere;
	}

	

	public long getId_animal() {
		return id_animal;
	}

	public void setId_animal(long id_animal) {
		this.id_animal = id_animal;
	}

	public String getCodeup() {
		return codeup;
	}

	public void setCodeup(String codeup) {
		this.codeup = codeup;
	}

	public String getCodeetat() {
		return codeetat;
	}

	public void setCodeetat(String codeetat) {
		this.codeetat = codeetat;
	}

	public String getId_raceanim() {
		return id_raceanim;
	}

	public void setId_raceanim(String id_raceanim) {
		this.id_raceanim = id_raceanim;
	}

	public String getId_origanim() {
		return id_origanim;
	}

	public void setId_origanim(String id_origanim) {
		this.id_origanim = id_origanim;
	}

	public String getNni_bovin() {
		return nni_bovin;
	}

	public void setNni_bovin(String nni_bovin) {
		this.nni_bovin = nni_bovin;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getNumlact() {
		return numlact;
	}

	public void setNumlact(String numlact) {
		this.numlact = numlact;
	}

	public String getNumctrl() {
		return numctrl;
	}

	public void setNumctrl(String numctrl) {
		this.numctrl = numctrl;
	}

	public Date getDatedervel() {
		return datedervel;
	}

	public void setDatedervel(Date datedervel) {
		this.datedervel = datedervel;
	}

	public String getCodeoper() {
		return codeoper;
	}

	public void setCodeoper(String codeoper) {
		this.codeoper = codeoper;
	}

	public String getId_origmere() {
		return id_origmere;
	}

	public void setId_origmere(String id_origmere) {
		this.id_origmere = id_origmere;
	}

	public String getId_origpere() {
		return id_origpere;
	}

	public void setId_origpere(String id_origpere) {
		this.id_origpere = id_origpere;
	}

	public String getId_origGPM() {
		return id_origGPM;
	}

	public void setId_origGPM(String id_origGPM) {
		this.id_origGPM = id_origGPM;
	}

	public String getNumAncien() {
		return NumAncien;
	}

	public void setNumAncien(String numAncien) {
		NumAncien = numAncien;
	}

	public String getNumTravail() {
		return NumTravail;
	}

	public void setNumTravail(String numTravail) {
		NumTravail = numTravail;
	}

	public String getNumCarte() {
		return NumCarte;
	}

	public void setNumCarte(String numCarte) {
		NumCarte = numCarte;
	}

	public Date getDateIdent() {
		return DateIdent;
	}

	public void setDateIdent(Date dateIdent) {
		DateIdent = dateIdent;
	}

	public Date getDateNaiss() {
		return DateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		DateNaiss = dateNaiss;
	}

	public Date getDateEntree() {
		return DateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		DateEntree = dateEntree;
	}

	public String getNNI_Mere() {
		return NNI_Mere;
	}

	public void setNNI_Mere(String nNI_Mere) {
		NNI_Mere = nNI_Mere;
	}

	public String getNomPere() {
		return NomPere;
	}

	public void setNomPere(String nomPere) {
		NomPere = nomPere;
	}

	public String getNomGPM() {
		return NomGPM;
	}

	public void setNomGPM(String nomGPM) {
		NomGPM = nomGPM;
	}

	public String getLieuIdent() {
		return LieuIdent;
	}

	public void setLieuIdent(String lieuIdent) {
		LieuIdent = lieuIdent;
	}

	public String getSexeAnim() {
		return SexeAnim;
	}

	public void setSexeAnim(String sexeAnim) {
		SexeAnim = sexeAnim;
	}

	public Date getDateDerCntr() {
		return DateDerCntr;
	}

	public void setDateDerCntr(Date dateDerCntr) {
		DateDerCntr = dateDerCntr;
	}

	public Date getDateDerCG() {
		return DateDerCG;
	}

	public void setDateDerCG(Date dateDerCG) {
		DateDerCG = dateDerCG;
	}

	public Date getDateDerInsem() {
		return DateDerInsem;
	}

	public void setDateDerInsem(Date dateDerInsem) {
		DateDerInsem = dateDerInsem;
	}

	public String getOrdreInsem() {
		return OrdreInsem;
	}

	public void setOrdreInsem(String ordreInsem) {
		OrdreInsem = ordreInsem;
	}

	public Date getDateDerTaris() {
		return DateDerTaris;
	}

	public void setDateDerTaris(Date dateDerTaris) {
		DateDerTaris = dateDerTaris;
	}

	public String getNV_NNI() {
		return NV_NNI;
	}

	public void setNV_NNI(String nV_NNI) {
		NV_NNI = nV_NNI;
	}

	public String getNum_Travail_Snit() {
		return Num_Travail_Snit;
	}

	public void setNum_Travail_Snit(String num_Travail_Snit) {
		Num_Travail_Snit = num_Travail_Snit;
	}

	public String getSnit_Mere() {
		return Snit_Mere;
	}

	public void setSnit_Mere(String snit_Mere) {
		Snit_Mere = snit_Mere;
	}

	public String getId_Mere() {
		return Id_Mere;
	}

	public void setId_Mere(String id_Mere) {
		Id_Mere = id_Mere;
	}

	@Override
	public String toString() {
		return "SNIT: "+nni_bovin+" , IGB: "+NV_NNI;
	}

}
