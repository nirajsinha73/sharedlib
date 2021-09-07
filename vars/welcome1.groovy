pipeline {
  agent any

  tools {
    jdk 'jdk_1.8.0_301'
    
  }

  stages {
    stage('java 8') {
      steps {
        sh 'java -version'
        sh 'javac -version'
      }
    }
    
  }
}
