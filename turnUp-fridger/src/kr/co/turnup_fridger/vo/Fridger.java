package kr.co.turnup_fridger.vo;

import java.util.List;

public class Fridger {
	private int fridgerId;
	private String fridgerName;
	private List<MyIrdnt> myIrdntList;
	
	
	public Fridger() {
	}
	
	

	public Fridger(int fridgerId, String fridgerName) {
		this.fridgerId = fridgerId;
		this.fridgerName = fridgerName;
	}




	public Fridger(int fridgerId, String fridgerName, List<MyIrdnt> myIrdntsList) {
		this.fridgerId = fridgerId;
		this.fridgerName = fridgerName;
		this.myIrdntList = myIrdntsList;
	}


	public int getFridgerId() {
		return fridgerId;
	}


	public void setFridgerId(int fridgerId) {
		this.fridgerId = fridgerId;
	}


	public String getFridgerName() {
		return fridgerName;
	}


	public void setFridgerName(String fridgerName) {
		this.fridgerName = fridgerName;
	}


	public List<MyIrdnt> getMyIrdntList() {
		return myIrdntList;
	}


	public void setMyIrdntList(List<MyIrdnt> myIrdntsList) {
		this.myIrdntList = myIrdntsList;
	}




	@Override
	public String toString() {
		return "Fridger [fridgerId=" + fridgerId + ", fridgerName=" + fridgerName + ", myIrdntList=" + myIrdntList
				+ "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fridgerId;
		result = prime * result + ((fridgerName == null) ? 0 : fridgerName.hashCode());
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
		Fridger other = (Fridger) obj;
		if (fridgerId != other.fridgerId)
			return false;
		if (fridgerName == null) {
			if (other.fridgerName != null)
				return false;
		} else if (!fridgerName.equals(other.fridgerName))
			return false;
		return true;
	}
	
	
	

}
