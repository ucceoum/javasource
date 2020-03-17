package user.mvc.action;

import java.util.Scanner;

import user.mvc.domain.UserVO;
import user.mvc.service.UserAddService;
import user.mvc.util.UserConsolUtil;

public class UserInsertAction implements Action {
	
	UserConsolUtil util = new UserConsolUtil();
	
	
	@Override
	public void execute(Scanner sc) throws Exception {
		//새로운 user를 입력할 수 있는 화면 제시 후 
		//사용자가 입력한 값들을 UserVO에 담아서 리턴받기
		UserVO newUser = util.user_insert(sc);
		//db와 관련된 작업은 Service 클래스에게 맡김
		UserAddService service = new UserAddService();
		boolean addSuccess = service.addUser(newUser);
		if(addSuccess) {
			util.insertSuccessMessage();
		}else {
			util.insertFailMessage();
		}
	}

}
