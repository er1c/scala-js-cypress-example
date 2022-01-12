{
  val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.8.0")
  addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
}

addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta37")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.20.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.2")
