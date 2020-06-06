package ast;

import java.math.BigDecimal;

public class MulExpression extends Expression {

	private Expression fLeft;
	private Expression fRight;

	public Expression getLeft()
	 {
	 return fLeft;
	 }

	public Expression getRight()
	 {
	 return fRight;
	 } 
	

	public MulExpression( Expression aLeft, Expression aRight )
	 {
	 fLeft = aLeft;
	 fRight = aRight;
	 } 
	
	
	@Override
	public String evaluate() {
		return fLeft.evaluate()+fRight.evaluate()+" * "; // fLeft.evaluate().multiply( fRight.evaluate() ); 
	}

}
