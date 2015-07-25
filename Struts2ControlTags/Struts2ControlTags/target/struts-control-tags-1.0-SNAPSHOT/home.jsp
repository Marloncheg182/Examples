<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html">
    <title>Home Page</title>
</head>
<body>
<h4>Struts 2 Control Tags</h4>
<s:if test="employee.id <100">
    <strong>User id is under 100.</strong>
</s:if>
<s:elseif test="employee.role== 'Java Developer'">
    <strong>User is Java Developer</strong>
</s:elseif>
<s:else>
    <strong>User is not Java Developer</strong>
</s:else>
<br><br>
Cities are:<br>
<s:iterator value="employee.citiesList" begin="0" step="1"
            var="citiesIterator" status="iteratorStatus">
    <s:if test="#iteratorStatus.first">First City = <s:property/><br></s:if>
    <s:elseif test="#iteratorStatus.last">Last City = <s:property/></s:elseif>
    <s:else>City <s:property value="#iteratorStatus.count"/> =<s:property/><br></s:else>
</s:iterator>
<br><br>
Properties Map table is:
<table border="1" cellspacing="0" cellpadding="1">
    <tr>
        <th>Name</th>
        <th>Value</th>
    </tr>
    <s:iterator value="employee.propertiesMap" status="maprowStatus">
        <tr>
            <s:if test="#maprowStatus.odd == true">
                <td style="background: darkseagreen"><s:property value="key"/></td>
                <td style="background: darkseagreen"><s:property value="value"/></td>
            </s:if>
            <s:else>
                <td><s:property value="key"/></td>
                <td><s:property value="value"/></td>
            </s:else>
        </tr>
    </s:iterator>
</table>
<br><br>

Appending Cities and Countries List:<br>
<s:append var="appendedList">
    <s:param value="employee.citiesList"></s:param>
    <s:param value="employee.countryList"></s:param>
</s:append>
<s:iterator value="#appendedList" status="myListStatus">
    <s:property value="#myListStatus.count"/>. <s:property/><br>
</s:iterator>
<br><br>

Merging Cities and Countries List:<br>
<s:merge var="mergedList">
<s:param value="employee.citiesList"></s:param>
<s:param value="employee.countryList"></s:param>
</s:merge>
<s:iterator value="#mergedList" status="myList">
    <s:property value="#myListStatus.count"/>. <s:property/><br>
</s:iterator>
<br><br>

Sorting Cities List:<br>
<s:bean name="util.StringComparator" var="myComparator"></s:bean>
<s:sort comparator="#myComparator" source="employee.citiesList">
    <s:iterator status="myListStatus">
        <s:property value="#myListStatus.count"/>. <s:property/><br>
    </s:iterator>
</s:sort>
<br><br>

Excluding Ukraine from the countries list:<br>
<s:subset source="employee.countryList" decider="countryDecider">
    <s:iterator>
        <s:property/><br>
    </s:iterator>
</s:subset>
<br><br>

Generate iterator example:<br>
<s:generator separator="|"  val="%{'apple|banana|orange'}" var="fruitsIterator"/>
<s:iterator value="#fruitsIterator">
    <s:property /><br/>
</s:iterator>
</body>
</html>
