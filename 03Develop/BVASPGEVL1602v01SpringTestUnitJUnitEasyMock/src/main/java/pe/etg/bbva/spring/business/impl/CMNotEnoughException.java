package pe.etg.bbva.spring.business.impl;

public class CMNotEnoughException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CMNotEnoughException(String text) {
        super(text);
    }
}
