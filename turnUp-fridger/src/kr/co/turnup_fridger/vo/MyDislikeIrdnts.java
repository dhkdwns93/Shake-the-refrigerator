package kr.co.turnup_fridger.vo;

public class MyDislikeIrdnts {
	private int myDislikeIrdntsKey;
	private int irdntId;
	private String memberId;
	private Member member;
	
	
	public MyDislikeIrdnts() {
	}
	


	public MyDislikeIrdnts(int myDislikeIrdntsKey, int irdntId, String memberId) {
		this.myDislikeIrdntsKey = myDislikeIrdntsKey;
		this.irdntId = irdntId;
		this.memberId = memberId;
	}



	public MyDislikeIrdnts(int myDislikeIrdntsKey, int irdntId, String memberId, Member member) {
		this.myDislikeIrdntsKey = myDislikeIrdntsKey;
		this.irdntId = irdntId;
		this.memberId = memberId;
		this.member = member;
	}



	public int getMyDislikeIrdntsKey() {
		return myDislikeIrdntsKey;
	}



	public void setMyDislikeIrdntsKey(int myDislikeIrdntsKey) {
		this.myDislikeIrdntsKey = myDislikeIrdntsKey;
	}



	public int getIrdntId() {
		return irdntId;
	}



	public void setIrdntId(int irdntId) {
		this.irdntId = irdntId;
	}



	public String getMemberId() {
		return memberId;
	}



	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}



	public Member getMember() {
		return member;
	}



	public void setMember(Member member) {
		this.member = member;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + irdntId;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + myDislikeIrdntsKey;
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
		MyDislikeIrdnts other = (MyDislikeIrdnts) obj;
		if (irdntId != other.irdntId)
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (myDislikeIrdntsKey != other.myDislikeIrdntsKey)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "MyDislikeIrdnts [myDislikeIrdntsKey=" + myDislikeIrdntsKey + ", irdntId=" + irdntId + ", memberId="
				+ memberId + ", member=" + member + "]";
	}
	
	
	
	
	
}
