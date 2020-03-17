/**
 * joinForm.jsp의 유효성 검증
 * 
 * 
 */
$(function(){
	$("#joinform").validate({
		rules:{
			userid:{
				required:true,
				validId:true				
			},
			password:{
				required:true,
				validPwd:true,
				validPwdletter:true
			},
			confirm_password:{
				required:true,
				validPwd:true,
				validPwdletter:true,
				equalTo:"#password"
			},
			name:{
				required:true,
				minlength:2,
				maxlength:4
			},
			gender:{
				required:true
			},
			email:{
				required:true,
				email:true
			}
		},
		messages:{
			userid:{
				required:"아이디를 입력해주세요"
			},
			password:{
				required:"비밀번호를 입력해주세요"
			},
			confirm_password:{
				required:"비밀번호를 입력해주세요",
				equalTo:"이전 비밀번호와 다릅니다."
			},
			name:{
				required:"이름을 입력해주세요",
				minlength:" 2자리 이상",
				maxlength:" 4자리 이하"
			},
			gender:{
				required:"성별을 선택해 주세요"
			},
			email:{
				required:"이메일를 입력해주세요"
			}
		},
		errorPlacement:function(error,element){
			$(element).closest("form").find("small[id='"+element.attr('id')+"']").append(error);
		}
	});
	
	
})
$.validator.addMethod("validId",function(value){
	let regId=/^(?=.*[A-z])(?=.*\d)[A-z\d]{6,12}$/;
	return regId.test(value);
},"아이디는 문자, 숫자를 사용하여 6~12자리까지 사용가능합니다.");

$.validator.addMethod("validPwd",function(value){
	let regPwd=/^(?=.*[A-z])(?=.*\d)(?=.*[!@#$])[A-z!@#$\d]{8,15}$/;
	return regPwd.test(value);
},"비밀번호는 문자, 숫자, 특수문자(!@$_*&#)를 사용하여 8~15자리까지 사용가능합니다.");

$.validator.addMethod("validPwdletter",function(value){
	let regPwd2=/(\w)\1\1\1/;
	return !regPwd2.test(value);
},"동일한 숫자와 문자를 연속으로 사용할 수 없습니다.");

$.validator.addMethod("email",function(value){
	let regEmail=/^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
	return regEmail.test(value);
},"이메일을 입력해 주세요.");



