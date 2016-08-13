import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object MyApp {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Hello Spark")
    val sc = new SparkContext(conf)
    sc.setLogLevel("WARN")
    println("App Name: " + sc.appName)
  }
}
