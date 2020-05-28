package spring;
//회원 가입 처리 관련 클래스 
//동일한 이메일을 갖고 있는 회원이 이미 존재할 경우 
public class DuplicateMemberException extends RuntimeException {
	public DuplicateMemberException(String message) {
		super(message);
	}
}
