package xmlpackage;

import org.apache.xml.security.utils.XMLUtils;
import org.jasig.cas.client.util.XmlUtils;
import org.junit.Test;

public class XmlTest
{
	@Test
	public void testRep()
	{
		String strXML = "<cas:serviceResponse xmlns:cas='http://www.yale.edu/tp/cas'>\n" +
				"	<cas:authenticationSuccess>\n" +
				"		<cas:user>a</cas:user>\n" +
				"		\n" +
				"		 \n" +
				" 		\n" +
				"			<cas:attributes>\n" +
				"				\n" +
				"					\n" +
				"						\n" +
				"							\n" +
				"								<cas: resource>13560348601</cas:resource>\n" +
				"							\n" +
				"								<cas: resource>98765432</cas:resource>\n" +
				"							\n" +
				"								<cas: resource>alex xie</cas:resource>\n" +
				"							\n" +
				"								<cas: resource>xieeeeeee</cas:resource>\n" +
				"							\n" +
				"						\n" +
				"						\n" +
				"					\n" +
				"				\n" +
				"			</cas:attributes>\n" +
				"		 \n" +
				"	</cas:authenticationSuccess>\n" +
				"</cas:serviceResponse>";
		
		String strXML2 = "<cas:serviceResponse xmlns:cas='http://www.yale.edu/tp/cas'>\n" +
				"	<cas:authenticationSuccess>\n" +
				"		<cas:user>a</cas:user>\n" +
				"		\n" +
				"		 \n" +
				" 		\n" +
				"			<cas:attributes>\n" +
				"				\n" +
				"					\n" +
				"						\n" +
				"							\n" +
				"								<cas:resource>13560348601</cas:resource> \n" +
				"							\n" +
				"						\n" +
				"						\n" +
				"					\n" +
				"				\n" +
				"			</cas:attributes>\n" +
				"		 \n" +
				"	</cas:authenticationSuccess>\n" +
				"</cas:serviceResponse>";
		String user = "user";
		
		String str =  XmlUtils.getTextForElement(strXML2, user);
		
		System.out.println(str);
		

	}
}
