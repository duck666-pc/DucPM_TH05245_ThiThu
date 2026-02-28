<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 26/02/2026
  Time: 1:04 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>ID Loai giam</th>
            <th>Ma</th>
            <th>Ten</th>
            <th>So Luong</th>
            <th>Loai Giam</th>
            <th>Dieu kien toi thieu</th>
            <th>Gia tri toi da</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${phgr}" var="phgr">
            <tr>
                <td>${phgr.id}</td>
                <td>${phgr.loaiPhieuGiamGia}</td>
                <td>${phgr.ma}</td>
                <td>${phgr.ten}</td>
                <td>${phgr.soLuong}</td>
                <td>${phgr.loaiGiam}</td>
                <td>${phgr.dieuKienToiThieu}</td>
                <td>${phgr.giaTriToiDa}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
