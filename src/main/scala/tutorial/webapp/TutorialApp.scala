package tutorial.webapp

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


object TestApp {
  def main(args: Array[String]): Unit = {
    println("Hello world!")


    for {
      x <- query().map({
        case Some(x) => x
        case None => "None"
      })
    } yield println(s"$x found")


    for {
      x <- query(id = 1).map({
        case Some(x) => x
        case None => "None"
      })
    } yield println(s"$x found")

  }

  def query(id: Integer = 0): Future[Option[String]] = {
    println(s"Querying $id")

    if (id == 0) {
      Future.successful(None)
    } else {
      Future.successful(Some(s"$id"))
    }
  }
}
