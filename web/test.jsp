<%--
  Created by IntelliJ IDEA.
  User: zhangqianlong
  Date: 2020/9/2
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
    <script type="text/javascript" src="lib/jQuery.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#putbtn").click(function () {
                $.ajax({
                    url:"myServlet",//后台访问servlet地址
                    //date:{},//为后台传输的参数
                    type:"get",//请求方式
                    dataType:"text",//从后台接受数据的格式
                    async:true,//执行ajax异步请求
                    success:function (data) {//回调函数(该函数的执行时机是后台执行完毕,函数才会执行)
                        //后台响应回来的数据
                        $("#msg").html(123);
                    }
                })
            })
        })

    </script>
</head>
<body>
    <div id="msg">111</div>
    <input type="button" id="putbtn" value="新增"/>
<a href="myServlet/delete">delete</a>
<a href="myServlet/change">change</a>
<a href="myServlet/save">save</a>
<a href="myServlet/select">select</a>

</body>
</html>
