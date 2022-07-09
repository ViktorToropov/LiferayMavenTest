<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="getdbweb.caption"/></b>
</p>

<portlet:renderURL var="createEditRender">
	<portlet:param name="mvcRenderCommandName" value="/create/edit"/>
</portlet:renderURL>

<a href="${createEditRender}">Create Employee</a>