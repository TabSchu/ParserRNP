package ast;

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
	

	@Override
	public String evaluate() {
		return fLeft.evaluate() + fRight.evaluate() + " + ";
		// 5 + 3
		// 5 3 +
		
		// 5 + (1 + 2)
		// 5 + ( 1 2 +)
		// 5 1 2 + +
	}

}
