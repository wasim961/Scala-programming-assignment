package Assignment

import scala.Console.println
import scala.io.Source.DefaultBufSize.%
import scala.io.StdIn.{readInt, readLine}

object PrimeFactors {
def main(args:Array[String]): Unit ={
  println("Please enter numbers:")
  var num =readInt()
  primeFactor(num)
//  var arr:Array[Int] = Array()
//  var n : Int = 0
//  for(i <- 1 to num){
//       if(num%i==0){
//            var res : Boolean  = (i>1) && !(2 to math.sqrt(i).toInt).exists(x => i % x == 0)
//         if(res){
//       println("prime factors : "+i)
//    }
//
//  }
//  }

  def primeFactor(n : Int): Unit ={
    var i : Int = 2
    println("prime factors are : ")
    for(i <- 2 until num){
      while(num%i == 0){
        println(i)
        num/=i

      }
    }
    if(num>2){
      println(num)
    }
  }

}
}
