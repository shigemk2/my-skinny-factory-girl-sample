name := """my-skinny-factory-girl-sample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.skinny-framework" %% "skinny-micro-server" % "1.0.4",
  "org.skinny-framework" %% "skinny-orm"      % "2.0.8",
  "org.skinny-framework" %% "skinny-factory-girl" % "2.0.8" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

