import sbt._

object Dependencies {
  val scalaLoggingV = "3.9.0"
  val slf4jV = "1.7.25"
  val catsV = "1.5.0"
  val pureconfigV = "0.9.2"
  val scalatestV = "3.0.5"
  val catsEffectV = "1.0.0"

  lazy val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingV
  lazy val pureconfig = "com.github.pureconfig" %% "pureconfig" % pureconfigV
  lazy val scalatest = "org.scalatest" %% "scalatest" % scalatestV
  lazy val cats = "org.typelevel" %% "cats-core" % catsV
  lazy val catsEffect = "org.typelevel" %% "cats-effect" % catsEffectV
}
