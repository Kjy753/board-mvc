<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
<%@include file="../includes/header.jsp" %>

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Read</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Board Read
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            
                             
                             	<div class="form-group">
                                  <label>BNO</label>
                                  <input class="form-control" name="bno" value='<c:out value="${board.bno}"/>' readonly="readonly">
                              	</div>
                              	
                              	<div class="form-group">
                                  <label>Title</label>
                                  <input class="form-control" name="title" readonly="readonly" value='<c:out value="${board.title}"/>'>
                              	</div>
                              
                               	<div class="form-group">
                                  <label>Content</label>
                                  <textarea rows="5" cols="50" class="form-control"  name="content" readonly="readonly" style="resize: none"><c:out value="${board.content}"/></textarea>
                              	</div>
                              
                              	<div class="form-group">
                                  <label>Writer</label>
                                  <input class="form-control" name="writer" readonly="readonly" value='<c:out value="${board.writer}"/>'>
                              	</div>
                              	
                              	<button data-oper='modify' class="btn btn-default">Modify</button>
                              	<button data-oper='list' class="btn btn-info">List</button>
                       			<form id ='operForm'  >
                       			<input type='hidden' id='bno' name='bno' value='<c:out value="${board.bno}"/>'>
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
	
	var operForm = $("#operForm");
	
	$("button[data-oper='modify'] ").on("click", function(e){
		operForm.attr("action", "/board/modify").attr("method","get").submit();
	});
	
	$("button[data-oper='list'] ").on("click", function(e){
		operForm.find("#bno").remove();
		operForm.attr("action","/board/list")
		operForm.attr("method","get")
		operForm.submit();
		//operForm.submit();
		
	});
	
});
</script>           
            
            
        
<%@include file="../includes/footer.jsp" %>