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
                  
                  git  'https://github.com/nirajsinha73/NewDemo.git'
                  
                  sh 'chmod 777 shellfile.sh'
                  sh './shellfile.sh'
     
                  echo "Checkout Code Completed"
               }
           }
       }
   }
}
