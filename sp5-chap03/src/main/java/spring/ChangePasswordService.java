package spring;

//암호 변경 관련 클래스 
public class ChangePasswordService {
	private MemberDao memberDao;
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		// 암호 변경을 위해서 email을 사용한다. 
		Member member = memberDao.selectByEmail(email);
		
		if(member == null) {
			throw new MemberNotFoundException();
		}
		
		member.changePassword(oldPwd, newPwd);
		memberDao.update(member);
	}
	
	// 의존 객체(MemberDao)를 주입받는다. 
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

}
