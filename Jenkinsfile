pipeline {
    agent any
    stages {
        stage('Compile and Clean') {
            steps {
            sh "mvn clean compile"
            }
        }


        stage('deploy') {
            steps {
                sh "mvn package"
            }
        }


        stage('Build Docker image'){
            steps {

                sh 'docker build -t  lala14/demo-employee:${BUILD_NUMBER} .'
            }
        }

        stage('Docker Login'){

            steps {
                withCredentials([string(credentialsId: 'Docker_id', variable: 'DockerPassword')]) {
                    sh "docker login -u lala14 -p ${DockerPassword}"
                }
            }
        }

        stage('Docker Push'){
            steps {
                sh 'docker push lala14/demo-employee:${BUILD_NUMBER}'
            }
        }

        stage('Docker deploy'){
            steps {

                sh 'docker run -itd -p  2020:2020 lala14/demo-employee:${BUILD_NUMBER}'
            }
        }


        stage('Archving') {
            steps {
                 archiveArtifacts '**/target/*.jar'
            }
        }
    }
}