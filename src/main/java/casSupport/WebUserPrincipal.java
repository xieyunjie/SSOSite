package casSupport;

import java.util.List;
import java.util.Map;

import org.jasig.services.persondir.support.BasePersonImpl;

public class WebUserPrincipal extends BasePersonImpl
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String principalName = null;

	public WebUserPrincipal(Map<String, List<Object>> attributes)
	{
		super(attributes);
		// TODO Auto-generated constructor stub
	}

	public WebUserPrincipal(String principalName, Map<String, List<Object>> attributes)
	{
		super(attributes);
		this.principalName = principalName;
	}

	@Override
	// Principal Name 有什么作用？？？用于比较对比？
	public String getName()
	{

		return this.principalName;
	}

}
