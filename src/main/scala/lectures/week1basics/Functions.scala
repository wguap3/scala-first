package lectures.week1basics

object Functions {
  def main(args:Array[String]): Unit = {
    println(aPerson("John", "Smith"))
    aPerson("John", "Smith")
    aParameterlessFunction()
    println(aFunctionWithDefaultParameter(1))
    callByValue(System.nanoTime())
    callByName(System.nanoTime())
  }

  def aPerson(name: String, surname: String): String = {
    s"$name $surname"
  }

  def aPersonUnit(name: String, surname: String): Unit = {
    println(s"$name $surname")
  }

  def aParameterlessFunction(): Unit = println("Function with no parameters")

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }

  // высчитывается до функциии в сигнатуре
  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  //высчитывается прям в функции
  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
