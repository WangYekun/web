<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>留言区</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="欢迎来到何明胜的个人网站.本站主要用于记录和分享本人的学习心得和编程经验,并分享常见可复用代码、推荐书籍以及软件等资源.本站源码已托管github,欢迎访问：https://github.com/HelloHusen/web" />
<meta name="keywords" content="何明胜,何明胜的个人网站,何明胜的博客,一格的程序人生" />
<meta name="author" content="何明胜,一格">

<%@include file="/plugins/plugins.jsp"%>

<!-- 网站图标 -->
<link rel="shortcut icon" href="/images/favicon.ico">

<!-- 留言区css -->
<link rel="stylesheet" href="/css/message/message.css">
<!-- 分页器 -->
<link rel="stylesheet" href="/css/message/pager.css" />

<!-- 留言区js -->
<script src="/js/message/message.js"></script>
<!-- 分页器 -->
<script src="/js/message/pager.js"></script>

</head>
<body>
	<%@include file="/module/common.jsp"%>
	<input id="menuBarNo" type="hidden" value="3" />
	
	<div id="fh5co-page">
		<!-- 左侧导航  -->
		<%@include file="/module/navigation/leftbar.jsp"%>
		<!-- 中间内容  -->
		<div id="fh5co-main">
			<div id="message_box"></div>
		</div>
		<div id="pager"></div>
		<!-- 右侧导航  -->
		<%@include file="/module/navigation/rightbar.jsp"%>
	</div>
</body>
</html>