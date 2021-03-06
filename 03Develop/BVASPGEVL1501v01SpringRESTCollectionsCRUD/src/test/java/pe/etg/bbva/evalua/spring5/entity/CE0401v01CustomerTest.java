package pe.etg.bbva.evalua.spring5.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(Parameterized.class)
public class CE0401v01CustomerTest {
	
	public static final Logger MOLOG = LoggerFactory.getLogger(CE0401v01CustomerTest.class);
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private Date dateOfBirth;
	
	private CE0401v01Customer moStudent;
	private CE0401v01Customer moRptaStudent;
	
	public CE0401v01CustomerTest(Long plId, String psFirstName, String psLastName, String psEmail, String psMobile) {
		this.id = plId;
		this.firstName = psFirstName;
		this.lastName = psLastName;
		this.email = psEmail;
		this.mobile = psMobile; 
		this.dateOfBirth = new Date();
	}
	
	@Before
	public void setUp() throws Exception {
		moStudent = new CE0401v01Customer();
		moRptaStudent = new CE0401v01Customer();
		
		MOLOG.info("[EVL] CECustomer : {}", moStudent);
		MOLOG.info("[EVL] CECustomer Rpta: {}", moStudent);
	}

	@Parameters
	public static Collection<Object[]> inputData() {
		return Arrays.asList(new Object[][] {
			{1L,"PC","PIC", "pic@gmail.com", "2010" },
			{2L,"GL","GLOMO PRIVADO", "gl@gmail.com", "2011" },
			{3L,"GM","GLOMO PÚBLICO", "gm@gmail.com", "2012" },
			{4L,"PH","FRONT APX", "ph@gmail.com", "2013"},
			{5L,"TM","ATM PÚBLICO", "tm@gmail.com", "2014"}
		});
	}	
	
	@Test
	public void testNotNullClass() {
	
		MOLOG.info("[EVL] Data [" + moStudent.toString());
		assertNotNull(moStudent);
	}
	
	@Test
	public void testObjectCustomerDiferent() {
		MOLOG.info("[EVL] Esperado [" + moRptaStudent.toString());
		MOLOG.info("[EVL] Data     [" + moStudent.toString());
		assertNotEquals(moRptaStudent, moStudent);
	}
	
	@Test
	public void testCustomerEqual() {
		moStudent = new CE0401v01Customer();
		moRptaStudent = new CE0401v01Customer();
		
		moStudent.setId(4L);
		moStudent.setFirstName("Illari");
		moStudent.setLastName("Laskhmi");
		moStudent.setEmail("PIC@gmail.com");
		moStudent.setMobile("2014");
		
		moRptaStudent.setId(4L);
		moRptaStudent.setFirstName("Illari");
		moRptaStudent.setLastName("Laskhmi");
		moRptaStudent.setEmail("PIC@gmail.com");
		moRptaStudent.setMobile("2014");
		
		MOLOG.info("[EVL] Esperado [" + moRptaStudent.toString());
		MOLOG.info("[EVL] Data     [" + moStudent.toString());
		assertEquals(moRptaStudent.getId(), moStudent.getId());
		assertEquals(moRptaStudent.getFirstName(), moStudent.getFirstName());
		assertEquals(moRptaStudent.getLastName(), moStudent.getLastName());
		assertEquals(moRptaStudent.getMobile(), moStudent.getMobile());
	}
	
	@Test
	public void testCECustomerToString() {
		String sExpectedResult;
		
		moRptaStudent.setId(this.id);
		moRptaStudent.setFirstName(this.firstName);
		moRptaStudent.setLastName(this.lastName);
		moRptaStudent.setEmail(this.email);
		moRptaStudent.setMobile(this.mobile);
		moRptaStudent.setDateOfBirth(this.dateOfBirth);
		
		MOLOG.info("[EVL] CECustomer Data : {}", moRptaStudent );

		sExpectedResult = new StringBuilder()
				.append("CE0101v01Customer [id=").append(moRptaStudent.getId())
				.append(", firstName=").append(moRptaStudent.getFirstName())
				.append(", lastName=").append(moRptaStudent.getLastName())
				.append(", email=").append(moRptaStudent.getEmail())
				.append(", mobile=").append(moRptaStudent.getMobile())
				.append(", dateOfBirth=").append(moRptaStudent.getDateOfBirth())
				.append("]").toString();
		MOLOG.info("[EVL] CECustomer Esperado : {}", sExpectedResult );		
		
		assertEquals(sExpectedResult, moRptaStudent.toString());
	}

}
