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
           stage("Git Checkout Code") {
               steps {
                  echo "Checkout Code started"
                  git  'https://github.com/nirajsinha73/Devops.git'
                  sh 'chmod 777 file.sh'
                  sh './file.sh'
     
                  echo "Checkout Code Completed"
               }
           }
       }
   }
}
