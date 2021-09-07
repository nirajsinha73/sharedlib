def call(String repoUrl) {
  pipeline {
       agent any
      
       stages {
           stage("Tools initialization") {
               steps {
                   sh "mvn --version"
                   sh "java -version"
                  echo " done"
               }
           }
       }
  }
 }
           
