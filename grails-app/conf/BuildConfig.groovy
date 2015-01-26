grails.project.work.dir = "target"

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile "org.aspectj:aspectjtools:1.6.10"
        compile 'commons-io:commons-io:2.4'

        compile 'org.codehaus.groovy:groovy-backports-compat23:2.3.5'

    }

    plugins {
//        build ":release:2.2.1", ":rest-client-builder:1.0.3", {
//            export = false
//        }

        build ':release:3.0.1', ':rest-client-builder:1.0.3', {
           export = false
        }

        runtime ":jquery:1.8.3"
        runtime ":resources:1.2.1"
    }
}
