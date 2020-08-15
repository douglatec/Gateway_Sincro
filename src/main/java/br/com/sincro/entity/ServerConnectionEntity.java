package br.com.sincro.entity;

import java.net.Socket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ServerConetion")
public class ServerConnectionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private Socket SocketID;

	@Column
	private String deviceID;

	public ServerConnectionEntity() {

	}

	public ServerConnectionEntity(Socket socketID, String deviceID) {
		SocketID = socketID;
		this.deviceID = deviceID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Socket getSocketID() {
		return SocketID;
	}

	public void setSocketID(Socket socketID) {
		SocketID = socketID;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServerConnectionEntity other = (ServerConnectionEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ServerConetionEntity [id=" + id + ", SocketID=" + SocketID + ", deviceID=" + deviceID + "]";
	}

}
