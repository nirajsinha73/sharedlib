def call(String repoUrl) {
   pipeline{
       agent any
    
        stages {
           stage("Tools initialization") {
               steps {
                  echo "pipeline started"
                    
                       sh "java -version"
                   }
               }
           stage("Git Checkout ") {
               steps {
                  echo "Checkout Code started"
                  
                  git  'https://github.com/nirajsinha73/Devops.git'
                  
                  sh 'chmod 777 Jenkinsfile'
                  
                  sh 'chmod u+x file.txt'
                  
                  
                  
                  sh './file.txt'
     
                  echo "Checkout Code Completed"
               }
           }
       }
   }
}
