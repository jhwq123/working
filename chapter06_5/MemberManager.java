package chapter06_5;

public class MemberManager {
	
	Member[] mList;
	private int index = 0;
	
	public MemberManager(int length) {
		Member[] memberList = new Member[length];
		this.mList = memberList;
	}
	
	int getIndex() {
		return index;
	}
	
	void resistMember(Member member) {
		if (index < mList.length && index >= 0) {
			mList[index] = member;
		} else {
			; // 나중에 생각하자
			Member[] tempList = new Member[index+1];
			for (int i = 0; i < index; i++) {
				tempList[i] = mList[i];				
			}
			mList = tempList;
			mList[index] = member;
		}
		index++;
	}
	
	Member selectOne(int mno) {
		for (int i = 0; i < mList.length; i++) {
			if (mno == mList[i].getMno()) {
				return mList[i];
			}
		}
		return null;
	}
	
	Member[] selectAll() {
		return mList;
	}
	
	void updateMember(int num, Member m) {
		mList[num] = m;
		
		//내용 출력
		//한번에 다 수정할지, 하나만 수정할지 확인
	}
	
	
}
