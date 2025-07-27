pipeline {
  agent any

  tools {
    maven 'maven'       // Name defined in Jenkins → Global Tool Configuration
    jdk 'jdk-17'        // Optional: Name of JDK in Jenkins config
  }

  stages {
    stage('Clone Repo') {
      steps {
        git credentialsId: 'github-chio', url: 'https://github.com/manipanw143/javamvmtest.git'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Archive Artifacts') {
      steps {
        archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
      }
    }
  }

  post {
    success {
      echo '✅ Build and tests successful!'
    }
    failure {
      echo '❌ Build failed.'
    }
  }
}
