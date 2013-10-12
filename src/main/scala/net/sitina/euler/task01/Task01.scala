package net.sitina.euler.task01

object Task01 {

  def main(args:Array[String]) = {
    var sum = 0
    for (x <- 1 to 999) {
      if ((x % 3 == 0) || (x % 5 == 0)) {
        sum = sum + x
      }
    }
    print(sum);
  }

}
