package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || (c == r))  1
    else pascal(c, r-1) + pascal(c-1, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def innerBal(open:Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty)
        open == 0
      else if (chars.head == '(')
        innerBal(open + 1, chars.tail)
      else if (chars.head == ')')
        open > 0 && innerBal(open - 1, chars.tail)
      else
        innerBal(open, chars.tail)
    }
    innerBal(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
