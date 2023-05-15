# Markdown Plugin for JSPWiki
[JSPWiki](https://jspwiki.apache.org/) v2.10.1+  
GitLab flavored commonmark 

## Usage

```
[{md

### This is *markdown*
}]
```

## Install

1. download the jar from /bin into `${JSPWIKI_HOME}/WEB-INF/lib/`

2. edit the comma-delimited ``jspwiki.plugin.searchPath`` in `${JSPWIKI_HOME}/WEB-INF/jspwiki-custom.properties` to include the package designation of the plugin
```properties
jspwiki.plugin.searchPath = hu.pmamico.jspwiki.plugin
```
3. restart JSPWiki (or restart Tomcat)


## Build
```shell
mvn clean compile assembly:single antrun:run
```

## Upcoming

Rendering external files from the web, like
```
[{md url='....README.md'}]
```
probably about june 2023.
