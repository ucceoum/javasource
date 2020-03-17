<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp"></jsp:include>
<div class="content">
	<div class="container">
		<h3>USER 조회</h3>
		<form id="myform">
			<div class="form-group row">
				<label for="no" class="col-sm-2 col-form-label">No</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="no" name="no" readonly>
				</div>
			</div>
			<div class="form-group row">
				<label for="userName" class="col-sm-2 col-form-label">userName</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="userName" name="userName" readonly>
				</div>
			</div>
			<div class="form-group row">
				<label for="birthYear" class="col-sm-2 col-form-label">birthYear</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="birthYear" name="birthYear" readonly>
				</div>
			</div>
			<div class="form-group row">
				<label for="addr" class="col-sm-2 col-form-label">addr</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="addr" name="addr" readonly>
				</div>
			</div>
			<div class="form-group row">
				<label for="mobile" class="col-sm-2 col-form-label">mobile</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="mobile" name="mobile" readonly>
				</div>
			</div>
			<div class="form-group row">				
				<div class="col-sm-10">
					<button type="button" class="btn btn-primary">수정</button>
					<button type="button" class="btn btn-danger">탈퇴</button>
				</div>
			</div>
		</form>
	</div>
</div>
<jsp:include page="layout/footer.jsp"></jsp:include>
