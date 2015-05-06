package week3

object rationals {
  val x = new Rational(1,3)                       //> x  : week3.Rational = 1/3
	val y = new Rational(5,7)                 //> y  : week3.Rational = 5/7
	val z = new Rational(3,2)                 //> z  : week3.Rational = 3/2
	x.sub(y).sub(z).toString                  //> res0: String = -79/42
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