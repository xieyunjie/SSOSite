package casSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jasig.cas.authentication.principal.Credentials;
import org.jasig.cas.authentication.principal.CredentialsToPrincipalResolver;
import org.jasig.cas.authentication.principal.Principal;
import org.jasig.cas.authentication.principal.SimplePrincipal;
import org.jasig.cas.authentication.principal.UsernamePasswordCredentials;

public class WebUsernamePasswordCredentialsToPrincipalResolver implements CredentialsToPrincipalResolver
{

	@Override
	public Principal resolvePrincipal(Credentials credentials)
	{
		UsernamePasswordCredentials usernamePasswordCredentials = (UsernamePasswordCredentials) credentials;

//		final Map<String, Object> attr = new HashMap<String, Object>();
//
//		attr.put("tel", "13560348601");
//		attr.put("address", "aaabbbb");
//		attr.put("qqtype", "ext");
		
		final Map<String, Object> attrs = new HashMap<String, Object>();
		
		List<String> list = new  ArrayList<String>();
		list.add("13560348601");
		list.add("98765432");
		list.add("alex xie");
		list.add("xieeeeeee");
		
		attrs.put("resource", list); 

		Principal principal = new SimplePrincipal(usernamePasswordCredentials.getUsername(), attrs);

		return principal;
	}

	@Override
	public boolean supports(Credentials credentials)
	{

		return credentials != null && UsernamePasswordCredentials.class.isAssignableFrom(credentials.getClass());

	}

}
