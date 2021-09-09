def call(String repoUrl) {
   pipeline{
       agent any
    
       environment {
           LAMBDA_TEST_CRED = credentials('f66cb042-8b69-41fc-86ac-5a84102d06f5')
       }
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
