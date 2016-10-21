import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils

object WebClient {
  def getResource(url: String): String = {
    val cl = HttpClients.createDefault()
    val gr = new HttpGet(url)
    val resp = cl.execute(gr)
    return EntityUtils.toString(resp.getEntity())
  }

}
