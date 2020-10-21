/**
 * Common deploy module
 */

//MPLModule('Openshift Deploy', CFG)

sh '''mvn deploy -DskipTests'''