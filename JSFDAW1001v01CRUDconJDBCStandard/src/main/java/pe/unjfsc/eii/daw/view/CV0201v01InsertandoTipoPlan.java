package pe.unjfsc.eii.daw.view;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pe.unjfsc.eii.daw.entity.CE01TipoPlan;
import pe.unjfsc.eii.daw.model.CD01TipoPlan;

public class CV0201v01InsertandoTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0201v01InsertandoTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	// Manejo de formato de fechas
	private static SimpleDateFormat oSDF = new SimpleDateFormat("dd/MM/yyyy");
	// 2. Definimos el contexto
	private static String[] configContexto = {
			"classpath:/spring/database/spring-postgres.xml",
			"classpath:/spring/entity/spring-bean-tipo-plan.xml"
    };
	
	public static void main(String[] args) throws SQLException, ParseException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("idDriverManagerDataSource");
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idTipoPlan");
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		
		MOLOG.info("=> [EVL] Iniciando contexto       : {} ", moCntx);
		MOLOG.info("=> [EVL] DriverManagerDataSource  : {}", oDataSource);
		MOLOG.info("=> [EVL] Capa modelo CD01TipoPlan : {} ", oCDTipoPlan);
	
		// 3. Sett data para el objeto tipo de plan
		oCETipoPlan.setCodigoTipoPlan("S");
		oCETipoPlan.setCodigoEmpresa("05");
		oCETipoPlan.setCodigoIdioma("ES");
		oCETipoPlan.setAbreviatura("PCSBS");
		oCETipoPlan.setDescripcion("PLAN CONTABLE SBS");
		oCETipoPlan.setSiNoVisualizar(true);
		oCETipoPlan.setSiNoEditar(false);
		oCETipoPlan.setSiNoAnula(true);
		oCETipoPlan.setSiNoElimina(false);
		oCETipoPlan.setSiNoDefault(true);
		oCETipoPlan.setSiNoActivo(true);			
		oCETipoPlan.setUsuarioNuevo("EDIAZ");
		oCETipoPlan.setFechaAlta(oSDF.parse("05/01/2002"));
		oCETipoPlan.setUsuarioUltimaModificacion(null);
		oCETipoPlan.setFechaUltimaModificacion(null);
		
		MOLOG.info("=> [EVL] objeto CETipoCuenta : {} ", oCETipoPlan);
		MOLOG.info("=> [EVL] Grabando con method agregarTipoCuenta ");
		// 4. Estamos accediendo a la capa modelo, luego debemos acceder a la capa controladora
		oCDTipoPlan.grabarTipoPlan(oCETipoPlan);
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();		
	}
}