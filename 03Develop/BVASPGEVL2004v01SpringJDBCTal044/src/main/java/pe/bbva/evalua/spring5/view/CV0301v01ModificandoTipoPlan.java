package pe.bbva.evalua.spring5.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE01TipoPlan;
import pe.bbva.evalua.spring5.model.impl.CD01TipoPlan;

public class CV0301v01ModificandoTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0301v01ModificandoTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	private static SimpleDateFormat oSDF = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml",
			"classpath:/pe/bbva/evalua/spring5/entity/spring-bean-tipo-plan.xml"
	};
	
	public static void main(String[] args) throws ParseException {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Iniciando contexto     : {}", moCntx);
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idCDTipoPlan");
		MOLOG.info("[EVL] Controladora Tipo Plan : {}", oCDTipoPlan);
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		MOLOG.info("[EVL] Entidad Tipo Plan      : {}", oCETipoPlan);
		
		oCETipoPlan.setCodigoTipoPlan("S");
		oCETipoPlan.setCodigoEmpresa("50");
		oCETipoPlan.setCodigoIdioma("EN");
		oCETipoPlan.setAbreviatura("PCSBSX");
		oCETipoPlan.setDescripcion("XXX PLAN CONTABLE SBS XXX");
		oCETipoPlan.setSiNoVisualizar(false);
		oCETipoPlan.setSiNoEditar(false);
		oCETipoPlan.setSiNoAnula(false);
		oCETipoPlan.setSiNoElimina(false);
		oCETipoPlan.setSiNoDefault(false);
		oCETipoPlan.setSiNoActivo(false);			
		oCETipoPlan.setUsuarioNuevo("EDIAZ");
		oCETipoPlan.setFechaAlta(oSDF.parse("05/01/2002 00:00:00"));
		oCETipoPlan.setUsuarioUltimaModificacion("IADIAZ");
		oCETipoPlan.setFechaUltimaModificacion(oSDF.parse("22/08/2014 15:51:35"));
		
		MOLOG.info("[EVL] Instance CETipoPlan  : {} ", oCETipoPlan);
		oCDTipoPlan.actualizarTipoPlan(oCETipoPlan);
		MOLOG.info("[EVL] Instance oCDTipoPlan : {} ", oCDTipoPlan);
		((ConfigurableApplicationContext) moCntx).close();	
	}
}
