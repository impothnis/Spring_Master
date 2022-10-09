package io.pavan.springdataJPA.tennisplayerjpa;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="get_all_players", query="SELECT p FROM Player p")
public class Player {
	@Id
	@GeneratedValue
	private int id;
    private String name;
    private String nationality;
    
    private Date birthDate;
    private int titles;
	
    public Player( ) {
    
    }
    
    public Player(String name, String nationality, Date birthDate, int titles) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.titles = titles;
	}

    public Player(int id, String name, String nationality, Date birthDate, int titles) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.titles = titles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getTitles() {
		return titles;
	}

	public void setTitles(int titles) {
		this.titles = titles;
	}

	@Override
	public String toString() {
		return "\nPlayer [id= " + id + ", name= " + name + ", nationality= " + nationality + ", birthDate= " + birthDate
				+ ", titles= " + titles + "]";
	}

    
    
}

