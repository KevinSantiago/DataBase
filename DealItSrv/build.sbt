name := "DealItSrv"

version := "1.0"

lazy val `dealitsrv` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc ,javaJdbc, cache , ws   , specs2 % Test, "org.postgresql" % "postgresql" % "9.3-1102-jdbc41" )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

