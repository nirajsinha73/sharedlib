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
                 
                  echo "Checkout Code Completed"
               }
           }
           stage("Running Testcase") {
               steps {
                   sh "test"
                  echo "pipeline completed"
               }
           }
       }
   }
}
