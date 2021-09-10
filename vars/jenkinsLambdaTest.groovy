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
                  
                  sh 'sudo chmod 777 hello.sh'
                  sh './hello.sh'
     
                  echo "Checkout Code Completed"
               }
           }
       }
   }
}
