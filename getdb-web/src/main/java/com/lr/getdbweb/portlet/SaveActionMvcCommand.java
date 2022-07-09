package com.lr.getdbweb.portlet;


import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.getdb.service.GetDbService;
import com.lr.getdbweb.constants.GetDbWebPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + GetDbWebPortletKeys.GETDBWEB,
                "mvc.command.name=saveEmployee"
        },
        service= MVCActionCommand.class)
public class SaveActionMvcCommand extends BaseMVCActionCommand {

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        // TODO Auto-generated method stub
        String name = ParamUtil.get(actionRequest,"name","");


        System.out.println(name);

        _employeeService.addEmployee(name);
        System.out.println("SAVE");
    }

    private GetDbService _employeeService;

    @Reference(unbind = "-")
    protected void setEmpoyeeService(GetDbService employeeService) {
        _employeeService = employeeService;
    }

}
