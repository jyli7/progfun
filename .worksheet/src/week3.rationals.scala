package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(27); 
	val y = new Rational(5,7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(27); 
	val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(26); val res$0 = 
	x.sub(y).sub(z).toString;System.out.println("""res0: String = """ + $show(res$0))}
}

class Rational(x: Int, y: Int) {
	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	
	def neg: Rational = new Rational(-numer, denom)
	
	def sub(that: Rational) = add(that.neg)
	
	
	override def toString = numer + "/" + denom
}
