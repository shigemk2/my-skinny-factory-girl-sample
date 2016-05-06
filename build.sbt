name := """my-skinny-factory-girl-sample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.skinny-framework" %% "skinny-orm"      % "2.0.8",
  "com.h2database"       %  "h2"              % "1.4.+",
  "ch.qos.logback"       %  "logback-classic" % "1.1.+",
  "mysql" % "mysql-connector-java" % "5.1.16",
  "org.skinny-framework" %% "skinny-factory-girl" % "2.0.8" % "test",
  "org.scalikejdbc"   %% "scalikejdbc-test" % "2.2.+"   % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

initialCommands := """
import scalikejdbc._
import skinny.orm._, feature._
import org.joda.time._
skinny.DBSettings.initialize()
implicit val session = AutoSession
                   """

