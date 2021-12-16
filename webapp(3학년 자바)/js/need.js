function dup_check(id){
	$.ajax({
		type: 'post',
		url: 'dup_check.jsp',
		data: {"id" : id },
		dataType: 'text',
		success : function(data){
			if(!data.includes("성공")){
				alert('사용가능한 아이디입니다.');
				document.getElementById('checkid').value =1;
			}
			else
			{
				alert('중복된 아이디입니다.');
			}
				
		}
	})	
}
function check_id() { //set_user.php
	id = document.getElementById('id').value;

	var regid = /^[a-zA-Z0-9]{5,16}$/;
            
    if(!regid.test(id)){
        alert("아이디는 영문숫자를 포함하여 5~16자까지만 가능합니다.");
		return false;
    }
	else{
		dup_check(id);
	}
	
}
function set_false(){
	document.getElementById('checkid').value=0;
}
function check_process(){
	
	if(document.getElementById('checkid').value==0)
	{
		alert('아이디중복 확인해주세요.');
		return false;
	}
	else{
	document.signup.submit()
	}
}
