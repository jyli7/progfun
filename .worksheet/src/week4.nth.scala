package week4
import week4._
object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(134); 
  def nth[T](n: Int, xs: List[T]): T {
  	if (n == 0) xs.head
  	else nth(n -1, xs.tail)
  };System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""")}
}
