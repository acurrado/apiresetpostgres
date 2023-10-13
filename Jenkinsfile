pipeline {
	agent any

	tools {
	    maven 'jenkins-maven'
		jdk 'java-17'
		docker 'docker-jenkins'
	}

	stages {

		stage('Build'){
			steps {
				sh 'pwd'
				sh 'mvn clean install package'
			}
		}

		stage('Copy Artifact') {
           steps {
                sh 'pwd'
                sh 'cp -r target/*.jar docker'
           }
        }

		stage('Build docker image') {
           steps {
               script {
                 def customImage = docker.build('ruyeri/apirestexample', "./docker")
                 docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
                    customImage.push("1")
                 }
               }
           }
        }
	}
}