package casSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.jasig.services.persondir.IPersonAttributes;
import org.jasig.services.persondir.support.AbstractFlatteningPersonAttributeDao;

public class WebPersonAttributeDao extends AbstractFlatteningPersonAttributeDao
{
	private IPersonAttributes personAttributes = null;

	@Override
	public IPersonAttributes getPerson(String uid)
	{
		if (uid == null)
		{
			return null;
		}
		
		Map<String, List<Object>> attributes = new HashMap<String, List<Object>>(2);
		
		this.personAttributes = new WebUserPrincipal(UUID.randomUUID().toString(), attributes);
		
		return this.personAttributes;
	}

	@Override
	public Set<IPersonAttributes> getPeopleWithMultivaluedAttributes(Map<String, List<Object>> query)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getPossibleUserAttributeNames()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getAvailableQueryAttributes()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
