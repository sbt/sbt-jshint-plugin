lazy val `sbt-jshint` = project in file(".")

description := "Allows JSHint to be used from within sbt"

resolvers += Resolver.sbtPluginRepo("releases") // for sbt-js-engine

libraryDependencies ++= Seq(
  // specs allow [0, 1) but 0.2+ versions want domelementtype > 2 which breaks others
  "org.webjars.npm" % "dom-serializer" % "0.1.1" force(),
  // dom-serializer:0.1.1 wants [1.1.1,2), htmlparser2:3.8.3 wants [1.0,1.1) ...
  "org.webjars.npm" % "entities" % "1.1.1",
  "org.webjars.npm" % "jshint" % "2.10.2" exclude("org.webjars.npm", "entities"),
  "org.webjars" % "strip-json-comments" % "1.0.2-1"
)

addSbtJsEngine("1.2.3")
