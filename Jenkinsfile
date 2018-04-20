pipeline
{
    agent any

    stages
    {
        stage('Compile Stage')
        {
            steps
            {
                withMaven(maven : 'Maven3.5.2') { sh 'mvn clean verify' }
            }
        }

        stage('Testing Stage')
        {
            steps
            {
                withMaven(maven : 'Maven3.5.2') { sh 'mvn test' }
            }
        }

        stage('Deployment Stage')
        {
            steps
            {
                withMaven(maven : 'Maven3.5.2') { sh 'mvn deploy' }
            }
        }
    }

}