object Nomala {
  def main(args: Array[String]) = {
    println("Hi!")
    println()
    println(WebClient.getResource("http://localhost:4646/v1/nodes"))
  }
}
