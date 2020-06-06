package ast;

import java.math.BigDecimal;

public class NumberExpression extends Expression {

	private String fValue;
	
	public NumberExpression( String aValue )
	 {
		fValue = aValue;
	 } 

	@Override
	public String evaluate() {
		
		return fValue+" ";
	}


}
