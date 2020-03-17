package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data	//getter, setter, toString, 기본생성자
public class UserVO {
	
	//userTBL 컬럼 형태 맞추기
	private int no;
	private String userName;
	private int birthYear;
	private String addr;
	private String mobile;
	public UserVO(String username, int birthYear, String addr, String mobile) {
		super();
		this.userName = username;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}
	
	
	
}
