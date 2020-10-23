/**
 * Common deploy module
 */

//MPLModule('Openshift Deploy', CFG)
withEnv(['nexus_url=10.0.2.2']) {
    echo 'nexus url = ${nexus_url}'
    sh 'mvn deploy -DskipTests -Dnexus_url=${nexus_url}'
}
