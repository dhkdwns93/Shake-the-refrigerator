package kr.co.turnup_fridger.vo;

import java.util.Date;

public class MyIrdnt {

	private int myIrdntKey;
	private Date startDate;
	private Date endDate;
	private int freshLevel;
	private String irdntCount;
	private int irdntId;
	private String irdntName;
	private int fridgerId;
	private String irdntName;
	private Fridger fridger;
	private IrdntManage irdntManage; 	
	
	public MyIrdnt(){
		
	}

	public MyIrdnt(int myIrdntKey, Date startDate, Date endDate, int freshLevel, String irdntCount, int irdntId,
			int fridgerId, String irdntName, Fridger fridger, IrdntManage irdntManage) {
		this.myIrdntKey = myIrdntKey;
		this.startDate = startDate;
		this.endDate = endDate;
		this.freshLevel = freshLevel;
		this.irdntCount = irdntCount;
		this.irdntId = irdntId;
		this.fridgerId = fridgerId;
		this.irdntName = irdntName;
		this.fridger = fridger;
		this.irdntManage = irdntManage;
	}

	public int getMyIrdntKey() {
		return myIrdntKey;
	}

	public void setMyIrdntKey(int myIrdntKey) {
		this.myIrdntKey = myIrdntKey;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getFreshLevel() {
		return freshLevel;
	}

	public void setFreshLevel(int freshLevel) {
		this.freshLevel = freshLevel;
	}

	public String getIrdntCount() {
		return irdntCount;
	}

	public void setIrdntCount(String irdntCount) {
		this.irdntCount = irdntCount;
	}

	public int getIrdntId() {
		return irdntId;
	}

	public void setIrdntId(int irdntId) {
		this.irdntId = irdntId;
	}

	public int getFridgerId() {
		return fridgerId;
	}

	public void setFridgerId(int fridgerId) {
		this.fridgerId = fridgerId;
	}

	public String getIrdntName() {
		return irdntName;
	}

	public void setIrdntName(String irdntName) {
		this.irdntName = irdntName;
	}

	public Fridger getFridger() {
		return fridger;
	}

	public void setFridger(Fridger fridger) {
		this.fridger = fridger;
	}

	public IrdntManage getIrdntManage() {
		return irdntManage;
	}

	public void setIrdntManage(IrdntManage irdntManage) {
		this.irdntManage = irdntManage;
	}

	@Override
	public String toString() {
		return "MyIrdnt [myIrdntKey=" + myIrdntKey + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", freshLevel=" + freshLevel + ", irdntCount=" + irdntCount + ", irdntId=" + irdntId + ", fridgerId="
				+ fridgerId + ", irdntName=" + irdntName + ", fridger=" + fridger + ", irdntManage=" + irdntManage
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + freshLevel;
		result = prime * result + ((fridger == null) ? 0 : fridger.hashCode());
		result = prime * result + fridgerId;
		result = prime * result + ((irdntCount == null) ? 0 : irdntCount.hashCode());
		result = prime * result + irdntId;
		result = prime * result + ((irdntManage == null) ? 0 : irdntManage.hashCode());
		result = prime * result + ((irdntName == null) ? 0 : irdntName.hashCode());
		result = prime * result + myIrdntKey;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		MyIrdnt other = (MyIrdnt) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (freshLevel != other.freshLevel)
			return false;
		if (fridger == null) {
			if (other.fridger != null)
				return false;
		} else if (!fridger.equals(other.fridger))
			return false;
		if (fridgerId != other.fridgerId)
			return false;
		if (irdntCount == null) {
			if (other.irdntCount != null)
				return false;
		} else if (!irdntCount.equals(other.irdntCount))
			return false;
		if (irdntId != other.irdntId)
			return false;
		if (irdntManage == null) {
			if (other.irdntManage != null)
				return false;
		} else if (!irdntManage.equals(other.irdntManage))
			return false;
		if (irdntName == null) {
			if (other.irdntName != null)
				return false;
		} else if (!irdntName.equals(other.irdntName))
			return false;
		if (myIrdntKey != other.myIrdntKey)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	
	
}
