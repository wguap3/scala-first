package lectures.week1basics

object StringOperations {
  def main(args:Array[String]): Unit = {
    val asString: String = "Scala course"
    println(asString.length)
    println(asString.charAt(11))
    println(asString.reverse)
    println(asString.substring(0,5))
    println(asString.take(5))
  }
}
