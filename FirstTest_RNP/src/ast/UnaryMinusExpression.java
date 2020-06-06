package ast;

import java.math.BigDecimal;

public class UnaryMinusExpression extends Expression {

	private Expression fExpression;
	

	public Expression getLeft()
	 {
	 return fExpression;
	 }



	public UnaryMinusExpression( Expression aExpression )
	 {
	 fExpression = aExpression;
	
	 } 
	
	
	@Override
	public String evaluate() {
		// -5 --> value =5 --> "0 5 - "
		//value = fExpression.evaluate()
		 return " 0 "+ fExpression.evaluate() +" - ";
		// return " 0 "+" 5 "+" - "; //fExpression.evaluate().multiply( new BigDecimal("-1") ); 
	// does not work:	return fExpression.evaluate() * -1 ); 
		 // float/double would work
	}

}
