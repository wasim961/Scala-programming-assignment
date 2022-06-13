package Assignment

import scala.Console.{out, println}
import scala.io.StdIn.readLine
import scala.collection.mutable
import scala.collection.mutable.Stack
import scala.util.control._

object BracketPairs {
  def areBracketsBalanced(expr: String): Boolean = { // Using ArrayDeque is faster than using Stack class
    val stack = mutable.Stack[Char]()
    val loop = new Breaks;
    // Traversing the Expression

    val exprLen = expr.length

    for (i <- 0 until exprLen) {
      loop.breakable {
        val x = expr.charAt(i)

        if (x == '(' || x == '[' || x == '{') {
          // Push the element in the stack
          stack.push(x)
          loop.break
        }


        // If current character is not opening
        // bracket, then it must be closing. So stack
        // cannot be empty at this point.
        if (stack.isEmpty) return false

        var check: Char = ' ';
        x match {
          case ')' =>
            check = stack.pop
            if (check == '{' || check == '[') return false

          case '}' =>
            check = stack.pop
            if (check == '(' || check == '[') return false

          case ']' =>
            check = stack.pop
            if (check == '(' || check == '{') return false


        }
      }
    }
    // Check Empty Stack
    return stack.isEmpty

  }

  // Driver code
  def main(args: Array[String]): Unit = {
//        val expr = "([{}]))"

    println("Please enter your breaket's:")

    var expre =readLine()
    //    println(expre)
//    val expr = args
    // Function call
    if (areBracketsBalanced(expre))
         System.out.println("Balanced ")
    else System.out.println("Not Balanced ")
  }
}
