<%@ include file="/init.jsp" %>

<portlet:actionURL name="saveEmployee" var="saveEmployeeURL">
</portlet:actionURL>

<h1>Create/Edit Employee Details</h1>

<aui:form name="fm" action="${saveEmployeeURL}">

	<aui:input name="name"></aui:input>

	<aui:button-row>
		<aui:button cssClass="btn btn-primary" type="submit" />
	</aui:button-row>

</aui:form>