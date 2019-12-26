package com.walvet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Story {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
    private String specie;
    private Date fecha;
    private String race;
    private String colour;
    private String gender;
    private String bornDate;
    private String age;
    private String story;
    private String owner;
    private String actitud;
    private String direccion;
    private String phone;
    private String anamesis;
    private String actitude;
    private String temperamento;
    private String cc;
    private String peso;
    private String mm;
    private String tllc;
    private String fc;
    private String fr;
    private String tp;
    private String dh;
    private String cavidadoral;
    private String cavidadnasal;
    private String ojosoidos;
    private String cardiorespiratorio;
    private String digestivo;
    private String nefrourologico;
    private String musculoesqueletico;
    private String pielanexos;
    private String linfatico;
    private String nervioso;


	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getTllc() {
		return tllc;
	}

	public void setTllc(String tllc) {
		this.tllc = tllc;
	}

	public String getFc() {
		return fc;
	}

	public void setFc(String fc) {
		this.fc = fc;
	}

	public String getFr() {
		return fr;
	}

	public void setFr(String fr) {
		this.fr = fr;
	}

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}


	public String getDigestivo() {
		return digestivo;
	}

	public void setDigestivo(String digestivo) {
		this.digestivo = digestivo;
	}

	public String getNefrourologico() {
		return nefrourologico;
	}

	public void setNefrourologico(String nefrourologico) {
		this.nefrourologico = nefrourologico;
	}

	public String getLinfatico() {
		return linfatico;
	}

	public void setLinfatico(String linfatico) {
		this.linfatico = linfatico;
	}

	public String getNervioso() {
		return nervioso;
	}

	public void setNervioso(String nervioso) {
		this.nervioso = nervioso;
	}

	public String getCavidadoral() {
		return cavidadoral;
	}

	public void setCavidadoral(String cavidadoral) {
		this.cavidadoral = cavidadoral;
	}

	public String getCavidadnasal() {
		return cavidadnasal;
	}

	public void setCavidadnasal(String cavidadnasal) {
		this.cavidadnasal = cavidadnasal;
	}

	public String getOjosoidos() {
		return ojosoidos;
	}

	public void setOjosoidos(String ojosoidos) {
		this.ojosoidos = ojosoidos;
	}

	public String getCardiorespiratorio() {
		return cardiorespiratorio;
	}

	public void setCardiorespiratorio(String cardiorespiratorio) {
		this.cardiorespiratorio = cardiorespiratorio;
	}

	public String getMusculoesqueletico() {
		return musculoesqueletico;
	}

	public void setMusculoesqueletico(String musculoesqueletico) {
		this.musculoesqueletico = musculoesqueletico;
	}

	public String getPielanexos() {
		return pielanexos;
	}

	public void setPielanexos(String pielanexos) {
		this.pielanexos = pielanexos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBornDate() {
		return bornDate;
	}

	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getActitud() {
		return actitud;
	}

	public void setActitud(String actitud) {
		this.actitud = actitud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAnamesis() {
		return anamesis;
	}

	public void setAnamesis(String anamesis) {
		this.anamesis = anamesis;
	}

	public String getActitude() {
		return actitude;
	}

	public void setActitude(String actitude) {
		this.actitude = actitude;
	}

}
