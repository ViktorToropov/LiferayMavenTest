package com.lr.getdbweb.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.lr.getdbweb.constants.GetDbWebPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + GetDbWebPortletKeys.GETDBWEB,
                "mvc.command.name=/create/edit"
        }
)

public class CreateEditRenderMvcCommand implements MVCRenderCommand {

    @Override
    public String render(RenderRequest RenderRequest, RenderResponse RenderResponse) throws PortletException {
        // TODO Auto-generated method stub
        return "/edit.jsp";
    }

}
