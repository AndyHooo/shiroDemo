package com.andy.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_per database table.
 * 
 */
@Entity
@Table(name="t_per")
@NamedQuery(name="Per.findAll", query="SELECT p FROM Per p")
public class Per implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String per;

	@Column(name="user_id")
	private int userId;

	public Per() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPer() {
		return this.per;
	}

	public void setPer(String per) {
		this.per = per;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}