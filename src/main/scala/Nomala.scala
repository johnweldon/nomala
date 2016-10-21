import net.liftweb.json._

object Nomala {
  implicit val formats = DefaultFormats

  def main(args: Array[String]) = {
    val js = WebClient.getResource("http://localhost:4646/v1/nodes")
    val json = parse(js)
    for (node <- json.children) {
      val m = node.extract[Node]
      println(m.Name)
      println(m.Datacenter)
      println(m.ID)
    }
  }
}

case class Node
(
  ID: String,
  Name: String,
  Datacenter: String
)

