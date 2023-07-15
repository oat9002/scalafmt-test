object Main extends App {
  val data = Data("Hello scala")
  println(data.content)
}

case class Data(content: String)
