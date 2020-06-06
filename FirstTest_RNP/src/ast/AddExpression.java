package ast;

import java.math.BigDecimal;

public class AddExpression extends Expression {

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
	
	public AddExpression( Expression aLeft, Expression aRight )
	 {
	 fLeft = aLeft;
	 fRight = aRight;
	 } 
	
	
	//public String toString() {
//		return fLeft.toString() + fRight.toString() + "+";
//	}

	@Override
	public String evaluate() {
		return fLeft.evaluate() + fRight.evaluate() + " + ";
	}

}
