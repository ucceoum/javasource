/**
 * 
 */

$(function(){
	$("#modifyform").validate({
		rules:{
			new_password:{
				required:true,
				validPwd:true,
				validPwdletter:true
			},
			confirm_password:{
				required:true,
				validPwd:true,
				validPwdletter:true,
				equalTo:"#new_password"
			}
		},
		messages:{
			new_password:{
				required:"비밀번호를 입력해 주세요"
			},
			confirm_password:{
				required:"비밀번호를 입력해 주세요",
				equalTo:"이전 비밀번호와 다릅니다."
			}
		},
		errorPlacement:function(error,element){
			$(element).closest("form").find("small[id='"+element.attr('id')+"']").append(error);
		}
		
	})
	
})
$.validator.addMethod("validPwd",function(value){
	let regPwd=/(?=.*[A-z])(?=.*\d)(?=.*[!@#$])[A-z!@#$\d]{8,15}/;
	return regPwd.test(value);
},"비밀번호는 문자, 숫자, 특수문자(!@$_*&#)를 사용하여 8~15자리까지 사용가능합니다.");

$.validator.addMethod("validPwdletter",function(value){
	let regPwd2=/(\w)\1\1\1/;
	return !regPwd2.test(value);
},"동일한 숫자와 문자를 연속으로 사용할 수 없습니다.");
