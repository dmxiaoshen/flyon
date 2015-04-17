<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/jsp/common/base/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="decorator" content="default"/>
<%@ include file="/WEB-INF/jsp/common/base/html-jqGrid.jsp"%>
<title>主页</title>
<script type="text/javascript">
$(function(){
	$("#gridTable").jqGrid({
        url : ctx+"/user/list/query",
        datatype: "json",
        mtype : 'post',
        rowNum: 3,
        pager: '#paper',
        height : "auto",
        autowidth : true,
        altRows:true,//隔行变色
        altclass:'ui-widget-content-altclass',//隔行变色样式
        viewrecords : true,
        multiselect:false,
        multiboxonly:true,
        multiselectWidth:20,
        jsonReader : {
            root : "result",
            page : "page",
            total : "total",
            records : "record",
            repeatitems : false
        },
        postData : {},
        colNames : ["序号","姓名","密码","创建时间","修改时间"],
        colModel:[{name:'id'},
                  {name:'name'},
                  {name:'password'},
                  {name:'createTime'},
                  {name:'updateTime'}]
    });
});
</script>
</head>
<body>
<table id="gridTable"></table>
<div id="paper"></div>
</body>
</html>
