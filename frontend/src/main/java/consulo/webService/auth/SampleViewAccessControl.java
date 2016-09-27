package consulo.webService.auth;

import org.springframework.stereotype.Component;
import com.vaadin.spring.access.ViewAccessControl;
import com.vaadin.ui.UI;

/**
 * This demonstrates how you can control access to views.
 */
@Component
public class SampleViewAccessControl implements ViewAccessControl
{

	@Override
	public boolean isAccessGranted(UI ui, String beanName)
	{
		if(beanName.equals("adminView"))
		{
			return SecurityUtil.hasRole("ROLE_ADMIN");
		}
		else
		{
			return SecurityUtil.hasRole("ROLE_USER");
		}
	}
}