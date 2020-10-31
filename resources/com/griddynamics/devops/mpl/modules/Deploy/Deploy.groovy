/**
 * Common deploy module
 */

//MPLModule('Openshift Deploy', CFG)
/*//withEnv(['nexus_url=10.0.2.2',"build_version=${BUILD_NUMBER}"]) {
    echo 'build number= ${build_version}'
    echo "nexus url = ${nexus_url}"
//    sh 'mvn deploy -DskipTests -Dnexus_url=${nexus_url} -Dbuild_version=$build_version'
//}*/
//sh "mvn deploy -DskipTests -Dnexus_url=10.0.2.2 -Dbuild_version=${BUILD_NUMBER}"

sh "mvn deploy -DskipTests -Dnexus_url=10.0.2.2"
