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
                       sh "mvn --version"
                       sh "java -version"
                   }
               }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                   url: "$https://github.com/nirajsinha73/sharedlib.git"
               }
           }
           stage("Running Testcase") {
               steps {
                   sh "mvn -Dusername=$nirajsinha310@gmail.com -DaccessKey=$niraj@73 test"
                  echo "pipeline completed"
               }
           }
       }
   }
}
