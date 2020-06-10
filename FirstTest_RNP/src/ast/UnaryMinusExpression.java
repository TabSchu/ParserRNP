package ast;

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
		 return " 0 "+ fExpression.evaluate() +" - ";
	}
	// - 3 
	// 0 - 3
	// 0 3 -
	
	// - (1 + 2)
	// - (1 2 +)
	// 0 - (1 2 +)
	// 0 (1 2 +) -
	// 0 1 2 + -
}
