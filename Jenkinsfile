pipeline {
    agent { node { label 'gradle' } }

    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
    }

    stages {
        stage('package') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts 'build/libs/*.jar'
            }
        }
    }
}
