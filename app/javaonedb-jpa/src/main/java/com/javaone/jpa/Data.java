package com.javaone.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the data database table.
 * 
 */
@Entity
@NamedQuery(name=Data.FIND_ALL, query="SELECT d FROM Data d")
public class Data implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String FIND_ALL = "Data.findAll";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeqGenData")
	@SequenceGenerator(name = "SeqGenData", sequenceName = "SQ_DATA", allocationSize = 1)	
	@Column(name="cod_data")
	private long codData;

	@Column(name="name_data")
	private String nameData;

	public Data() {
	}

	public long getCodData() {
		return this.codData;
	}

	public void setCodData(long codData) {
		this.codData = codData;
	}

	public String getNameData() {
		return this.nameData;
	}

	public void setNameData(String nameData) {
		this.nameData = nameData;
	}

	public String print() {
		return codData + " - " + nameData;
	}
}