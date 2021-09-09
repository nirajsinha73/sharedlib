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
                 ["git", "clone", "https://github.com/nirajsinha73/hello-world.git"].execute()
                  echo "Checkout Code Completed"
               }
           }
       }
   }
}
