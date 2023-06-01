name := "fraud-detection-app"

version := "1.0"

scalaVersion := "2.12.17"  

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.4.0" excludeAll(ExclusionRule("org.slf4j"), ExclusionRule("log4j")),
  "org.apache.spark" %% "spark-sql" % "3.4.0" excludeAll(ExclusionRule("org.slf4j"), ExclusionRule("log4j")),
  "org.apache.spark" %% "spark-mllib" % "3.4.0" excludeAll(ExclusionRule("org.slf4j"), ExclusionRule("log4j"))
)


//libraryDependencies += "org.apache.spark" %% "spark-core" % "3.4.0"
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.4.0"
//libraryDependencies += "org.apache.spark" %% "spark-mllib" % "3.4.0"

dependencyOverrides += "org.scala-lang.modules" %% "scala-xml" % "2.1.0"
dependencyOverrides += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"
dependencyOverrides ++= Seq(
  "com.google.inject" % "guice" % "5.1.0",
  "com.google.inject.extensions" % "guice-assistedinject" % "5.1.0")

javaOptions ++= Seq(
  "--add-opens",
  "java.base/java.lang=ALL-UNNAMED"
)



