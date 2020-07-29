package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CV0101v01RevisarContextDB {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01RevisarContextDB.class);
	private static ApplicationContext moContext;
	private static String[] configJob = {
			"classpath:/batch/config/job01-database.xml"
    };

	public static void main(String[] psaLista) {
		MOLOG.info("[EVL] =====[ Start main ]=====");
		
		MOLOG.info("[EVL] psaLista : {}", psaLista.length);
		
		moContext = new ClassPathXmlApplicationContext(configJob);
		MOLOG.info("[EVL] moContext : {}", moContext);
		
		DriverManagerDataSource oCxn = (DriverManagerDataSource) moContext.getBean("dataSource");
		MOLOG.info("[EVL] Instance DriverManagerDataSource : {}", oCxn.getUrl());
/*		
		DataSourceTransactionManager oTrn = (DataSourceTransactionManager) moContext.getBean("transactionManager");
		MOLOG.info("[EVL] Instance DataSourceTransactionManager : {}", oTrn.getDataSource());
*/
        ((ConfigurableApplicationContext) moContext).close();
	}
}
