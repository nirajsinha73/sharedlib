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
           stage("Checkout Code") {
               steps {
                  echo "Checkout Code started"
                  git  'https://github.com/nirajsinha73/Devops.git'
                  index()
     
                  echo "Checkout Code Completed"
               }
           }
       }
   }
}
