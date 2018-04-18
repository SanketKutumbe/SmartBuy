pipeline
{
    agent { docker 'maven:3-alpine' }

    stages
    {
        stage('Compile Stage')
        {
            steps
            {
                withMaven(maven : 'Maven3.5.2') { sh 'mvn clean package -DskipTests' }
            }
        }

       stage(‘Build’) {

            sh ‘docker-compose up elk’
    
        }
    }

}
