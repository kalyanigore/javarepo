pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {
                sh 'mvn -f kalyanigore/javarepo/pom.xml clean package'
            }
            post {
                success {
                    "Now Archiving the Artifacts...."
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }
        stage('Deploy in Staging Environment'){
            steps{
                build job: 'SIT'
 
            }
            
        }
        stage('Deploy to Production'){
            steps{
                timeout(time:5, unit:'DAYS'){
                    input message:'Approve PRODUCTION Deployment?'
                }
                build job: 'PROD'
            }
        }
    }
}
