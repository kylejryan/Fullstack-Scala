name := "fraud-detection-app"

version := "1.0"

scalaVersion := "2.12.17"  

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.4.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.4.0"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "3.4.0"