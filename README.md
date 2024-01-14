# FactionExtender

This Java Library allows you to write extensions for FuseSoft Faction. Once a module is created it only needs to be placed in /opt/faction/modules/ directory along with any library dependencies. 

Tutorial can be found here:

https://docs.factionsecurity.com
### To Build a Faction extension you need to follow these steps:
1. Update your `~/.m2/settings.xml` file to include the following:
   _this will allow `maven` to have access to this git bug repo_
```
<settings>
    <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>
   <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/factionsecurity/FactionExtender</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>
</settings>
```
2. Add the folowing lines to your project dependencies pom.xml.
```
<dependency>
  <groupId>FactionSecurity</groupId>
  <artifactId>faction-extender</artifactId>
  <version>1.9</version>
</dependency>
```

Thanks it! You can now start developing your own plugins. More information about writing a Faction Plugin Can be found here: https://www.fusesoftsecurity.com/manual/faction-extension-api/

