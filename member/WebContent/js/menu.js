/**
 * 로그인 후 세션에 담긴 값을 이용해서
 * 메뉴버튼 보여주기
 */
$(function(){
	//register 메뉴 없애기
	$("#2").detach();
	//login 메뉴 없애기
	$("#3").detach();
	
	
	//~님 반갑습니다와 버튼 추가
	let tag = "<span class='navbar-text'>"+name+" 님 반갑습니다.</span>&nbsp;&nbsp;"
	tag+="<button type='button' id='modify' class='btn btn-success'>비밀번호 수정</button>&nbsp;&nbsp;";
	tag+="<button type='button' id='logout' class='btn btn-primary'>로그아웃</button>&nbsp;&nbsp;";
	tag+="<button type='button' id='leave' class='btn btn-danger'>회원탈퇴</button>";
	$("#navbarCollapse").append(tag);
	
	
	//
	
	
	
	
})

