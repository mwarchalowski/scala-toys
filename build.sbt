import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.maciejwarchalowski",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT",
      libraryDependencies += scalaTest % Test
    )),
    name := "Toy Examples",
  )


lazy val strings = project
