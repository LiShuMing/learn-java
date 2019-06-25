import java.sql.Timestamp
import java.text.SimpleDateFormat

/**
 * @author shuming.lsm
 * @version 2018/11/07
 **/
object TimeDemo {
  var sparkFormatter: SimpleDateFormat = new SimpleDateFormat("yyyyMMdd")

  def evaluate(timestamp: Int): String = {
    try {
      val ts = new Timestamp(timestamp * 1000L)
      return sparkFormatter.format(ts)
    } catch {
      case _: Throwable =>
        return null
    }
  }

  def main(args: Array[String]): Unit = {
    System.out.println(System.currentTimeMillis() / 1000)
    System.out.println(evaluate(1541602617 ))
  }
}
