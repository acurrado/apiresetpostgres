pipeline {
	agent any

	tools {
	    maven 'jenkins-maven'
		jdk 'java-17'
	}

	stages {

		stage('Build'){
			steps {
				sh 'pwd'
				sh 'mvn clean install package'
			}
		}

		stage('Test'){
			steps{
				sh "mvn test"
			}
		}
	}
}