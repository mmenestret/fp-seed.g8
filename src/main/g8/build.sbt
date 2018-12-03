import sbt.Resolver
import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "$organization$",
      scalaVersion := "$scalaVersions$",
      version := "0.1.0-SNAPSHOT"
    )),
  name := "$name$",
  libraryDependencies ++= Seq(
    scalatest % Test,
    cats,
    catsEffect
  ),
  scalacOptions ++= Seq(
    "-encoding",
    "UTF-8", // source files are in UTF-8
    "-deprecation", // warn about use of deprecated APIs
    "-unchecked", // warn about unchecked type parameters
    "-feature", // warn about misused language features
    "-language:higherKinds", // allow higher kinded types without `import scala.language.higherKinds`
    "-Xlint", // enable handy linter warnings
    "-Xfatal-warnings", // turn compiler warnings into errors
    "-Ypartial-unification", // allow the compiler to unify type constructors of different arities
    "-language:implicitConversions"
  ),
  addCompilerPlugin("org.spire-math" %% "kind-projector" % Versions.kindProjectorV),
  addCompilerPlugin("com.olegpy" %% "better-monadic-for" % Versions.betterMonadicForV)
)
