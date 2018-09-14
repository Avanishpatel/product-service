pipeline {
    agent any
    // { label 'master' }
    stages {
        stage ('Clone') {
            steps{
        git url: 'https://github.com/Avanishpatel/Lab02.git'
             }
        }
       stage('Build') {
          steps {
             sh 'gradle clean compileJava'
             sh './gradlew clean build'
          }
       }
       stage('Test'){
           steps{
               sh './gradlew test'
           }
       }
       stage('Deploy'){
           steps{
               sh 'cf push testservice -p ./build/libs/stock-data-persistant-query-0.0.1-SNAPSHOT.jar --no-start'
           }
       }
    }
}