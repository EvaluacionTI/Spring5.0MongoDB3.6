package pe.etg.bbva.spring5.view.xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.oracle.CE01TipoPlan;
import pe.etg.bbva.spring5.model.impl.CD02TipoPlanJdbcTemplate;

public class CV0203v01ModificandoJdbcTemplateTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0203v01ModificandoJdbcTemplateTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	private static SimpleDateFormat oSDF = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private static String[] configContexto = {
			"classpath:/database/spring-oracle-jdbctemplate.xml"
    };
	
	public static void main(String[] args) throws ParseException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		CD02TipoPlanJdbcTemplate oCDTipoPlan = (CD02TipoPlanJdbcTemplate) moCntx.getBean("idTipoPlan");
		
		MOLOG.info("=> [EVL] Iniciando contexto           : {} ", moCntx);
		MOLOG.info("=> [EVL] Iniciando bean  CD01TipoPlan : {} ", oCDTipoPlan);
	
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		
		oCETipoPlan.setCodigoTipoPlan("S");
		oCETipoPlan.setCodigoEmpresa("50");
		oCETipoPlan.setCodigoIdioma("EN");
		oCETipoPlan.setAbreviatura("PCSBSX");
		oCETipoPlan.setDescripcion("XXX PLAN CONTABLE SBS XXX");
		oCETipoPlan.setSiNoVisualizar("0");
		oCETipoPlan.setSiNoEditar("0");
		oCETipoPlan.setSiNoAnula("0");
		oCETipoPlan.setSiNoElimina("0");
		oCETipoPlan.setSiNoDefault("0");
		oCETipoPlan.setSiNoActivo("0");			
		oCETipoPlan.setUsuarioNuevo("EDIAZ");
		oCETipoPlan.setFechaAlta(oSDF.parse("05/01/2002 00:00:00"));
		oCETipoPlan.setUsuarioUltimaModificacion("IADIAZ");
		oCETipoPlan.setFechaUltimaModificacion(oSDF.parse("22/08/2014 15:51:35"));
		
		MOLOG.info("=> [EVL] Objeto CETipoPlan  : {} ", oCETipoPlan);
		oCDTipoPlan.actualizarTipoPlan(oCETipoPlan);
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();
	}

}
