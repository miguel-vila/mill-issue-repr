import mill._, scalalib._

object foo extends Module {
  def scalaVersion = "2.13.11"
  
  case class Output(foo: String)

  object Output {
    implicit val rw: upickle.default.ReadWriter[Output] = upickle.default.macroRW
  }

  def testTask: T[Output] = T.task {
    println("oh no!")
    Output("foo")
  }
}
