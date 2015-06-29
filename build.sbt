lazy val `sbt-jshint` = project in file(".")
description := "sbt-web jshint plugin"

libraryDependencies ++= Seq(
  "org.webjars" % "jshint-node" % "2.4.3",
  "org.webjars" % "strip-json-comments" % "1.0.2-1"
)

addSbtJsEngine("1.1.3")
