resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

addSbtPlugin("com.github.gseitz"                 % "sbt-release"      % "1.0.0")
addSbtPlugin("com.jsuereth"                      % "sbt-pgp"          % "1.0.0")
addSbtPlugin("org.xerial.sbt"                    % "sbt-sonatype"     % "1.1")
addSbtPlugin("com.typesafe.sbt"                  % "sbt-site"         % "1.1.0")
addSbtPlugin("com.novocode"                      % "sbt-ornate"       % "0.5")
addSbtPlugin("com.eed3si9n"                      % "sbt-unidoc"       % "0.3.3")
addSbtPlugin("com.typesafe.sbt"                  % "sbt-ghpages"      % "0.5.4")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "1.1.0")