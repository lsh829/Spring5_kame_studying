package spring;

import java.time.LocalDateTime;

public class Member {
	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;
	
	public Member(String email, String password, String name, LocalDateTime regDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = regDateTime;
	}
	
	void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public String getName() {
		return name;
	}


	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}
	
	//changePassword() 메소드 : 암호 변경 기능 
	public void changePassword(String oldPassword, String newPassword) { // oldPassword와 newPassword 의 두 파라미터 값을 전달받음. 
		// oldPassword가 현재 암호인 password 필드와 값이 다르면 WrongIdPasswordException 예외를 발생시킨다.
		if(!password.equals(oldPassword)) {
			throw new WrongIdPasswordException();
		}
		// 값이 같으면 password 필드를 newPassword로 변경한다. 
		this.password = newPassword;
	}


	
	
}
