@Library('my_sample_demo') _

pipeline {
    agent none
    stages {
        stage('Poll SCM') {
            steps {
                echo 'Hello world Poll SCM'
                pollSCM 'Poll SCM'
            }
        }
        stage('Build') {
            steps {
                echo 'Hello world Build'
                build 'Build'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello world Test'
                testing 'Test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Hello world Deploy'
                deployBuild 'Deploy'
            }
        }
        
    }
}
