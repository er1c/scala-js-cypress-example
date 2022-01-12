import scala.sys.process.Process

lazy val scala212 = "2.12.15"
lazy val scala213 = "2.13.7"

ThisBuild / organization := "com.evenfinancial"
ThisBuild / scalaVersion := "2.13.7"

ThisBuild / scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-encoding",
  "UTF-8",
  "-Xfatal-warnings",
  "-language:_",
  // Warn when dead code is identified.
  "-Ywarn-dead-code",
  // Warn when numerics are widened.
  "-Ywarn-numeric-widen",
)

lazy val cypress = project
  .in(file("cypress"))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalablyTypedConverterPlugin)
  .settings(
    /* disabled because it somehow triggers many warnings */
    scalaJSLinkerConfig := scalaJSLinkerConfig.value.withSourceMap(false),
    Compile / fastOptJS / webpackDevServerExtraArgs += "--mode=development",
    Compile / fullOptJS / webpackDevServerExtraArgs += "--mode=production",
    Compile / npmDependencies ++= Seq(
      "cypress" -> "8.7.0",
    ),
    scalaJSUseMainModuleInitializer := true,
    //mainClass := Some("Main"),
    useYarn := true,
    run := {
      (Compile / npmInstallDependencies).value
      (Compile / fastOptJS).value
      val cypressRunner: File = (Compile / npmUpdate / crossTarget).value / "node_modules" / ".bin" / "cypress"
      if (Process(s"$cypressRunner run", baseDirectory.value).run().exitValue() != 0) throw new RuntimeException("failed")
    }
  )