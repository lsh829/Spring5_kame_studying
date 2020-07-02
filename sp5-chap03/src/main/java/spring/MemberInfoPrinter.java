package spring;
// 지정한 이메일을 갖는 Member을 찾아서 정보를 출력 
public class MemberInfoPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;

	public void printMemberInfo (String email){
		Member member = memDao.selectByEmail(email);
		if(member==null) {
			System.out.println("데이터없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

	// 세터 메소드 1.. MemberDao 타입의 객체 의존 주입
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	// 세터 메소드 2.. MemberPrinter 타입의 객체 의존 주입
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}
