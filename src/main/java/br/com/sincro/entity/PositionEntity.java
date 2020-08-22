package br.com.sincro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Positions")
public class PositionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;

	@Column
	private String position;

	public PositionEntity() {

	}

	public PositionEntity(int id, String position) {
		super();
		Id = id;
		this.position = position;

	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "PositionEntity [Id=" + Id + ", position=" + position + "]";
	}

}
