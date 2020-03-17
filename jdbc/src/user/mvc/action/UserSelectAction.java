package user.mvc.action;

import java.util.Scanner;

import user.mvc.domain.UserVO;
import user.mvc.service.UserSelectService;
import user.mvc.util.UserConsolUtil;

public class UserSelectAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//사용자로부터 no를 입력받고
		UserConsolUtil util = new UserConsolUtil();
		int no = util.user_select(sc);
		//해당 no를 service 클래스에게 넘겨서 
		UserSelectService service = new UserSelectService();
		//결과를 리턴받기
		UserVO vo = service.selectOne(no);
		util.user_info(vo);
	}

}
