package pe.bbva.evalua.spring5.model.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

import pe.bbva.evalua.spring5.model.CIRetiroAFP25LinkedHashSet;

public class CDRetiroAFP25LinkedHashSet implements CIRetiroAFP25LinkedHashSet {
	private static final Logger LOG = LoggerFactory.getLogger("CDRetiroAFP25LinkedHashSet");
	
	private LinkedHashSet<CESaldoAfiliadoCustom> moListAfiliado;
	private CESaldoAfiliadoCustom moCESaldoAfilidado;
	
	public CDRetiroAFP25LinkedHashSet() {
		 moListAfiliado = new LinkedHashSet<CESaldoAfiliadoCustom>();
		
		moListAfiliado.add(new CESaldoAfiliadoCustom(1, "2000", 2500.05));
		moListAfiliado.add(new CESaldoAfiliadoCustom(2, "2001", 3500.10));
		moListAfiliado.add(new CESaldoAfiliadoCustom(3, "2002", 4500.15));
		moListAfiliado.add(new CESaldoAfiliadoCustom(4, "2003", 5500.20));
		moListAfiliado.add(new CESaldoAfiliadoCustom(5, "2004", 6000.25));
		moListAfiliado.add(new CESaldoAfiliadoCustom(6, "2005", 6500.30));
		moListAfiliado.add(new CESaldoAfiliadoCustom(7, "2006", 7000.35));
		moListAfiliado.add(new CESaldoAfiliadoCustom(8, "2007", 7500.40));
		moListAfiliado.add(new CESaldoAfiliadoCustom(9, "2008", 8000.45));
		moListAfiliado.add(new CESaldoAfiliadoCustom(10, "2009", 8500.50));
		moListAfiliado.add(new CESaldoAfiliadoCustom(11, "2010", 9000.55));
		moListAfiliado.add(new CESaldoAfiliadoCustom(12, "2011", 9500.60));
		moListAfiliado.add(new CESaldoAfiliadoCustom(13, "2012", 10500.70));
		moListAfiliado.add(new CESaldoAfiliadoCustom(14, "2013", 11500.80));
		moListAfiliado.add(new CESaldoAfiliadoCustom(15, "2014", 12500.90));
		moListAfiliado.add(new CESaldoAfiliadoCustom(16, "2015", 13500.99));
		moListAfiliado.add(new CESaldoAfiliadoCustom(17, "2016", 14500.98));
		moListAfiliado.add(new CESaldoAfiliadoCustom(18, "2017", 15500.97));
		moListAfiliado.add(new CESaldoAfiliadoCustom(19, "2018", 16500.96));
		moListAfiliado.add(new CESaldoAfiliadoCustom(20, "2019", 17500.95));
		moListAfiliado.add(new CESaldoAfiliadoCustom(21, "2020", 18500.94));
	}

	public void saveRetiroLinkedHashSet(CESaldoAfiliadoCustom poCESaldoAfiliado) {
		moListAfiliado.add(new CESaldoAfiliadoCustom(poCESaldoAfiliado.getId(), poCESaldoAfiliado.getCodigoAfiliado(), poCESaldoAfiliado.getSaldoCIC()));
		
	}

	public void updateRetiroLinkedHashSet(CESaldoAfiliadoCustom poCESaldoAfiliado) {
		Iterator<CESaldoAfiliadoCustom> it = moListAfiliado.iterator();
		while(it.hasNext()) {
			moCESaldoAfilidado = new CESaldoAfiliadoCustom();
			moCESaldoAfilidado = it.next();
			if (moCESaldoAfilidado.getId()==poCESaldoAfiliado.getId()) {
				moCESaldoAfilidado.setCodigoAfiliado(poCESaldoAfiliado.getCodigoAfiliado());
				moCESaldoAfilidado.setSaldoCIC(poCESaldoAfiliado.getSaldoCIC());
				break;
			}
		}
	}

	public void deleteRetiroLinkedHashSet(int pId) {
		Iterator<CESaldoAfiliadoCustom> it = moListAfiliado.iterator();
		while(it.hasNext()) {
			moCESaldoAfilidado = new CESaldoAfiliadoCustom();
			moCESaldoAfilidado = it.next();
			if (moCESaldoAfilidado.getId()==pId) {
				moListAfiliado.remove(moCESaldoAfilidado);
				break;
			}
		}
	}

	public LinkedHashSet<CESaldoAfiliadoCustom> consultaAllRetiroLinkedHashSe() {
		LOG.info("[EVL LinkedHashSet {}", moListAfiliado);
		return moListAfiliado;
	}

	public CESaldoAfiliadoCustom consultaByIdRetiroLinkedHashSe(int pId) {
		CESaldoAfiliadoCustom oCESaldoAfilidado = null;
		CESaldoAfiliadoCustom oCESaldoResult = null;
		
		Iterator<CESaldoAfiliadoCustom> it = moListAfiliado.iterator();
		while(it.hasNext()) {
			oCESaldoAfilidado = new CESaldoAfiliadoCustom();
			oCESaldoAfilidado = it.next();
			if (oCESaldoAfilidado.getId()==pId) {
				oCESaldoResult = new CESaldoAfiliadoCustom();
				oCESaldoResult = oCESaldoAfilidado;
				break;
			}
		}
		return oCESaldoResult;
	}

	public void setMoCESaldoAfilidado(CESaldoAfiliadoCustom moCESaldoAfilidado) {
		this.moCESaldoAfilidado = moCESaldoAfilidado;
	}
}
