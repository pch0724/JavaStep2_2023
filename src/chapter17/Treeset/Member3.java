package chapter17.Treeset;

import java.util.Comparator;

//public class Member3 implements Comparable<Member3>{ // TreeSet에서 정렬하기위해서는 implements Comparable<obj> 필요 => compareTo 메서드 오버라이딩 필요
public class Member3 implements Comparator<Member3>{ // TreeSet에서 정렬하기위해서는 comparator 사용시 기본생성자 필요 => compare 메서드 오버라이딩 필요 + 본 클래스를 참조하는 클래스의 생성자에 본 클래스 메모리 할당 필요
	
	private int memberId;
	private String memberName;
	
	public Member3() {
		// TODO Auto-generated constructor stub
	}
	
	public Member3(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	//물리적 값
	@Override
	public int hashCode() {
		//memberName.hashCode() : String이므로 10진수
		//return super.hashCode(); //10진수의 메모리 주소
		//방법1
		//return memberName.hashCode() + memberId;
		//방법2
		return memberId;
	}
	
	//논리적인 값
	/*방법1
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member2 member = (Member2)obj;
			return member.memberName.equals(memberName) && member.memberId == memberId;
		}else {
			return false;
		}
	}
	*/
	//방법2
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member3) {
			Member3 member = (Member3)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return memberName + " 회원님의 아이디는 " + memberId+ "입니다.";
	}
	/*//comparable 활용시 따라오는 overriding method
	@Override
	public int compareTo(Member3 member) {
		return (this.memberId - member.memberId)*-1; //treeset 활용 시 MemberTreeSet 클래스의 showall 메서드를 사용하기위해서는 comparator의 오버라이드 반드시 필요함
	}												 // 기본 정렬 : 오름차순 | 내림차순 설정 : return (리턴값) *-1;
	 */
	
	//Comparator 활용시 따라오는 overriding method
	@Override
	public int compare(Member3 member1, Member3 member2) {
		
		return (member1.memberId -member2.memberId)*-1;
	}
	
	
}
