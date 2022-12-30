<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
<%@include file="../includes/header.jsp" %>

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Modify/Delete</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Board Modify/Delete
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <form role="form" >
                             
                             	<div class="form-group">
                                  <label>BNO</label>
                                  <input class="form-control" name="bno" value='<c:out value="${board.bno}"/>' readonly="readonly">
                              	</div>
                              	
                              	<div class="form-group">
                                  <label>Title</label>
                                  <input class="form-control" name="title"  value='<c:out value="${board.title}"/>'>
                              	</div>
                              
                               	<div class="form-group">
                                  <label>Content</label>
                                  <textarea rows="5" cols="50" class="form-control"  name="content" style="resize: none"><c:out value="${board.content}"/></textarea>
                              	</div>
                              
                              	<div class="form-group">
                                  <label>Writer</label>
                                  <input class="form-control" name="writer" readonly="readonly" value='<c:out value="${board.writer}"/>'>
                              	</div>
                              	<button class="btn btn-default" data-oper='modify'>Modify</button>
                              	<button class="btn btn-danger" data-oper='remove'>Remove</button>
                              	<button class="btn btn-info" data-oper='list'>List</button>
                              	
                              	<input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum }"/>'>
                       			<input type='hidden' name='amount' value='<c:out value="${cri.amount }"/>'>
                       		</form>
                          
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
<script>

$(document).ready(function(){
	
	var formObj = $("form");
	
	
	$('button').click(function(e){
		e.preventDefault();
		
		var operation = $(this).data("oper");
		
		console.log(operation);
		
		if(operation === 'list'){
			formObj.attr("action" ,"/board/list").attr("method","get");
			var pageNumTag = $("input[name='pageNum']").clone();
			var amountTag = $("input[name='amount']").clone();
			//list 버튼 클릭시 form 태그 내 필요 부분만 잠시 복사
			formObj.empty();
			//태그 내에 내용 삭제
			formObj.append(pageNumTag);
			formObj.append(amountTag);
			// 다시 추가 
		}else if(operation === 'remove'){
			formObj.attr("action" ,"/board/remove").attr("method","post");
		}else if(operation === 'modify'){
			formObj.attr("action" ,"/board/modify").attr("method","post");
		}
		formObj.submit();
	});
	
});
</script>          
            
            
        
<%@include file="../includes/footer.jsp" %>