package casSupport;

import org.jasig.cas.authentication.handler.AuthenticationException;
import org.jasig.cas.authentication.handler.support.AbstractUsernamePasswordAuthenticationHandler;
import org.jasig.cas.authentication.principal.UsernamePasswordCredentials;

public final class WebAuthenticationHandler extends AbstractUsernamePasswordAuthenticationHandler
{
	public WebAuthenticationHandler()
	{
		log.warn(this.getClass().getName() + " is only to be used in a testing environment.  NEVER enable this in a production environment.");
	}

	@Override
	protected boolean authenticateUsernamePasswordInternal(UsernamePasswordCredentials credentials) throws AuthenticationException
	{

		String userName = credentials.getUsername();
		String password = credentials.getPassword();
		if (password.equals(userName + userName))
		{
			return true;
		}

		return false;
	}

}
