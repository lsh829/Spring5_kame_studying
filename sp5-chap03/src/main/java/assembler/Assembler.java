package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler() {
		memberDao = new MemberDao();
		// 의존 객체를 변경하려면 조립기의 코드만 수정하면 된다..
		
		// 만약에 MemberDao클래스가 아니라 
		// MemberDao 클래스를 상속받은 CachedMemberDao클래스를 사용해야 한다면
		// memberDao = new CachedMemberDao(); 
		// 로 "한 번만" 수정하면 된다. 
		
		regSvc = new MemberRegisterService(memberDao); //생성자를 통한 MemberDao 객체  의존 주입
		pwdSvc = new ChangePasswordService(); //setter를 통한 MemberDao 객체 의존 주입
		pwdSvc.setMemberDao(memberDao);
	}
	
	public MemberDao getMemberDao() {
		return memberDao;
	}
	
	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}
	
	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}
}


