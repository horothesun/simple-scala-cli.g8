$if(use_scala_3.truthy)$
//> using scala 3.4.2
$else$
//> using scala 2.13.14
$endif$
//> using jvm temurin:21

//> using dep org.typelevel::cats-core:2.12.0
//> using dep org.typelevel::kittens:3.3.0
//> using dep org.typelevel::cats-parse:1.0.0
//> using dep org.typelevel::cats-effect:3.5.4
//> using dep co.fs2::fs2-core:3.10.2
//> using dep io.higherkindness::droste-core:0.9.0

//> using test.dep org.typelevel::cats-laws:2.12.0
//> using test.dep org.scalameta::munit:1.0.0
//> using test.dep org.typelevel::munit-cats-effect:2.0.0
//> using test.dep org.scalameta::munit-scalacheck:1.0.0
//> using test.dep org.typelevel::cats-effect-testkit:3.5.4
//> using test.dep org.typelevel::discipline-munit:2.0.0

$if(use_scala_3.truthy)$
import cats.effect.*

object Main extends IOApp.Simple:
  def run: IO[Unit] = IO.println("Hello!")
$else$
import cats.effect._

object Main extends IOApp.Simple {
  def run: IO[Unit] = IO.println("Hello!")
}
$endif$
