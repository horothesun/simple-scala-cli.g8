$if(use_scala_3.truthy)$//> using scala 3.7.1
$else$//> using scala 2.13.16
$endif$
$if(use_scala_native.truthy)$//> using platform native
//> using nativeVersion 0.4.17
//
//> using dep org.typelevel::cats-core_native0.4:2.11.0
//> using dep org.typelevel::kittens_native0.4:3.3.0
//> using dep org.typelevel::cats-parse_native0.4:1.0.0
//> using dep org.typelevel::cats-effect_native0.4:3.5.7
//> using dep co.fs2::fs2-core_native0.4:3.11.0
//
//> using test.dep org.scalameta::munit_native0.4:1.0.0
//> using test.dep org.typelevel::munit-cats-effect_native0.4:2.1.0
//> using test.dep org.scalameta::munit-scalacheck_native0.4:1.0.0-M11
//> using test.dep org.scalacheck::scalacheck_native0.4:1.17.1
//> using test.dep org.typelevel::scalacheck-effect-munit_native0.4:2.0.0-M2
//> using test.dep org.typelevel::cats-effect-testkit_native0.4:3.6.0
//> using test.dep org.typelevel::cats-laws_native0.4:2.11.0
//> using test.dep org.typelevel::discipline-core_native0.4:1.6.0
//> using test.dep org.typelevel::discipline-munit_native0.4:2.0.0-M3
//
$else$//> using jvm temurin:21
//
//> using dep org.typelevel::cats-core:2.13.0
//> using dep org.typelevel::kittens:3.5.0
//> using dep org.typelevel::cats-parse:1.1.0
//> using dep org.typelevel::cats-effect:3.6.0
//> using dep co.fs2::fs2-core:3.12.0
//> using dep io.higherkindness::droste-core:0.10.0
//
//> using test.dep org.scalameta::munit:1.1.0
//> using test.dep org.typelevel::munit-cats-effect:2.1.0
//> using test.dep org.scalameta::munit-scalacheck:1.1.0
//> using test.dep org.scalacheck::scalacheck:1.18.1
//> using test.dep org.typelevel::scalacheck-effect-munit:1.0.4
//> using test.dep org.typelevel::cats-effect-testkit:3.6.0
//> using test.dep org.typelevel::cats-laws:2.13.0
//> using test.dep org.typelevel::discipline-core:1.7.0
//> using test.dep org.typelevel::discipline-munit:2.0.0
//
$endif$
$if(use_scala_3.truthy)$import cats.effect.*

object Main extends IOApp.Simple:

  def run: IO[Unit] = IO.println("Hello!")
$else$import cats.effect._

object Main extends IOApp.Simple {

  def run: IO[Unit] = IO.println("Hello!")

}
$endif$
