pipeline {
    agent any
   
       stages {

        stage('Build Application for java') {
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
        stage('Create Tomcat Docker Image'){
            steps{
                sh "sudo -S docker build . -t tomcatimage:${env.BUILD_ID}"
                echo "image created successfully"
                }
                
            }
        }
}
    

