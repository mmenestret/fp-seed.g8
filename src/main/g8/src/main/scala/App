import cats.effect._
import cats.implicits._

object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    IO.delay(println("Hi")) *> ExitCode.Success.pure[IO]
}
