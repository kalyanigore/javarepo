pipeline {
    agent any
   
       stages {

        stage('Build Application  java') {
               steps {
                 sh 'mvn -f pom.xml clean package'
                    }
            post {
                success {
                    echo "Now Archiving the Artifacts...."
                    echo "archiveArtifacts artifacts: '**/*.war'"
                }
            }
        }
        stage('Deploy in Staging Environment'){
            steps{
                build job: 'SIT'
 
            }
            
        }
        stage('Create Tomcat image'){
            steps{
                sh "sudo -S docker build . -t tomcatimage:${env.BUILD_ID}"
                echo "image created successfully"
                }
                
            }
        }
}
    

