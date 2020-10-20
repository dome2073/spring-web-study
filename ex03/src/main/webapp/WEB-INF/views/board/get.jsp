<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<%@ include file="../includes/header.jsp" %>
	
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Board Read</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           Board Read Page
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                           
                           		<div class="form-group">
                           			<lable>Bno</lable> <input class="form-control" name='bno' value='<c:out value="${board.bno}"/>' readonly ="readonly">
                           		</div>
                           		
                           		<div class="form-group">
                           			<label>Title</label>
                           			<input class="form-control" name='title' value='<c:out value="${board.title}"/>' readonly ="readonly">
                           		</div>
                           		
                           		<div class="form-group">
                           			<label>Text area</label>
                           			<textarea class="form-control" name='content' readonly ="readonly" rows="3" cols=""><c:out value="${board.content}"/></textarea>
                           		</div>
                           		
                           		<div class="form-group">
                           			<label>Writer</label>
                           			<input class="form-control" name='writer' value='<c:out value="${board.writer}"/>' readonly ="readonly">
                           		</div>
                           		
                           		 <!-- 직접 링크에서 변경함 , 변경에 유리하도록 -->
                           		<button data-oper='modify' class="btn btn-default">Modify</button>
                           		<button data-oper='list' class="btn btn-default">List</button>
                           		
                           		<form id='operForm' action="/board/modify" method="get">
                           			<input type='hidden' id='bno' name ='bno' value='<c:out value="${board.bno }"/>'>
                           			<input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum}"/>'>
                           			<input type='hidden' name='amount' value='<c:out value="${cri.amount}"/>'>
                           			<input type='hidden' name='keyword' value='<c:out value="${cri.keyword}"/>'>
                           			<input type='hidden' name='type' value='<c:out value="${cri.type}"/>'>
                           		</form>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            
            <script type="text/javascript" src="/resources/js/reply.js"></script>
            
            <script type="text/javascript">
            	$(document).ready(function(){
            		console.log(replyService);
            	
            	});
            
            </script>
            
            <script type="text/javascript">
				$(document).ready(function(){
					var operForm = $("#operForm");
					
					$("button[data-oper='modify']").on("click", function(e){
						alert("클릭");
						operForm.attr("action", "/board/modify").submit();
					});
					
					$("button[data-oper='list']").on("click", function(e){
						alert("클릭");
						operForm.find("#bno").remove();
						operForm.attr("action","/board/list");
						operForm.submit();
					});
				});
			</script>
            <%@include file="../includes/footer.jsp" %>
        