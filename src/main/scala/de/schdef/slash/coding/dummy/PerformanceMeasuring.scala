package de.schdef.slash.coding.dummy

object PerformanceMeasuring {

  def time(fun: => Unit)  = {
	  val startTime = System.currentTimeMillis()
	  fun
	  val endTime = System.currentTimeMillis()
	  endTime-startTime
  }
  
  def main(args: Array[String]) {
    var i = 0
    while(i < 10) {
	  val t = time {
	    println("Hello")
	  }
	  println(t)
	  i += 1
    }
  }
  
}