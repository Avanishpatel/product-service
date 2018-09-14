pipeline {
    agent any
    // { label 'master' }
    stages {
        stage ('Clone') {
            steps{
        git url: 'https://github.com/Avanishpatel/product-service.git'
             }
        }
       stage('Build') {
          steps {
             sh 'gradle clean compileJava'
             sh './gradlew clean build'
          }
       }

       
    }
}