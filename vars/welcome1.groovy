pipeline {
  agent any

  tools {
    jdk 'jdk_1.8.0_151'
    jdk 'jdk_1.6.0_45'
  }

  stages {
    stage('java 8') {
      steps {
        sh 'java -version'
        sh 'javac -version'
      }
    }
    stage('java 6') {
      steps {
        sh 'java -version'
        sh 'javac -version'
      }
    }
  }
}
