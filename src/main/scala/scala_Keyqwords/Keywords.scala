package scala_Keyqwords

object Keywords {
   // Here class keyword is used to create a new class
   // def keyword is used to create Function
   // var keyword is used to create a variable
      class GFG {
         var name = "Alex";
         var age = 35;
         var branch = "cse";

         def show(): Unit = {
            println("my name is " + name + " and my age is " + age);
            println("my branch is " + branch);
         }
      }
   // object keyword is used to define
   // an object new keyword is used to
   // create an object of the given class
         def main(args: Array[String]): Unit ={
            var obj = new GFG();
            obj.show();
      }

}
