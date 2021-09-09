def call(String repoUrl) {
   pipeline{
       agent any
       tools {
           maven 'Maven 3.5.0'
           jdk 'jdk8'
       }
       environment {
           LAMBDA_TEST_CRED = credentials('f66cb042-8b69-41fc-86ac-5a84102d06f5')
       }
       stages {
           stage("Tools initialization") {
               steps {
                       sh "mvn --version"
                       sh "java -version"
                   }
               }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                   url: "${repoUrl}"
               }
           }
           stage("Running Testcase") {
               steps {
                   sh "mvn -Dusername=${LAMBDA_TEST_CRED_USR} -DaccessKey=${LAMBDA_TEST_CRED_PSW} test"
               }
           }
       }
   }
}
